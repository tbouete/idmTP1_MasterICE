package iDM_Test.ide.contentassist.antlr.internal;

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
import iDM_Test.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'open'", "'close'", "'StateMachine'", "'state'", "'transition'", "'init'", "'->'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }


    	private StateMachineGrammarAccess grammarAccess;

    	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
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
    // InternalStateMachine.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalStateMachine.g:54:1: ( ruleStateMachine EOF )
            // InternalStateMachine.g:55:1: ruleStateMachine EOF
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
    // InternalStateMachine.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Alternatives ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:66:2: ( ( ( rule__StateMachine__Alternatives ) ) )
            // InternalStateMachine.g:67:2: ( ( rule__StateMachine__Alternatives ) )
            {
            // InternalStateMachine.g:67:2: ( ( rule__StateMachine__Alternatives ) )
            // InternalStateMachine.g:68:3: ( rule__StateMachine__Alternatives )
            {
             before(grammarAccess.getStateMachineAccess().getAlternatives()); 
            // InternalStateMachine.g:69:3: ( rule__StateMachine__Alternatives )
            // InternalStateMachine.g:69:4: rule__StateMachine__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getAlternatives()); 

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
    // InternalStateMachine.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalStateMachine.g:79:1: ( ruleEString EOF )
            // InternalStateMachine.g:80:1: ruleEString EOF
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
    // InternalStateMachine.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalStateMachine.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalStateMachine.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalStateMachine.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalStateMachine.g:94:3: ( rule__EString__Alternatives )
            // InternalStateMachine.g:94:4: rule__EString__Alternatives
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
    // InternalStateMachine.g:103:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStateMachine.g:104:1: ( ruleState EOF )
            // InternalStateMachine.g:105:1: ruleState EOF
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
    // InternalStateMachine.g:112:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:116:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStateMachine.g:117:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStateMachine.g:117:2: ( ( rule__State__Group__0 ) )
            // InternalStateMachine.g:118:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalStateMachine.g:119:3: ( rule__State__Group__0 )
            // InternalStateMachine.g:119:4: rule__State__Group__0
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
    // InternalStateMachine.g:128:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalStateMachine.g:129:1: ( ruleTransition EOF )
            // InternalStateMachine.g:130:1: ruleTransition EOF
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
    // InternalStateMachine.g:137:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:141:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalStateMachine.g:142:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalStateMachine.g:142:2: ( ( rule__Transition__Group__0 ) )
            // InternalStateMachine.g:143:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalStateMachine.g:144:3: ( rule__Transition__Group__0 )
            // InternalStateMachine.g:144:4: rule__Transition__Group__0
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


    // $ANTLR start "rule__StateMachine__Alternatives"
    // InternalStateMachine.g:152:1: rule__StateMachine__Alternatives : ( ( ( rule__StateMachine__Group_0__0 ) ) | ( ( rule__StateMachine__Group_1__0 ) ) );
    public final void rule__StateMachine__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:156:1: ( ( ( rule__StateMachine__Group_0__0 ) ) | ( ( rule__StateMachine__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachine.g:157:2: ( ( rule__StateMachine__Group_0__0 ) )
                    {
                    // InternalStateMachine.g:157:2: ( ( rule__StateMachine__Group_0__0 ) )
                    // InternalStateMachine.g:158:3: ( rule__StateMachine__Group_0__0 )
                    {
                     before(grammarAccess.getStateMachineAccess().getGroup_0()); 
                    // InternalStateMachine.g:159:3: ( rule__StateMachine__Group_0__0 )
                    // InternalStateMachine.g:159:4: rule__StateMachine__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:163:2: ( ( rule__StateMachine__Group_1__0 ) )
                    {
                    // InternalStateMachine.g:163:2: ( ( rule__StateMachine__Group_1__0 ) )
                    // InternalStateMachine.g:164:3: ( rule__StateMachine__Group_1__0 )
                    {
                     before(grammarAccess.getStateMachineAccess().getGroup_1()); 
                    // InternalStateMachine.g:165:3: ( rule__StateMachine__Group_1__0 )
                    // InternalStateMachine.g:165:4: rule__StateMachine__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StateMachine__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalStateMachine.g:173:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:177:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachine.g:178:2: ( RULE_STRING )
                    {
                    // InternalStateMachine.g:178:2: ( RULE_STRING )
                    // InternalStateMachine.g:179:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:184:2: ( RULE_ID )
                    {
                    // InternalStateMachine.g:184:2: ( RULE_ID )
                    // InternalStateMachine.g:185:3: RULE_ID
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
    // InternalStateMachine.g:194:1: rule__Transition__Alternatives_0 : ( ( 'open' ) | ( 'close' ) );
    public final void rule__Transition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:198:1: ( ( 'open' ) | ( 'close' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:199:2: ( 'open' )
                    {
                    // InternalStateMachine.g:199:2: ( 'open' )
                    // InternalStateMachine.g:200:3: 'open'
                    {
                     before(grammarAccess.getTransitionAccess().getOpenKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getOpenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:205:2: ( 'close' )
                    {
                    // InternalStateMachine.g:205:2: ( 'close' )
                    // InternalStateMachine.g:206:3: 'close'
                    {
                     before(grammarAccess.getTransitionAccess().getCloseKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTransitionAccess().getCloseKeyword_0_1()); 

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


    // $ANTLR start "rule__StateMachine__Group_0__0"
    // InternalStateMachine.g:215:1: rule__StateMachine__Group_0__0 : rule__StateMachine__Group_0__0__Impl rule__StateMachine__Group_0__1 ;
    public final void rule__StateMachine__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:219:1: ( rule__StateMachine__Group_0__0__Impl rule__StateMachine__Group_0__1 )
            // InternalStateMachine.g:220:2: rule__StateMachine__Group_0__0__Impl rule__StateMachine__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0__1();

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
    // $ANTLR end "rule__StateMachine__Group_0__0"


    // $ANTLR start "rule__StateMachine__Group_0__0__Impl"
    // InternalStateMachine.g:227:1: rule__StateMachine__Group_0__0__Impl : ( () ) ;
    public final void rule__StateMachine__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:231:1: ( ( () ) )
            // InternalStateMachine.g:232:1: ( () )
            {
            // InternalStateMachine.g:232:1: ( () )
            // InternalStateMachine.g:233:2: ()
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineAction_0_0()); 
            // InternalStateMachine.g:234:2: ()
            // InternalStateMachine.g:234:3: 
            {
            }

             after(grammarAccess.getStateMachineAccess().getStateMachineAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_0__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_0__1"
    // InternalStateMachine.g:242:1: rule__StateMachine__Group_0__1 : rule__StateMachine__Group_0__1__Impl rule__StateMachine__Group_0__2 ;
    public final void rule__StateMachine__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:246:1: ( rule__StateMachine__Group_0__1__Impl rule__StateMachine__Group_0__2 )
            // InternalStateMachine.g:247:2: rule__StateMachine__Group_0__1__Impl rule__StateMachine__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0__2();

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
    // $ANTLR end "rule__StateMachine__Group_0__1"


    // $ANTLR start "rule__StateMachine__Group_0__1__Impl"
    // InternalStateMachine.g:254:1: rule__StateMachine__Group_0__1__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:258:1: ( ( 'StateMachine' ) )
            // InternalStateMachine.g:259:1: ( 'StateMachine' )
            {
            // InternalStateMachine.g:259:1: ( 'StateMachine' )
            // InternalStateMachine.g:260:2: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0_1()); 

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
    // $ANTLR end "rule__StateMachine__Group_0__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_0__2"
    // InternalStateMachine.g:269:1: rule__StateMachine__Group_0__2 : rule__StateMachine__Group_0__2__Impl rule__StateMachine__Group_0__3 ;
    public final void rule__StateMachine__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:273:1: ( rule__StateMachine__Group_0__2__Impl rule__StateMachine__Group_0__3 )
            // InternalStateMachine.g:274:2: rule__StateMachine__Group_0__2__Impl rule__StateMachine__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0__3();

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
    // $ANTLR end "rule__StateMachine__Group_0__2"


    // $ANTLR start "rule__StateMachine__Group_0__2__Impl"
    // InternalStateMachine.g:281:1: rule__StateMachine__Group_0__2__Impl : ( ( rule__StateMachine__NameAssignment_0_2 ) ) ;
    public final void rule__StateMachine__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:285:1: ( ( ( rule__StateMachine__NameAssignment_0_2 ) ) )
            // InternalStateMachine.g:286:1: ( ( rule__StateMachine__NameAssignment_0_2 ) )
            {
            // InternalStateMachine.g:286:1: ( ( rule__StateMachine__NameAssignment_0_2 ) )
            // InternalStateMachine.g:287:2: ( rule__StateMachine__NameAssignment_0_2 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_0_2()); 
            // InternalStateMachine.g:288:2: ( rule__StateMachine__NameAssignment_0_2 )
            // InternalStateMachine.g:288:3: rule__StateMachine__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_0_2()); 

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
    // $ANTLR end "rule__StateMachine__Group_0__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_0__3"
    // InternalStateMachine.g:296:1: rule__StateMachine__Group_0__3 : rule__StateMachine__Group_0__3__Impl ;
    public final void rule__StateMachine__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:300:1: ( rule__StateMachine__Group_0__3__Impl )
            // InternalStateMachine.g:301:2: rule__StateMachine__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0__3__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_0__3"


    // $ANTLR start "rule__StateMachine__Group_0__3__Impl"
    // InternalStateMachine.g:307:1: rule__StateMachine__Group_0__3__Impl : ( ( rule__StateMachine__Group_0_3__0 ) ) ;
    public final void rule__StateMachine__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:311:1: ( ( ( rule__StateMachine__Group_0_3__0 ) ) )
            // InternalStateMachine.g:312:1: ( ( rule__StateMachine__Group_0_3__0 ) )
            {
            // InternalStateMachine.g:312:1: ( ( rule__StateMachine__Group_0_3__0 ) )
            // InternalStateMachine.g:313:2: ( rule__StateMachine__Group_0_3__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup_0_3()); 
            // InternalStateMachine.g:314:2: ( rule__StateMachine__Group_0_3__0 )
            // InternalStateMachine.g:314:3: rule__StateMachine__Group_0_3__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup_0_3()); 

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
    // $ANTLR end "rule__StateMachine__Group_0__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_0_3__0"
    // InternalStateMachine.g:323:1: rule__StateMachine__Group_0_3__0 : rule__StateMachine__Group_0_3__0__Impl rule__StateMachine__Group_0_3__1 ;
    public final void rule__StateMachine__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:327:1: ( rule__StateMachine__Group_0_3__0__Impl rule__StateMachine__Group_0_3__1 )
            // InternalStateMachine.g:328:2: rule__StateMachine__Group_0_3__0__Impl rule__StateMachine__Group_0_3__1
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0_3__1();

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
    // $ANTLR end "rule__StateMachine__Group_0_3__0"


    // $ANTLR start "rule__StateMachine__Group_0_3__0__Impl"
    // InternalStateMachine.g:335:1: rule__StateMachine__Group_0_3__0__Impl : ( 'state' ) ;
    public final void rule__StateMachine__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:339:1: ( ( 'state' ) )
            // InternalStateMachine.g:340:1: ( 'state' )
            {
            // InternalStateMachine.g:340:1: ( 'state' )
            // InternalStateMachine.g:341:2: 'state'
            {
             before(grammarAccess.getStateMachineAccess().getStateKeyword_0_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateKeyword_0_3_0()); 

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
    // $ANTLR end "rule__StateMachine__Group_0_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_0_3__1"
    // InternalStateMachine.g:350:1: rule__StateMachine__Group_0_3__1 : rule__StateMachine__Group_0_3__1__Impl ;
    public final void rule__StateMachine__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:354:1: ( rule__StateMachine__Group_0_3__1__Impl )
            // InternalStateMachine.g:355:2: rule__StateMachine__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_0_3__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_0_3__1"


    // $ANTLR start "rule__StateMachine__Group_0_3__1__Impl"
    // InternalStateMachine.g:361:1: rule__StateMachine__Group_0_3__1__Impl : ( ( rule__StateMachine__StatesAssignment_0_3_1 ) ) ;
    public final void rule__StateMachine__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:365:1: ( ( ( rule__StateMachine__StatesAssignment_0_3_1 ) ) )
            // InternalStateMachine.g:366:1: ( ( rule__StateMachine__StatesAssignment_0_3_1 ) )
            {
            // InternalStateMachine.g:366:1: ( ( rule__StateMachine__StatesAssignment_0_3_1 ) )
            // InternalStateMachine.g:367:2: ( rule__StateMachine__StatesAssignment_0_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_0_3_1()); 
            // InternalStateMachine.g:368:2: ( rule__StateMachine__StatesAssignment_0_3_1 )
            // InternalStateMachine.g:368:3: rule__StateMachine__StatesAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StatesAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_0_3_1()); 

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
    // $ANTLR end "rule__StateMachine__Group_0_3__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_1__0"
    // InternalStateMachine.g:377:1: rule__StateMachine__Group_1__0 : rule__StateMachine__Group_1__0__Impl rule__StateMachine__Group_1__1 ;
    public final void rule__StateMachine__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:381:1: ( rule__StateMachine__Group_1__0__Impl rule__StateMachine__Group_1__1 )
            // InternalStateMachine.g:382:2: rule__StateMachine__Group_1__0__Impl rule__StateMachine__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1__1();

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
    // $ANTLR end "rule__StateMachine__Group_1__0"


    // $ANTLR start "rule__StateMachine__Group_1__0__Impl"
    // InternalStateMachine.g:389:1: rule__StateMachine__Group_1__0__Impl : ( ( rule__StateMachine__Group_1_0__0 ) ) ;
    public final void rule__StateMachine__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:393:1: ( ( ( rule__StateMachine__Group_1_0__0 ) ) )
            // InternalStateMachine.g:394:1: ( ( rule__StateMachine__Group_1_0__0 ) )
            {
            // InternalStateMachine.g:394:1: ( ( rule__StateMachine__Group_1_0__0 ) )
            // InternalStateMachine.g:395:2: ( rule__StateMachine__Group_1_0__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup_1_0()); 
            // InternalStateMachine.g:396:2: ( rule__StateMachine__Group_1_0__0 )
            // InternalStateMachine.g:396:3: rule__StateMachine__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__StateMachine__Group_1__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_1__1"
    // InternalStateMachine.g:404:1: rule__StateMachine__Group_1__1 : rule__StateMachine__Group_1__1__Impl ;
    public final void rule__StateMachine__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:408:1: ( rule__StateMachine__Group_1__1__Impl )
            // InternalStateMachine.g:409:2: rule__StateMachine__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_1__1"


    // $ANTLR start "rule__StateMachine__Group_1__1__Impl"
    // InternalStateMachine.g:415:1: rule__StateMachine__Group_1__1__Impl : ( ( rule__StateMachine__Group_1_1__0 ) ) ;
    public final void rule__StateMachine__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:419:1: ( ( ( rule__StateMachine__Group_1_1__0 ) ) )
            // InternalStateMachine.g:420:1: ( ( rule__StateMachine__Group_1_1__0 ) )
            {
            // InternalStateMachine.g:420:1: ( ( rule__StateMachine__Group_1_1__0 ) )
            // InternalStateMachine.g:421:2: ( rule__StateMachine__Group_1_1__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup_1_1()); 
            // InternalStateMachine.g:422:2: ( rule__StateMachine__Group_1_1__0 )
            // InternalStateMachine.g:422:3: rule__StateMachine__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__StateMachine__Group_1__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_1_0__0"
    // InternalStateMachine.g:431:1: rule__StateMachine__Group_1_0__0 : rule__StateMachine__Group_1_0__0__Impl rule__StateMachine__Group_1_0__1 ;
    public final void rule__StateMachine__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:435:1: ( rule__StateMachine__Group_1_0__0__Impl rule__StateMachine__Group_1_0__1 )
            // InternalStateMachine.g:436:2: rule__StateMachine__Group_1_0__0__Impl rule__StateMachine__Group_1_0__1
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1_0__1();

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
    // $ANTLR end "rule__StateMachine__Group_1_0__0"


    // $ANTLR start "rule__StateMachine__Group_1_0__0__Impl"
    // InternalStateMachine.g:443:1: rule__StateMachine__Group_1_0__0__Impl : ( 'transition' ) ;
    public final void rule__StateMachine__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:447:1: ( ( 'transition' ) )
            // InternalStateMachine.g:448:1: ( 'transition' )
            {
            // InternalStateMachine.g:448:1: ( 'transition' )
            // InternalStateMachine.g:449:2: 'transition'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionKeyword_1_0_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getTransitionKeyword_1_0_0()); 

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
    // $ANTLR end "rule__StateMachine__Group_1_0__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_1_0__1"
    // InternalStateMachine.g:458:1: rule__StateMachine__Group_1_0__1 : rule__StateMachine__Group_1_0__1__Impl ;
    public final void rule__StateMachine__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:462:1: ( rule__StateMachine__Group_1_0__1__Impl )
            // InternalStateMachine.g:463:2: rule__StateMachine__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_1_0__1"


    // $ANTLR start "rule__StateMachine__Group_1_0__1__Impl"
    // InternalStateMachine.g:469:1: rule__StateMachine__Group_1_0__1__Impl : ( ( rule__StateMachine__TransitionAssignment_1_0_1 ) ) ;
    public final void rule__StateMachine__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:473:1: ( ( ( rule__StateMachine__TransitionAssignment_1_0_1 ) ) )
            // InternalStateMachine.g:474:1: ( ( rule__StateMachine__TransitionAssignment_1_0_1 ) )
            {
            // InternalStateMachine.g:474:1: ( ( rule__StateMachine__TransitionAssignment_1_0_1 ) )
            // InternalStateMachine.g:475:2: ( rule__StateMachine__TransitionAssignment_1_0_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionAssignment_1_0_1()); 
            // InternalStateMachine.g:476:2: ( rule__StateMachine__TransitionAssignment_1_0_1 )
            // InternalStateMachine.g:476:3: rule__StateMachine__TransitionAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__TransitionAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionAssignment_1_0_1()); 

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
    // $ANTLR end "rule__StateMachine__Group_1_0__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_1_1__0"
    // InternalStateMachine.g:485:1: rule__StateMachine__Group_1_1__0 : rule__StateMachine__Group_1_1__0__Impl rule__StateMachine__Group_1_1__1 ;
    public final void rule__StateMachine__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:489:1: ( rule__StateMachine__Group_1_1__0__Impl rule__StateMachine__Group_1_1__1 )
            // InternalStateMachine.g:490:2: rule__StateMachine__Group_1_1__0__Impl rule__StateMachine__Group_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1_1__1();

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
    // $ANTLR end "rule__StateMachine__Group_1_1__0"


    // $ANTLR start "rule__StateMachine__Group_1_1__0__Impl"
    // InternalStateMachine.g:497:1: rule__StateMachine__Group_1_1__0__Impl : ( 'init' ) ;
    public final void rule__StateMachine__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:501:1: ( ( 'init' ) )
            // InternalStateMachine.g:502:1: ( 'init' )
            {
            // InternalStateMachine.g:502:1: ( 'init' )
            // InternalStateMachine.g:503:2: 'init'
            {
             before(grammarAccess.getStateMachineAccess().getInitKeyword_1_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getInitKeyword_1_1_0()); 

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
    // $ANTLR end "rule__StateMachine__Group_1_1__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_1_1__1"
    // InternalStateMachine.g:512:1: rule__StateMachine__Group_1_1__1 : rule__StateMachine__Group_1_1__1__Impl ;
    public final void rule__StateMachine__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:516:1: ( rule__StateMachine__Group_1_1__1__Impl )
            // InternalStateMachine.g:517:2: rule__StateMachine__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__StateMachine__Group_1_1__1"


    // $ANTLR start "rule__StateMachine__Group_1_1__1__Impl"
    // InternalStateMachine.g:523:1: rule__StateMachine__Group_1_1__1__Impl : ( ( rule__StateMachine__InitAssignment_1_1_1 ) ) ;
    public final void rule__StateMachine__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:527:1: ( ( ( rule__StateMachine__InitAssignment_1_1_1 ) ) )
            // InternalStateMachine.g:528:1: ( ( rule__StateMachine__InitAssignment_1_1_1 ) )
            {
            // InternalStateMachine.g:528:1: ( ( rule__StateMachine__InitAssignment_1_1_1 ) )
            // InternalStateMachine.g:529:2: ( rule__StateMachine__InitAssignment_1_1_1 )
            {
             before(grammarAccess.getStateMachineAccess().getInitAssignment_1_1_1()); 
            // InternalStateMachine.g:530:2: ( rule__StateMachine__InitAssignment_1_1_1 )
            // InternalStateMachine.g:530:3: rule__StateMachine__InitAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__InitAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getInitAssignment_1_1_1()); 

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
    // $ANTLR end "rule__StateMachine__Group_1_1__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalStateMachine.g:539:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:543:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateMachine.g:544:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalStateMachine.g:551:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:555:1: ( ( () ) )
            // InternalStateMachine.g:556:1: ( () )
            {
            // InternalStateMachine.g:556:1: ( () )
            // InternalStateMachine.g:557:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalStateMachine.g:558:2: ()
            // InternalStateMachine.g:558:3: 
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
    // InternalStateMachine.g:566:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:570:1: ( rule__State__Group__1__Impl )
            // InternalStateMachine.g:571:2: rule__State__Group__1__Impl
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
    // InternalStateMachine.g:577:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:581:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalStateMachine.g:582:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:582:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalStateMachine.g:583:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:584:2: ( rule__State__NameAssignment_1 )
            // InternalStateMachine.g:584:3: rule__State__NameAssignment_1
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
    // InternalStateMachine.g:593:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:597:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalStateMachine.g:598:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalStateMachine.g:605:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Alternatives_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:609:1: ( ( ( rule__Transition__Alternatives_0 ) ) )
            // InternalStateMachine.g:610:1: ( ( rule__Transition__Alternatives_0 ) )
            {
            // InternalStateMachine.g:610:1: ( ( rule__Transition__Alternatives_0 ) )
            // InternalStateMachine.g:611:2: ( rule__Transition__Alternatives_0 )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives_0()); 
            // InternalStateMachine.g:612:2: ( rule__Transition__Alternatives_0 )
            // InternalStateMachine.g:612:3: rule__Transition__Alternatives_0
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
    // InternalStateMachine.g:620:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:624:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalStateMachine.g:625:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalStateMachine.g:632:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__FromAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:636:1: ( ( ( rule__Transition__FromAssignment_1 ) ) )
            // InternalStateMachine.g:637:1: ( ( rule__Transition__FromAssignment_1 ) )
            {
            // InternalStateMachine.g:637:1: ( ( rule__Transition__FromAssignment_1 ) )
            // InternalStateMachine.g:638:2: ( rule__Transition__FromAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_1()); 
            // InternalStateMachine.g:639:2: ( rule__Transition__FromAssignment_1 )
            // InternalStateMachine.g:639:3: rule__Transition__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromAssignment_1()); 

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
    // InternalStateMachine.g:647:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:651:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalStateMachine.g:652:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalStateMachine.g:659:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:663:1: ( ( '->' ) )
            // InternalStateMachine.g:664:1: ( '->' )
            {
            // InternalStateMachine.g:664:1: ( '->' )
            // InternalStateMachine.g:665:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalStateMachine.g:674:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:678:1: ( rule__Transition__Group__3__Impl )
            // InternalStateMachine.g:679:2: rule__Transition__Group__3__Impl
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
    // InternalStateMachine.g:685:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__ToAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:689:1: ( ( ( rule__Transition__ToAssignment_3 ) ) )
            // InternalStateMachine.g:690:1: ( ( rule__Transition__ToAssignment_3 ) )
            {
            // InternalStateMachine.g:690:1: ( ( rule__Transition__ToAssignment_3 ) )
            // InternalStateMachine.g:691:2: ( rule__Transition__ToAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_3()); 
            // InternalStateMachine.g:692:2: ( rule__Transition__ToAssignment_3 )
            // InternalStateMachine.g:692:3: rule__Transition__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_3()); 

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


    // $ANTLR start "rule__StateMachine__NameAssignment_0_2"
    // InternalStateMachine.g:701:1: rule__StateMachine__NameAssignment_0_2 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:705:1: ( ( ruleEString ) )
            // InternalStateMachine.g:706:2: ( ruleEString )
            {
            // InternalStateMachine.g:706:2: ( ruleEString )
            // InternalStateMachine.g:707:3: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__StateMachine__NameAssignment_0_2"


    // $ANTLR start "rule__StateMachine__StatesAssignment_0_3_1"
    // InternalStateMachine.g:716:1: rule__StateMachine__StatesAssignment_0_3_1 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:720:1: ( ( ruleState ) )
            // InternalStateMachine.g:721:2: ( ruleState )
            {
            // InternalStateMachine.g:721:2: ( ruleState )
            // InternalStateMachine.g:722:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0()); 

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
    // $ANTLR end "rule__StateMachine__StatesAssignment_0_3_1"


    // $ANTLR start "rule__StateMachine__TransitionAssignment_1_0_1"
    // InternalStateMachine.g:731:1: rule__StateMachine__TransitionAssignment_1_0_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:735:1: ( ( ruleTransition ) )
            // InternalStateMachine.g:736:2: ( ruleTransition )
            {
            // InternalStateMachine.g:736:2: ( ruleTransition )
            // InternalStateMachine.g:737:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__StateMachine__TransitionAssignment_1_0_1"


    // $ANTLR start "rule__StateMachine__InitAssignment_1_1_1"
    // InternalStateMachine.g:746:1: rule__StateMachine__InitAssignment_1_1_1 : ( ruleState ) ;
    public final void rule__StateMachine__InitAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:750:1: ( ( ruleState ) )
            // InternalStateMachine.g:751:2: ( ruleState )
            {
            // InternalStateMachine.g:751:2: ( ruleState )
            // InternalStateMachine.g:752:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getInitStateParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getInitStateParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__StateMachine__InitAssignment_1_1_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalStateMachine.g:761:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:765:1: ( ( ruleEString ) )
            // InternalStateMachine.g:766:2: ( ruleEString )
            {
            // InternalStateMachine.g:766:2: ( ruleEString )
            // InternalStateMachine.g:767:3: ruleEString
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


    // $ANTLR start "rule__Transition__FromAssignment_1"
    // InternalStateMachine.g:776:1: rule__Transition__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Transition__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:780:1: ( ( ( ruleEString ) ) )
            // InternalStateMachine.g:781:2: ( ( ruleEString ) )
            {
            // InternalStateMachine.g:781:2: ( ( ruleEString ) )
            // InternalStateMachine.g:782:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getFromStateCrossReference_1_0()); 
            // InternalStateMachine.g:783:3: ( ruleEString )
            // InternalStateMachine.g:784:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getFromStateEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getFromStateEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getFromStateCrossReference_1_0()); 

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
    // $ANTLR end "rule__Transition__FromAssignment_1"


    // $ANTLR start "rule__Transition__ToAssignment_3"
    // InternalStateMachine.g:795:1: rule__Transition__ToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:799:1: ( ( ( ruleEString ) ) )
            // InternalStateMachine.g:800:2: ( ( ruleEString ) )
            {
            // InternalStateMachine.g:800:2: ( ( ruleEString ) )
            // InternalStateMachine.g:801:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_3_0()); 
            // InternalStateMachine.g:802:3: ( ruleEString )
            // InternalStateMachine.g:803:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getToStateEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getToStateEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateCrossReference_3_0()); 

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
    // $ANTLR end "rule__Transition__ToAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});

}