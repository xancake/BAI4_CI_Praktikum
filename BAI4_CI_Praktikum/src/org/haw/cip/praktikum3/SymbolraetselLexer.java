// $ANTLR 3.4 D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g 2015-12-15 13:07:39
package org.haw.cip.praktikum3;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQ=5;
    public static final int SUB=6;
    public static final int SYMBOL=7;
    public static final int VALUE=8;
    public static final int WS=9;

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
    public String getGrammarFileName() { return "D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g"; }

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            int _type = SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:31:8: ( ( 'A' .. 'Z' ) )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:
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
    // $ANTLR end "SYMBOL"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:32:6: ( '+' )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:32:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:33:6: ( '-' )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:33:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:34:5: ( '=' )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:34:7: '='
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
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:36:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:36:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:1:8: ( SYMBOL | ADD | SUB | EQ | WS )
        int alt1=5;
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
            {
            alt1=2;
            }
            break;
        case '-':
            {
            alt1=3;
            }
            break;
        case '=':
            {
            alt1=4;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:1:10: SYMBOL
                {
                mSYMBOL(); 


                }
                break;
            case 2 :
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:1:17: ADD
                {
                mADD(); 


                }
                break;
            case 3 :
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:1:21: SUB
                {
                mSUB(); 


                }
                break;
            case 4 :
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:1:25: EQ
                {
                mEQ(); 


                }
                break;
            case 5 :
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:1:28: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}