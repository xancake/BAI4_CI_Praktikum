package org.haw.cip.praktikum4.symbolraetsel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import org.haw.cip.praktikum3.symbolraetsel.SymbolraetselLexer;
import org.haw.cip.praktikum3.symbolraetsel.SymbolraetselParser;
import org.haw.cip.praktikum3.symbolraetsel.SymbolraetselTreeWalker;

public class SymbolraetselMain {
	private static final String TEMPLATE_FILE = "symbolraetsel/praktikum4/template.stg";
	
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		if(args.length != 1) {
			System.out.println("Es muss ein Dateiname angegeben werden!");
			System.exit(1);
		}
		
		ANTLRInputStream input = new ANTLRInputStream(getInputStream(args[0]));
		SymbolraetselLexer lexer = new SymbolraetselLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SymbolraetselParser parser = new SymbolraetselParser(tokens);
		SymbolraetselParser.riddle_return parser_r = parser.riddle();
		CommonTree ast = (CommonTree)parser_r.getTree();
		System.out.println(ast.toStringTree());
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
		SymbolraetselTreeWalker walker = new SymbolraetselTreeWalker(nodes);
		SymbolraetselTreeWalker.riddle_return walker_r = walker.riddle();
		CommonTree modifiedAST = (CommonTree)walker_r.getTree();
		System.out.println(modifiedAST.toStringTree());
		
		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(modifiedAST);
		nodes2.setTokenStream(tokens);
		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);
		emitter.setTemplateLib(new StringTemplateGroup(new InputStreamReader(getInputStream(TEMPLATE_FILE), "ISO-8859-15"), AngleBracketTemplateLexer.class));
		SymbolraetselEmitter.riddle_return emitter_r = emitter.riddle();
		System.out.println();
		System.out.println(emitter_r.getTemplate().toString());
	}
	
	private static InputStream getInputStream(String path) throws FileNotFoundException, IOException {
		File file = new File(path);
		if(file.isAbsolute()) {
			if(!file.isFile()) {
				throw new IllegalArgumentException("Der übergebene Dateiname muss eine Datei beschreiben (darf also z.B. kein Ordner sein).");
			}
			return new FileInputStream(path);
		} else {
			return ClassLoader.getSystemResourceAsStream(path);
		}
	}
}
