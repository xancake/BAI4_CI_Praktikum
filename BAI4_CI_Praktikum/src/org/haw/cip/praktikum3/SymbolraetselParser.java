package org.haw.cip.praktikum3;
// $ANTLR 3.4 Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g 2015-11-26 12:35:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQ", "OP", "VALUE", "VALUELETTER", "WS"
    };

    public static final int EOF=-1;
    public static final int EQ=4;
    public static final int OP=5;
    public static final int VALUE=6;
    public static final int VALUELETTER=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g"; }


    public static class riddle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:11:1: riddle : a1= value a1h= OP a2= value EQ a3= value a1v= OP a2v= OP a3v= OP b1= value b1h= OP b2= value EQ b3= value EQ EQ EQ c1= value c1h= OP c2= value EQ c3= value -> ^( EQ ^( $a1h $a1 $a2) $a3) ^( EQ ^( $b1h $b1 $b2) $b3) ^( EQ ^( $c1h $c1 $c2) $c3) ^( EQ ^( $a1v $a1 $b1) $c1) ^( EQ ^( $a2v $a2 $b2) $c2) ^( EQ ^( $a3v $a3 $b3) $c3) ;
    public final SymbolraetselParser.riddle_return riddle() throws RecognitionException {
        SymbolraetselParser.riddle_return retval = new SymbolraetselParser.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a1h=null;
        Token a1v=null;
        Token a2v=null;
        Token a3v=null;
        Token b1h=null;
        Token c1h=null;
        Token EQ1=null;
        Token EQ2=null;
        Token EQ3=null;
        Token EQ4=null;
        Token EQ5=null;
        Token EQ6=null;
        SymbolraetselParser.value_return a1 =null;

        SymbolraetselParser.value_return a2 =null;

        SymbolraetselParser.value_return a3 =null;

        SymbolraetselParser.value_return b1 =null;

        SymbolraetselParser.value_return b2 =null;

        SymbolraetselParser.value_return b3 =null;

        SymbolraetselParser.value_return c1 =null;

        SymbolraetselParser.value_return c2 =null;

        SymbolraetselParser.value_return c3 =null;


        CommonTree a1h_tree=null;
        CommonTree a1v_tree=null;
        CommonTree a2v_tree=null;
        CommonTree a3v_tree=null;
        CommonTree b1h_tree=null;
        CommonTree c1h_tree=null;
        CommonTree EQ1_tree=null;
        CommonTree EQ2_tree=null;
        CommonTree EQ3_tree=null;
        CommonTree EQ4_tree=null;
        CommonTree EQ5_tree=null;
        CommonTree EQ6_tree=null;
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:11:9: (a1= value a1h= OP a2= value EQ a3= value a1v= OP a2v= OP a3v= OP b1= value b1h= OP b2= value EQ b3= value EQ EQ EQ c1= value c1h= OP c2= value EQ c3= value -> ^( EQ ^( $a1h $a1 $a2) $a3) ^( EQ ^( $b1h $b1 $b2) $b3) ^( EQ ^( $c1h $c1 $c2) $c3) ^( EQ ^( $a1v $a1 $b1) $c1) ^( EQ ^( $a2v $a2 $b2) $c2) ^( EQ ^( $a3v $a3 $b3) $c3) )
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:11:11: a1= value a1h= OP a2= value EQ a3= value a1v= OP a2v= OP a3v= OP b1= value b1h= OP b2= value EQ b3= value EQ EQ EQ c1= value c1h= OP c2= value EQ c3= value
            {
            pushFollow(FOLLOW_value_in_riddle40);
            a1=value();

            state._fsp--;

            stream_value.add(a1.getTree());

            a1h=(Token)match(input,OP,FOLLOW_OP_in_riddle44);  
            stream_OP.add(a1h);


            pushFollow(FOLLOW_value_in_riddle48);
            a2=value();

            state._fsp--;

            stream_value.add(a2.getTree());

            EQ1=(Token)match(input,EQ,FOLLOW_EQ_in_riddle50);  
            stream_EQ.add(EQ1);


            pushFollow(FOLLOW_value_in_riddle54);
            a3=value();

            state._fsp--;

            stream_value.add(a3.getTree());

            a1v=(Token)match(input,OP,FOLLOW_OP_in_riddle60);  
            stream_OP.add(a1v);


            a2v=(Token)match(input,OP,FOLLOW_OP_in_riddle64);  
            stream_OP.add(a2v);


            a3v=(Token)match(input,OP,FOLLOW_OP_in_riddle68);  
            stream_OP.add(a3v);


            pushFollow(FOLLOW_value_in_riddle74);
            b1=value();

            state._fsp--;

            stream_value.add(b1.getTree());

            b1h=(Token)match(input,OP,FOLLOW_OP_in_riddle78);  
            stream_OP.add(b1h);


            pushFollow(FOLLOW_value_in_riddle82);
            b2=value();

            state._fsp--;

            stream_value.add(b2.getTree());

            EQ2=(Token)match(input,EQ,FOLLOW_EQ_in_riddle84);  
            stream_EQ.add(EQ2);


            pushFollow(FOLLOW_value_in_riddle88);
            b3=value();

            state._fsp--;

            stream_value.add(b3.getTree());

            EQ3=(Token)match(input,EQ,FOLLOW_EQ_in_riddle92);  
            stream_EQ.add(EQ3);


            EQ4=(Token)match(input,EQ,FOLLOW_EQ_in_riddle94);  
            stream_EQ.add(EQ4);


            EQ5=(Token)match(input,EQ,FOLLOW_EQ_in_riddle96);  
            stream_EQ.add(EQ5);


            pushFollow(FOLLOW_value_in_riddle102);
            c1=value();

            state._fsp--;

            stream_value.add(c1.getTree());

            c1h=(Token)match(input,OP,FOLLOW_OP_in_riddle106);  
            stream_OP.add(c1h);


            pushFollow(FOLLOW_value_in_riddle110);
            c2=value();

            state._fsp--;

            stream_value.add(c2.getTree());

            EQ6=(Token)match(input,EQ,FOLLOW_EQ_in_riddle112);  
            stream_EQ.add(EQ6);


            pushFollow(FOLLOW_value_in_riddle116);
            c3=value();

            state._fsp--;

            stream_value.add(c3.getTree());

            // AST REWRITE
            // elements: c1h, c3, a3v, b2, b2, c2, a2v, b3, c3, a1h, a2, EQ, EQ, a1, a3, c2, b1, c1, EQ, EQ, a1v, EQ, b1, a3, b3, a2, a1, EQ, b1h, c1
            // token labels: a2v, a3v, a1v, b1h, a1h, c1h
            // rule labels: c3, b2, a1, b3, a2, a3, c1, retval, c2, b1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a2v=new RewriteRuleTokenStream(adaptor,"token a2v",a2v);
            RewriteRuleTokenStream stream_a3v=new RewriteRuleTokenStream(adaptor,"token a3v",a3v);
            RewriteRuleTokenStream stream_a1v=new RewriteRuleTokenStream(adaptor,"token a1v",a1v);
            RewriteRuleTokenStream stream_b1h=new RewriteRuleTokenStream(adaptor,"token b1h",b1h);
            RewriteRuleTokenStream stream_a1h=new RewriteRuleTokenStream(adaptor,"token a1h",a1h);
            RewriteRuleTokenStream stream_c1h=new RewriteRuleTokenStream(adaptor,"token c1h",c1h);
            RewriteRuleSubtreeStream stream_c3=new RewriteRuleSubtreeStream(adaptor,"rule c3",c3!=null?c3.tree:null);
            RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.tree:null);
            RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);
            RewriteRuleSubtreeStream stream_b3=new RewriteRuleSubtreeStream(adaptor,"rule b3",b3!=null?b3.tree:null);
            RewriteRuleSubtreeStream stream_a2=new RewriteRuleSubtreeStream(adaptor,"rule a2",a2!=null?a2.tree:null);
            RewriteRuleSubtreeStream stream_a3=new RewriteRuleSubtreeStream(adaptor,"rule a3",a3!=null?a3.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);
            RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 16:3: -> ^( EQ ^( $a1h $a1 $a2) $a3) ^( EQ ^( $b1h $b1 $b2) $b3) ^( EQ ^( $c1h $c1 $c2) $c3) ^( EQ ^( $a1v $a1 $b1) $c1) ^( EQ ^( $a2v $a2 $b2) $c2) ^( EQ ^( $a3v $a3 $b3) $c3)
            {
                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:17:3: ^( EQ ^( $a1h $a1 $a2) $a3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:17:8: ^( $a1h $a1 $a2)
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

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:18:3: ^( EQ ^( $b1h $b1 $b2) $b3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:18:8: ^( $b1h $b1 $b2)
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

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:19:3: ^( EQ ^( $c1h $c1 $c2) $c3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:19:8: ^( $c1h $c1 $c2)
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

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:20:3: ^( EQ ^( $a1v $a1 $b1) $c1)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:20:8: ^( $a1v $a1 $b1)
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

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:21:3: ^( EQ ^( $a2v $a2 $b2) $c2)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:21:8: ^( $a2v $a2 $b2)
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

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:22:3: ^( EQ ^( $a3v $a3 $b3) $c3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:22:8: ^( $a3v $a3 $b3)
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
    // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:25:1: value : ( VALUELETTER )+ -> ^( VALUE ( VALUELETTER )+ ) ;
    public final SymbolraetselParser.value_return value() throws RecognitionException {
        SymbolraetselParser.value_return retval = new SymbolraetselParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VALUELETTER7=null;

        CommonTree VALUELETTER7_tree=null;
        RewriteRuleTokenStream stream_VALUELETTER=new RewriteRuleTokenStream(adaptor,"token VALUELETTER");

        try {
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:25:7: ( ( VALUELETTER )+ -> ^( VALUE ( VALUELETTER )+ ) )
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:25:9: ( VALUELETTER )+
            {
            // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:25:9: ( VALUELETTER )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VALUELETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:25:9: VALUELETTER
            	    {
            	    VALUELETTER7=(Token)match(input,VALUELETTER,FOLLOW_VALUELETTER_in_value250);  
            	    stream_VALUELETTER.add(VALUELETTER7);


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
            // elements: VALUELETTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 25:22: -> ^( VALUE ( VALUELETTER )+ )
            {
                // Z:\\pub\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 2\\1. symbolraetsel\\symbolraetsel_besser.g:25:25: ^( VALUE ( VALUELETTER )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VALUE, "VALUE")
                , root_1);

                if ( !(stream_VALUELETTER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_VALUELETTER.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_VALUELETTER.nextNode()
                    );

                }
                stream_VALUELETTER.reset();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_value_in_riddle40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OP_in_riddle44 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_riddle50 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle54 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OP_in_riddle60 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OP_in_riddle64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OP_in_riddle68 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle74 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OP_in_riddle78 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_riddle84 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle88 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_riddle92 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_riddle94 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_riddle96 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OP_in_riddle106 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_riddle112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_value_in_riddle116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUELETTER_in_value250 = new BitSet(new long[]{0x0000000000000082L});

}