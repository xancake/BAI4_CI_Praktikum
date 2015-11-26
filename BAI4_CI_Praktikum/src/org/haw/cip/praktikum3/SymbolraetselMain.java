package org.haw.cip.praktikum3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class SymbolraetselMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		if(args.length != 1) {
			System.out.println("Es muss ein Dateiname angegeben werden!");
			System.exit(1);
		}
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
		SymbolraetselLexer lexer = new SymbolraetselLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SymbolraetselParser parser = new SymbolraetselParser(tokens);
		
		SymbolraetselParser.riddle_return r = parser.riddle();
		
		CommonTree tree = (CommonTree)r.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		
		
	}
}
