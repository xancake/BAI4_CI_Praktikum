// $ANTLR 3.4 Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g 2016-01-12 10:35:37
package org.haw.cip.praktikum4.symbolraetsel;

import java.util.Set;
import java.util.HashSet;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
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


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g"; }


    Set<Character> characters = new HashSet<>();


    public static class riddle_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "riddle"
    // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:18:1: riddle : (tasks+= task )* -> sums(symbols=characterssums=$tasks);
    public final SymbolraetselEmitter.riddle_return riddle() throws RecognitionException {
        SymbolraetselEmitter.riddle_return retval = new SymbolraetselEmitter.riddle_return();
        retval.start = input.LT(1);


        List list_tasks=null;
        RuleReturnScope tasks = null;
        try {
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:18:8: ( (tasks+= task )* -> sums(symbols=characterssums=$tasks))
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:18:10: (tasks+= task )*
            {
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:18:15: (tasks+= task )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==EQ) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:18:15: tasks+= task
            	    {
            	    pushFollow(FOLLOW_task_in_riddle65);
            	    tasks=task();

            	    state._fsp--;

            	    if (list_tasks==null) list_tasks=new ArrayList();
            	    list_tasks.add(tasks.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // TEMPLATE REWRITE
            // 18:23: -> sums(symbols=characterssums=$tasks)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("symbols", characters).put("sums", list_tasks));
            }



            }

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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "task"
    // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:20:1: task : ^( EQ ^( ADD n1= value n2= value ) n3= value ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselEmitter.task_return task() throws RecognitionException {
        SymbolraetselEmitter.task_return retval = new SymbolraetselEmitter.task_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.value_return n1 =null;

        SymbolraetselEmitter.value_return n2 =null;

        SymbolraetselEmitter.value_return n3 =null;


        try {
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:24:3: ( ^( EQ ^( ADD n1= value n2= value ) n3= value ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:24:5: ^( EQ ^( ADD n1= value n2= value ) n3= value )
            {
            match(input,EQ,FOLLOW_EQ_in_task94); 

            match(input, Token.DOWN, null); 
            match(input,ADD,FOLLOW_ADD_in_task97); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_value_in_task101);
            n1=value();

            state._fsp--;


            pushFollow(FOLLOW_value_in_task105);
            n2=value();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_value_in_task110);
            n3=value();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 24:45: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            Constraint constraint = new Constraint((n1!=null?n1.number:null), (n2!=null?n2.number:null), (n3!=null?n3.number:null));
            constraint.prepare();

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
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "value"
    // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:26:1: value returns [Number number] : ^( VALUE (symbols+= SYMBOL )+ ) ;
    public final SymbolraetselEmitter.value_return value() throws RecognitionException {
        SymbolraetselEmitter.value_return retval = new SymbolraetselEmitter.value_return();
        retval.start = input.LT(1);


        CommonTree symbols=null;
        List list_symbols=null;

        try {
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:30:3: ( ^( VALUE (symbols+= SYMBOL )+ ) )
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:30:5: ^( VALUE (symbols+= SYMBOL )+ )
            {
            match(input,VALUE,FOLLOW_VALUE_in_value148); 

            match(input, Token.DOWN, null); 
            // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:30:20: (symbols+= SYMBOL )+
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
            	    // Z:\\git\\BAI4_CI_Praktikum\\BAI4_CI_Praktikum\\etc\\symbolraetsel\\antlr\\praktikum\\4\\SymbolraetselEmitter.g:30:20: symbols+= SYMBOL
            	    {
            	    symbols=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_value152); 
            	    if (list_symbols==null) list_symbols=new ArrayList();
            	    list_symbols.add(symbols);


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


            }


            retval.number = new Number(list_symbols);
            characters.addAll(retval.number.getCharacters());

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


 

    public static final BitSet FOLLOW_task_in_riddle65 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQ_in_task94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_task97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_task101 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_value_in_task105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_value_in_task110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VALUE_in_value148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_value152 = new BitSet(new long[]{0x0000000000000088L});

}