package org.haw.cip.praktikum3.symbolraetsel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class SymbolraetselMain {
	private static final String DEFAULT_PARSE_FILE = "symbolraetsel/example/example-positive 1 - formatiert.txt";
	
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		String parseFileName = getParseFileName(args);
		
		ANTLRInputStream input = new ANTLRInputStream(getInputStream(parseFileName));
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
	}
	
	private static String getParseFileName(String... args) {
		switch(args.length) {
			case 0:  return DEFAULT_PARSE_FILE;
			case 1:  return args[0];
			default: throw new IllegalArgumentException("Es darf nur EIN Dateiname oder gar nichts angegeben werden!");
		}
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
