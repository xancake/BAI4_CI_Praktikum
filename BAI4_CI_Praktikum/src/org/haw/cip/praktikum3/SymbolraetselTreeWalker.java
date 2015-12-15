// $ANTLR 3.4 D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g 2015-12-15 13:30:56
package org.haw.cip.praktikum3;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselTreeWalker extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SymbolraetselTreeWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SymbolraetselTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g"; }


    public static class riddle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:15:1: riddle : task task task task task task ;
    public final SymbolraetselTreeWalker.riddle_return riddle() throws RecognitionException {
        SymbolraetselTreeWalker.riddle_return retval = new SymbolraetselTreeWalker.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        SymbolraetselTreeWalker.task_return task1 =null;

        SymbolraetselTreeWalker.task_return task2 =null;

        SymbolraetselTreeWalker.task_return task3 =null;

        SymbolraetselTreeWalker.task_return task4 =null;

        SymbolraetselTreeWalker.task_return task5 =null;

        SymbolraetselTreeWalker.task_return task6 =null;



        try {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:15:8: ( task task task task task task )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:15:10: task task task task task task
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_task_in_riddle50);
            task1=task();

            state._fsp--;

            adaptor.addChild(root_0, task1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_task_in_riddle52);
            task2=task();

            state._fsp--;

            adaptor.addChild(root_0, task2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_task_in_riddle54);
            task3=task();

            state._fsp--;

            adaptor.addChild(root_0, task3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_task_in_riddle56);
            task4=task();

            state._fsp--;

            adaptor.addChild(root_0, task4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_task_in_riddle58);
            task5=task();

            state._fsp--;

            adaptor.addChild(root_0, task5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_task_in_riddle60);
            task6=task();

            state._fsp--;

            adaptor.addChild(root_0, task6.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "riddle"


    public static class task_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "task"
    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:16:1: task : ( ^( EQ ^( ADD value value ) value ) | ^( EQ ^( SUB v1= value v2= value ) v3= value ) -> ^( EQ ^( ADD[\"+\"] $v3 $v2) $v1) );
    public final SymbolraetselTreeWalker.task_return task() throws RecognitionException {
        SymbolraetselTreeWalker.task_return retval = new SymbolraetselTreeWalker.task_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ7=null;
        CommonTree ADD8=null;
        CommonTree EQ12=null;
        CommonTree SUB13=null;
        SymbolraetselTreeWalker.value_return v1 =null;

        SymbolraetselTreeWalker.value_return v2 =null;

        SymbolraetselTreeWalker.value_return v3 =null;

        SymbolraetselTreeWalker.value_return value9 =null;

        SymbolraetselTreeWalker.value_return value10 =null;

        SymbolraetselTreeWalker.value_return value11 =null;


        CommonTree EQ7_tree=null;
        CommonTree ADD8_tree=null;
        CommonTree EQ12_tree=null;
        CommonTree SUB13_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:16:6: ( ^( EQ ^( ADD value value ) value ) | ^( EQ ^( SUB v1= value v2= value ) v3= value ) -> ^( EQ ^( ADD[\"+\"] $v3 $v2) $v1) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQ) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==ADD) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==SUB) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:16:8: ^( EQ ^( ADD value value ) value )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ7=(CommonTree)match(input,EQ,FOLLOW_EQ_in_task68); 
                    EQ7_tree = (CommonTree)adaptor.dupNode(EQ7);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ7_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ADD8=(CommonTree)match(input,ADD,FOLLOW_ADD_in_task71); 
                    ADD8_tree = (CommonTree)adaptor.dupNode(ADD8);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD8_tree, root_2);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_task73);
                    value9=value();

                    state._fsp--;

                    adaptor.addChild(root_2, value9.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_task75);
                    value10=value();

                    state._fsp--;

                    adaptor.addChild(root_2, value10.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_task78);
                    value11=value();

                    state._fsp--;

                    adaptor.addChild(root_1, value11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:17:4: ^( EQ ^( SUB v1= value v2= value ) v3= value )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ12=(CommonTree)match(input,EQ,FOLLOW_EQ_in_task85);  
                    stream_EQ.add(EQ12);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SUB13=(CommonTree)match(input,SUB,FOLLOW_SUB_in_task88);  
                    stream_SUB.add(SUB13);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_task92);
                    v1=value();

                    state._fsp--;

                    stream_value.add(v1.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_task97);
                    v2=value();

                    state._fsp--;

                    stream_value.add(v2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_value_in_task102);
                    v3=value();

                    state._fsp--;

                    stream_value.add(v3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: v1, EQ, v2, v3
                    // token labels: 
                    // rule labels: v1, v2, v3, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_v1=new RewriteRuleSubtreeStream(adaptor,"rule v1",v1!=null?v1.tree:null);
                    RewriteRuleSubtreeStream stream_v2=new RewriteRuleSubtreeStream(adaptor,"rule v2",v2!=null?v2.tree:null);
                    RewriteRuleSubtreeStream stream_v3=new RewriteRuleSubtreeStream(adaptor,"rule v3",v3!=null?v3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 17:45: -> ^( EQ ^( ADD[\"+\"] $v3 $v2) $v1)
                    {
                        // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:17:48: ^( EQ ^( ADD[\"+\"] $v3 $v2) $v1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQ.nextNode()
                        , root_1);

                        // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:17:53: ^( ADD[\"+\"] $v3 $v2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        adaptor.addChild(root_2, stream_v3.nextTree());

                        adaptor.addChild(root_2, stream_v2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_v1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "task"


    public static class value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:18:1: value : ^( VALUE ( SYMBOL )+ ) ;
    public final SymbolraetselTreeWalker.value_return value() throws RecognitionException {
        SymbolraetselTreeWalker.value_return retval = new SymbolraetselTreeWalker.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VALUE14=null;
        CommonTree SYMBOL15=null;

        CommonTree VALUE14_tree=null;
        CommonTree SYMBOL15_tree=null;

        try {
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:18:7: ( ^( VALUE ( SYMBOL )+ ) )
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:18:9: ^( VALUE ( SYMBOL )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            VALUE14=(CommonTree)match(input,VALUE,FOLLOW_VALUE_in_value131); 
            VALUE14_tree = (CommonTree)adaptor.dupNode(VALUE14);


            root_1 = (CommonTree)adaptor.becomeRoot(VALUE14_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:18:17: ( SYMBOL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYMBOL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Dropbox\\Studium\\Semester 4\\Compiler und Interpreter\\Praktikum\\Praktikum 3\\1. symbolraetsel\\SymbolraetselTreeWalker.g:18:17: SYMBOL
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    SYMBOL15=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_value133); 
            	    SYMBOL15_tree = (CommonTree)adaptor.dupNode(SYMBOL15);


            	    adaptor.addChild(root_1, SYMBOL15_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_task_in_riddle50 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_task_in_riddle52 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_task_in_riddle54 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_task_in_riddle56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_task_in_riddle58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_task_in_riddle60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_task68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_task71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_task73 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_value_in_task75 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_task78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_task85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_task88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_task92 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_value_in_task97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_task102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_value131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_value133 = new BitSet(new long[]{0x0000000000000088L});

}