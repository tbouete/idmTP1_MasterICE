package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'close'", "'open'", "'StateMachine'", "'state'", "'transition'", "'->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleStateMachine"
    // InternalMyDsl.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleStateMachine EOF )
            // InternalMyDsl.g:55:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyDsl.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__StateMachine__Group__0 )
            // InternalMyDsl.g:69:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleState EOF )
            // InternalMyDsl.g:105:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__State__Group__0 )
            // InternalMyDsl.g:119:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleTransition EOF )
            // InternalMyDsl.g:130:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Transition__Group__0 )
            // InternalMyDsl.g:144:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    // InternalMyDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    // InternalMyDsl.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Transition__Alternatives_0"
    // InternalMyDsl.g:173:1: rule__Transition__Alternatives_0 : ( ( 'close' ) | ( 'open' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( ( 'close' ) | ( 'open' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:178:2: ( 'close' )
                    {
                    // InternalMyDsl.g:178:2: ( 'close' )
                    // InternalMyDsl.g:179:3: 'close'
                    {
                     before(grammarAccess.getTransitionAccess().getCloseKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getCloseKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:184:2: ( 'open' )
                    {
                    // InternalMyDsl.g:184:2: ( 'open' )
                    // InternalMyDsl.g:185:3: 'open'
                    {
                     before(grammarAccess.getTransitionAccess().getOpenKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getOpenKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_0"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalMyDsl.g:194:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:198:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalMyDsl.g:199:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalMyDsl.g:206:1: rule__StateMachine__Group__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( ( () ) )
            // InternalMyDsl.g:211:1: ( () )
            {
            // InternalMyDsl.g:211:1: ( () )
            // InternalMyDsl.g:212:2: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 
            // InternalMyDsl.g:213:2: ()
            // InternalMyDsl.g:213:3: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalMyDsl.g:221:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:225:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalMyDsl.g:226:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalMyDsl.g:233:1: rule__StateMachine__Group__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( ( 'StateMachine' ) )
            // InternalMyDsl.g:238:1: ( 'StateMachine' )
            {
            // InternalMyDsl.g:238:1: ( 'StateMachine' )
            // InternalMyDsl.g:239:2: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalMyDsl.g:248:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:252:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalMyDsl.g:253:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalMyDsl.g:260:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__NameAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( ( ( rule__StateMachine__NameAssignment_2 ) ) )
            // InternalMyDsl.g:265:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:265:1: ( ( rule__StateMachine__NameAssignment_2 ) )
            // InternalMyDsl.g:266:2: ( rule__StateMachine__NameAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:267:2: ( rule__StateMachine__NameAssignment_2 )
            // InternalMyDsl.g:267:3: rule__StateMachine__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalMyDsl.g:275:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:279:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // InternalMyDsl.g:280:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalMyDsl.g:287:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__Group_3__0 )* ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( ( ( rule__StateMachine__Group_3__0 )* ) )
            // InternalMyDsl.g:292:1: ( ( rule__StateMachine__Group_3__0 )* )
            {
            // InternalMyDsl.g:292:1: ( ( rule__StateMachine__Group_3__0 )* )
            // InternalMyDsl.g:293:2: ( rule__StateMachine__Group_3__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3()); 
            // InternalMyDsl.g:294:2: ( rule__StateMachine__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:294:3: rule__StateMachine__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StateMachine__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // InternalMyDsl.g:302:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( rule__StateMachine__Group__4__Impl )
            // InternalMyDsl.g:307:2: rule__StateMachine__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // InternalMyDsl.g:313:1: rule__StateMachine__Group__4__Impl : ( ( rule__StateMachine__Group_4__0 )* ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:317:1: ( ( ( rule__StateMachine__Group_4__0 )* ) )
            // InternalMyDsl.g:318:1: ( ( rule__StateMachine__Group_4__0 )* )
            {
            // InternalMyDsl.g:318:1: ( ( rule__StateMachine__Group_4__0 )* )
            // InternalMyDsl.g:319:2: ( rule__StateMachine__Group_4__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_4()); 
            // InternalMyDsl.g:320:2: ( rule__StateMachine__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:320:3: rule__StateMachine__Group_4__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__StateMachine__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__0"
    // InternalMyDsl.g:329:1: rule__StateMachine__Group_3__0 : rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 ;
    public final void rule__StateMachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:333:1: ( rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 )
            // InternalMyDsl.g:334:2: rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0"


    // $ANTLR start "rule__StateMachine__Group_3__0__Impl"
    // InternalMyDsl.g:341:1: rule__StateMachine__Group_3__0__Impl : ( 'state' ) ;
    public final void rule__StateMachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( 'state' ) )
            // InternalMyDsl.g:346:1: ( 'state' )
            {
            // InternalMyDsl.g:346:1: ( 'state' )
            // InternalMyDsl.g:347:2: 'state'
            {
             before(grammarAccess.getStateMachineAccess().getStateKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__1"
    // InternalMyDsl.g:356:1: rule__StateMachine__Group_3__1 : rule__StateMachine__Group_3__1__Impl ;
    public final void rule__StateMachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( rule__StateMachine__Group_3__1__Impl )
            // InternalMyDsl.g:361:2: rule__StateMachine__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1"


    // $ANTLR start "rule__StateMachine__Group_3__1__Impl"
    // InternalMyDsl.g:367:1: rule__StateMachine__Group_3__1__Impl : ( ( rule__StateMachine__StatesAssignment_3_1 ) ) ;
    public final void rule__StateMachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( ( ( rule__StateMachine__StatesAssignment_3_1 ) ) )
            // InternalMyDsl.g:372:1: ( ( rule__StateMachine__StatesAssignment_3_1 ) )
            {
            // InternalMyDsl.g:372:1: ( ( rule__StateMachine__StatesAssignment_3_1 ) )
            // InternalMyDsl.g:373:2: ( rule__StateMachine__StatesAssignment_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_3_1()); 
            // InternalMyDsl.g:374:2: ( rule__StateMachine__StatesAssignment_3_1 )
            // InternalMyDsl.g:374:3: rule__StateMachine__StatesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StatesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__0"
    // InternalMyDsl.g:383:1: rule__StateMachine__Group_4__0 : rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 ;
    public final void rule__StateMachine__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1 )
            // InternalMyDsl.g:388:2: rule__StateMachine__Group_4__0__Impl rule__StateMachine__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0"


    // $ANTLR start "rule__StateMachine__Group_4__0__Impl"
    // InternalMyDsl.g:395:1: rule__StateMachine__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__StateMachine__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( 'transition' ) )
            // InternalMyDsl.g:400:1: ( 'transition' )
            {
            // InternalMyDsl.g:400:1: ( 'transition' )
            // InternalMyDsl.g:401:2: 'transition'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_4__1"
    // InternalMyDsl.g:410:1: rule__StateMachine__Group_4__1 : rule__StateMachine__Group_4__1__Impl ;
    public final void rule__StateMachine__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( rule__StateMachine__Group_4__1__Impl )
            // InternalMyDsl.g:415:2: rule__StateMachine__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1"


    // $ANTLR start "rule__StateMachine__Group_4__1__Impl"
    // InternalMyDsl.g:421:1: rule__StateMachine__Group_4__1__Impl : ( ( rule__StateMachine__TransitionAssignment_4_1 ) ) ;
    public final void rule__StateMachine__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:425:1: ( ( ( rule__StateMachine__TransitionAssignment_4_1 ) ) )
            // InternalMyDsl.g:426:1: ( ( rule__StateMachine__TransitionAssignment_4_1 ) )
            {
            // InternalMyDsl.g:426:1: ( ( rule__StateMachine__TransitionAssignment_4_1 ) )
            // InternalMyDsl.g:427:2: ( rule__StateMachine__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionAssignment_4_1()); 
            // InternalMyDsl.g:428:2: ( rule__StateMachine__TransitionAssignment_4_1 )
            // InternalMyDsl.g:428:3: rule__StateMachine__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMyDsl.g:437:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMyDsl.g:442:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMyDsl.g:449:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( () ) )
            // InternalMyDsl.g:454:1: ( () )
            {
            // InternalMyDsl.g:454:1: ( () )
            // InternalMyDsl.g:455:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalMyDsl.g:456:2: ()
            // InternalMyDsl.g:456:3: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMyDsl.g:464:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( rule__State__Group__1__Impl )
            // InternalMyDsl.g:469:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMyDsl.g:475:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:479:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMyDsl.g:480:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:480:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMyDsl.g:481:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:482:2: ( rule__State__NameAssignment_1 )
            // InternalMyDsl.g:482:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMyDsl.g:491:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMyDsl.g:496:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMyDsl.g:503:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalMyDsl.g:508:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalMyDsl.g:508:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalMyDsl.g:509:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:510:2: ( rule__Transition__Alternatives_0 )
            // InternalMyDsl.g:510:3: rule__Transition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMyDsl.g:518:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMyDsl.g:523:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMyDsl.g:530:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__ToAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( ( ( rule__Transition__ToAssignment_1 ) ) )
            // InternalMyDsl.g:535:1: ( ( rule__Transition__ToAssignment_1 ) )
            {
            // InternalMyDsl.g:535:1: ( ( rule__Transition__ToAssignment_1 ) )
            // InternalMyDsl.g:536:2: ( rule__Transition__ToAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_1()); 
            // InternalMyDsl.g:537:2: ( rule__Transition__ToAssignment_1 )
            // InternalMyDsl.g:537:3: rule__Transition__ToAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMyDsl.g:545:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMyDsl.g:550:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMyDsl.g:557:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( '->' ) )
            // InternalMyDsl.g:562:1: ( '->' )
            {
            // InternalMyDsl.g:562:1: ( '->' )
            // InternalMyDsl.g:563:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMyDsl.g:572:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__Transition__Group__3__Impl )
            // InternalMyDsl.g:577:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMyDsl.g:583:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__FromAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( ( rule__Transition__FromAssignment_3 ) ) )
            // InternalMyDsl.g:588:1: ( ( rule__Transition__FromAssignment_3 ) )
            {
            // InternalMyDsl.g:588:1: ( ( rule__Transition__FromAssignment_3 ) )
            // InternalMyDsl.g:589:2: ( rule__Transition__FromAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_3()); 
            // InternalMyDsl.g:590:2: ( rule__Transition__FromAssignment_3 )
            // InternalMyDsl.g:590:3: rule__Transition__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_2"
    // InternalMyDsl.g:599:1: rule__StateMachine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( ( ruleEString ) )
            // InternalMyDsl.g:604:2: ( ruleEString )
            {
            // InternalMyDsl.g:604:2: ( ruleEString )
            // InternalMyDsl.g:605:3: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_2"


    // $ANTLR start "rule__StateMachine__StatesAssignment_3_1"
    // InternalMyDsl.g:614:1: rule__StateMachine__StatesAssignment_3_1 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:618:1: ( ( ruleState ) )
            // InternalMyDsl.g:619:2: ( ruleState )
            {
            // InternalMyDsl.g:619:2: ( ruleState )
            // InternalMyDsl.g:620:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_3_1"


    // $ANTLR start "rule__StateMachine__TransitionAssignment_4_1"
    // InternalMyDsl.g:629:1: rule__StateMachine__TransitionAssignment_4_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:633:1: ( ( ruleTransition ) )
            // InternalMyDsl.g:634:2: ( ruleTransition )
            {
            // InternalMyDsl.g:634:2: ( ruleTransition )
            // InternalMyDsl.g:635:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionAssignment_4_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalMyDsl.g:644:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ruleEString ) )
            // InternalMyDsl.g:649:2: ( ruleEString )
            {
            // InternalMyDsl.g:649:2: ( ruleEString )
            // InternalMyDsl.g:650:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Transition__ToAssignment_1"
    // InternalMyDsl.g:659:1: rule__Transition__ToAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:664:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:664:2: ( ( ruleEString ) )
            // InternalMyDsl.g:665:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_1_0()); 
            // InternalMyDsl.g:666:3: ( ruleEString )
            // InternalMyDsl.g:667:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getToStateEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getToStateEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToAssignment_1"


    // $ANTLR start "rule__Transition__FromAssignment_3"
    // InternalMyDsl.g:678:1: rule__Transition__FromAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Transition__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:683:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:683:2: ( ( ruleEString ) )
            // InternalMyDsl.g:684:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getFromStateCrossReference_3_0()); 
            // InternalMyDsl.g:685:3: ( ruleEString )
            // InternalMyDsl.g:686:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getFromStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getFromStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getFromStateCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__FromAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}