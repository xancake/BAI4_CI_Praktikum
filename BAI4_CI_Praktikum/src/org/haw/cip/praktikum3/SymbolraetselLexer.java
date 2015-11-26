package org.haw.cip.praktikum3;
// $ANTLR 3.4 Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g 2015-11-26 12:35:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int EQ=4;
    public static final int OP=5;
    public static final int VALUE=6;
    public static final int VALUELETTER=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolraetselLexer() {} 
    public SymbolraetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g"; }

    // $ANTLR start "VALUELETTER"
    public final void mVALUELETTER() throws RecognitionException {
        try {
            int _type = VALUELETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:27:13: ( ( 'A' .. 'Z' ) )
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUELETTER"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:28:5: ( ( '+' | '-' ) )
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:29:5: ( '=' )
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:29:7: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:31:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:31:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:1:8: ( VALUELETTER | OP | EQ | WS )
        int alt1=4;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt1=1;
            }
            break;
        case '+':
        case '-':
            {
            alt1=2;
            }
            break;
        case '=':
            {
            alt1=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:1:10: VALUELETTER
                {
                mVALUELETTER(); 


                }
                break;
            case 2 :
                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:1:22: OP
                {
                mOP(); 


                }
                break;
            case 3 :
                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:1:25: EQ
                {
                mEQ(); 


                }
                break;
            case 4 :
                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:1:28: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}