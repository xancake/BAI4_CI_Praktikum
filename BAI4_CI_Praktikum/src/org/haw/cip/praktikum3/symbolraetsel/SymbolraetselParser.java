// $ANTLR 3.4 D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g 2015-12-15 13:07:39
package org.haw.cip.praktikum3.symbolraetsel;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "EQ", "SUB", "SYMBOL", "VALUE", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int EQ=5;
    public static final int SUB=6;
    public static final int SYMBOL=7;
    public static final int VALUE=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SymbolraetselParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolraetselParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g"; }


    public static class riddle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:14:1: riddle : a1= value a1h= op a2= value EQ a3= value a1v= op a2v= op a3v= op b1= value b1h= op b2= value EQ b3= value EQ EQ EQ c1= value c1h= op c2= value EQ c3= value -> ^( EQ ^( $a1h $a1 $a2) $a3) ^( EQ ^( $b1h $b1 $b2) $b3) ^( EQ ^( $c1h $c1 $c2) $c3) ^( EQ ^( $a1v $a1 $b1) $c1) ^( EQ ^( $a2v $a2 $b2) $c2) ^( EQ ^( $a3v $a3 $b3) $c3) ;
    public final SymbolraetselParser.riddle_return riddle() throws RecognitionException {
        SymbolraetselParser.riddle_return retval = new SymbolraetselParser.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ1=null;
        Token EQ2=null;
        Token EQ3=null;
        Token EQ4=null;
        Token EQ5=null;
        Token EQ6=null;
        SymbolraetselParser.value_return a1 =null;

        SymbolraetselParser.op_return a1h =null;

        SymbolraetselParser.value_return a2 =null;

        SymbolraetselParser.value_return a3 =null;

        SymbolraetselParser.op_return a1v =null;

        SymbolraetselParser.op_return a2v =null;

        SymbolraetselParser.op_return a3v =null;

        SymbolraetselParser.value_return b1 =null;

        SymbolraetselParser.op_return b1h =null;

        SymbolraetselParser.value_return b2 =null;

        SymbolraetselParser.value_return b3 =null;

        SymbolraetselParser.value_return c1 =null;

        SymbolraetselParser.op_return c1h =null;

        SymbolraetselParser.value_return c2 =null;

        SymbolraetselParser.value_return c3 =null;


        CommonTree EQ1_tree=null;
        CommonTree EQ2_tree=null;
        CommonTree EQ3_tree=null;
        CommonTree EQ4_tree=null;
        CommonTree EQ5_tree=null;
        CommonTree EQ6_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:14:9: (a1= value a1h= op a2= value EQ a3= value a1v= op a2v= op a3v= op b1= value b1h= op b2= value EQ b3= value EQ EQ EQ c1= value c1h= op c2= value EQ c3= value -> ^( EQ ^( $a1h $a1 $a2) $a3) ^( EQ ^( $b1h $b1 $b2) $b3) ^( EQ ^( $c1h $c1 $c2) $c3) ^( EQ ^( $a1v $a1 $b1) $c1) ^( EQ ^( $a2v $a2 $b2) $c2) ^( EQ ^( $a3v $a3 $b3) $c3) )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:14:11: a1= value a1h= op a2= value EQ a3= value a1v= op a2v= op a3v= op b1= value b1h= op b2= value EQ b3= value EQ EQ EQ c1= value c1h= op c2= value EQ c3= value
            {
            pushFollow(FOLLOW_value_in_riddle53);
            a1=value();

            state._fsp--;

            stream_value.add(a1.getTree());

            pushFollow(FOLLOW_op_in_riddle57);
            a1h=op();

            state._fsp--;

            stream_op.add(a1h.getTree());

            pushFollow(FOLLOW_value_in_riddle61);
            a2=value();

            state._fsp--;

            stream_value.add(a2.getTree());

            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_riddle63);  
            stream_EQ.add(EQ1);


            pushFollow(FOLLOW_value_in_riddle67);
            a3=value();

            state._fsp--;

            stream_value.add(a3.getTree());

            pushFollow(FOLLOW_op_in_riddle73);
            a1v=op();

            state._fsp--;

            stream_op.add(a1v.getTree());

            pushFollow(FOLLOW_op_in_riddle77);
            a2v=op();

            state._fsp--;

            stream_op.add(a2v.getTree());

            pushFollow(FOLLOW_op_in_riddle81);
            a3v=op();

            state._fsp--;

            stream_op.add(a3v.getTree());

            pushFollow(FOLLOW_value_in_riddle87);
            b1=value();

            state._fsp--;

            stream_value.add(b1.getTree());

            pushFollow(FOLLOW_op_in_riddle91);
            b1h=op();

            state._fsp--;

            stream_op.add(b1h.getTree());

            pushFollow(FOLLOW_value_in_riddle95);
            b2=value();

            state._fsp--;

            stream_value.add(b2.getTree());

            EQ2=(Token)match(input,EQ,FOLLOW_EQ_in_riddle97);  
            stream_EQ.add(EQ2);


            pushFollow(FOLLOW_value_in_riddle101);
            b3=value();

            state._fsp--;

            stream_value.add(b3.getTree());

            EQ3=(Token)match(input,EQ,FOLLOW_EQ_in_riddle105);  
            stream_EQ.add(EQ3);


            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_riddle107);  
            stream_EQ.add(EQ4);


            EQ5=(Token)match(input,EQ,FOLLOW_EQ_in_riddle109);  
            stream_EQ.add(EQ5);


            pushFollow(FOLLOW_value_in_riddle115);
            c1=value();

            state._fsp--;

            stream_value.add(c1.getTree());

            pushFollow(FOLLOW_op_in_riddle119);
            c1h=op();

            state._fsp--;

            stream_op.add(c1h.getTree());

            pushFollow(FOLLOW_value_in_riddle123);
            c2=value();

            state._fsp--;

            stream_value.add(c2.getTree());

            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_riddle125);  
            stream_EQ.add(EQ6);


            pushFollow(FOLLOW_value_in_riddle129);
            c3=value();

            state._fsp--;

            stream_value.add(c3.getTree());

            // AST REWRITE
            // elements: EQ, b2, b3, a3, b3, a2, a3v, b1h, c2, EQ, EQ, a1, EQ, c1, EQ, EQ, a1v, c1h, a3, a1, b2, a2v, b1, c1, b1, a2, c3, c2, a1h, c3
            // token labels: 
            // rule labels: a2v, a3v, a1v, c1, retval, c2, b1, b2, a1, c3, b3, a2, a3, b1h, a1h, c1h
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_a2v=new RewriteRuleSubtreeStream(adaptor,"rule a2v",a2v!=null?a2v.tree:null);
            RewriteRuleSubtreeStream stream_a3v=new RewriteRuleSubtreeStream(adaptor,"rule a3v",a3v!=null?a3v.tree:null);
            RewriteRuleSubtreeStream stream_a1v=new RewriteRuleSubtreeStream(adaptor,"rule a1v",a1v!=null?a1v.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);
            RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);
            RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_b3=new RewriteRuleSubtreeStream(adaptor,"rule b3",b3!=null?b3.tree:null);
            RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.tree:null);
            RewriteRuleSubtreeStream stream_a3=new RewriteRuleSubtreeStream(adaptor,"rule a3",a3!=null?a3.tree:null);
            RewriteRuleSubtreeStream stream_b1h=new RewriteRuleSubtreeStream(adaptor,"rule b1h",b1h!=null?b1h.tree:null);
            RewriteRuleSubtreeStream stream_a1h=new RewriteRuleSubtreeStream(adaptor,"rule a1h",a1h!=null?a1h.tree:null);
            RewriteRuleSubtreeStream stream_c1h=new RewriteRuleSubtreeStream(adaptor,"rule c1h",c1h!=null?c1h.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 19:3: -> ^( EQ ^( $a1h $a1 $a2) $a3) ^( EQ ^( $b1h $b1 $b2) $b3) ^( EQ ^( $c1h $c1 $c2) $c3) ^( EQ ^( $a1v $a1 $b1) $c1) ^( EQ ^( $a2v $a2 $b2) $c2) ^( EQ ^( $a3v $a3 $b3) $c3)
            {
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:20:3: ^( EQ ^( $a1h $a1 $a2) $a3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:20:8: ^( $a1h $a1 $a2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a1h.nextNode(), root_2);

                adaptor.addChild(root_2, stream_a1.nextTree());

                adaptor.addChild(root_2, stream_a2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_a3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:21:3: ^( EQ ^( $b1h $b1 $b2) $b3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:21:8: ^( $b1h $b1 $b2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_b1h.nextNode(), root_2);

                adaptor.addChild(root_2, stream_b1.nextTree());

                adaptor.addChild(root_2, stream_b2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_b3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:22:3: ^( EQ ^( $c1h $c1 $c2) $c3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:22:8: ^( $c1h $c1 $c2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_c1h.nextNode(), root_2);

                adaptor.addChild(root_2, stream_c1.nextTree());

                adaptor.addChild(root_2, stream_c2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_c3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:23:3: ^( EQ ^( $a1v $a1 $b1) $c1)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:23:8: ^( $a1v $a1 $b1)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a1v.nextNode(), root_2);

                adaptor.addChild(root_2, stream_a1.nextTree());

                adaptor.addChild(root_2, stream_b1.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_c1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:24:3: ^( EQ ^( $a2v $a2 $b2) $c2)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:24:8: ^( $a2v $a2 $b2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a2v.nextNode(), root_2);

                adaptor.addChild(root_2, stream_a2.nextTree());

                adaptor.addChild(root_2, stream_b2.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_c2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:25:3: ^( EQ ^( $a3v $a3 $b3) $c3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:25:8: ^( $a3v $a3 $b3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_a3v.nextNode(), root_2);

                adaptor.addChild(root_2, stream_a3.nextTree());

                adaptor.addChild(root_2, stream_b3.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_c3.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "riddle"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:28:1: value : ( SYMBOL )+ -> ^( VALUE ( SYMBOL )+ ) ;
    public final SymbolraetselParser.value_return value() throws RecognitionException {
        SymbolraetselParser.value_return retval = new SymbolraetselParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SYMBOL7=null;

        CommonTree SYMBOL7_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:28:7: ( ( SYMBOL )+ -> ^( VALUE ( SYMBOL )+ ) )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:28:9: ( SYMBOL )+
            {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:28:9: ( SYMBOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYMBOL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:28:9: SYMBOL
            	    {
            	    SYMBOL7=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_value263);  
            	    stream_SYMBOL.add(SYMBOL7);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: SYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 28:17: -> ^( VALUE ( SYMBOL )+ )
            {
                // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:28:20: ^( VALUE ( SYMBOL )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VALUE, "VALUE")
                , root_1);

                if ( !(stream_SYMBOL.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYMBOL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_SYMBOL.nextNode()
                    );

                }
                stream_SYMBOL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:29:1: op : ( ADD | SUB );
    public final SymbolraetselParser.op_return op() throws RecognitionException {
        SymbolraetselParser.op_return retval = new SymbolraetselParser.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:29:4: ( ADD | SUB )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\Symbolraetsel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set8=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set8)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_value_in_riddle53 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_op_in_riddle57 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_riddle63 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle67 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_op_in_riddle73 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_op_in_riddle77 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_op_in_riddle81 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle87 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_op_in_riddle91 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle95 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_riddle97 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_riddle105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_riddle107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_riddle109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle115 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_op_in_riddle119 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQ_in_riddle125 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_value263 = new BitSet(new long[]{0x0000000000000082L});

}