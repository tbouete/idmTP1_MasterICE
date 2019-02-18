package iDM_Test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import iDM_Test.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'state'", "'transition'", "'init'", "'open'", "'close'", "'->'"
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

        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:71:1: ruleStateMachine returns [EObject current=null] : ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) ) ) | ( (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) ) ) ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transition_6_0 = null;

        EObject lv_init_8_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) ) ) | ( (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) ) ) ) )
            // InternalStateMachine.g:78:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) ) ) | ( (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) ) ) )
            {
            // InternalStateMachine.g:78:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) ) ) | ( (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachine.g:79:3: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) ) )
                    {
                    // InternalStateMachine.g:79:3: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) ) )
                    // InternalStateMachine.g:80:4: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )
                    {
                    // InternalStateMachine.g:80:4: ()
                    // InternalStateMachine.g:81:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStateMachineAccess().getStateMachineAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0_1());
                    			
                    // InternalStateMachine.g:91:4: ( (lv_name_2_0= ruleEString ) )
                    // InternalStateMachine.g:92:5: (lv_name_2_0= ruleEString )
                    {
                    // InternalStateMachine.g:92:5: (lv_name_2_0= ruleEString )
                    // InternalStateMachine.g:93:6: lv_name_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"iDM_Test.StateMachine.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalStateMachine.g:110:4: (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )
                    // InternalStateMachine.g:111:5: otherlv_3= 'state' ( (lv_states_4_0= ruleState ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getStateKeyword_0_3_0());
                    				
                    // InternalStateMachine.g:115:5: ( (lv_states_4_0= ruleState ) )
                    // InternalStateMachine.g:116:6: (lv_states_4_0= ruleState )
                    {
                    // InternalStateMachine.g:116:6: (lv_states_4_0= ruleState )
                    // InternalStateMachine.g:117:7: lv_states_4_0= ruleState
                    {

                    							newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_states_4_0=ruleState();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    							}
                    							add(
                    								current,
                    								"states",
                    								lv_states_4_0,
                    								"iDM_Test.StateMachine.State");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:137:3: ( (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) ) )
                    {
                    // InternalStateMachine.g:137:3: ( (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) ) )
                    // InternalStateMachine.g:138:4: (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) ) (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) )
                    {
                    // InternalStateMachine.g:138:4: (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )
                    // InternalStateMachine.g:139:5: otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    					newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getTransitionKeyword_1_0_0());
                    				
                    // InternalStateMachine.g:143:5: ( (lv_transition_6_0= ruleTransition ) )
                    // InternalStateMachine.g:144:6: (lv_transition_6_0= ruleTransition )
                    {
                    // InternalStateMachine.g:144:6: (lv_transition_6_0= ruleTransition )
                    // InternalStateMachine.g:145:7: lv_transition_6_0= ruleTransition
                    {

                    							newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_transition_6_0=ruleTransition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    							}
                    							add(
                    								current,
                    								"transition",
                    								lv_transition_6_0,
                    								"iDM_Test.StateMachine.Transition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalStateMachine.g:163:4: (otherlv_7= 'init' ( (lv_init_8_0= ruleState ) ) )
                    // InternalStateMachine.g:164:5: otherlv_7= 'init' ( (lv_init_8_0= ruleState ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    					newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getInitKeyword_1_1_0());
                    				
                    // InternalStateMachine.g:168:5: ( (lv_init_8_0= ruleState ) )
                    // InternalStateMachine.g:169:6: (lv_init_8_0= ruleState )
                    {
                    // InternalStateMachine.g:169:6: (lv_init_8_0= ruleState )
                    // InternalStateMachine.g:170:7: lv_init_8_0= ruleState
                    {

                    							newCompositeNode(grammarAccess.getStateMachineAccess().getInitStateParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_init_8_0=ruleState();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    							}
                    							set(
                    								current,
                    								"init",
                    								lv_init_8_0,
                    								"iDM_Test.StateMachine.State");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEString"
    // InternalStateMachine.g:193:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStateMachine.g:193:47: (iv_ruleEString= ruleEString EOF )
            // InternalStateMachine.g:194:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalStateMachine.g:200:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:206:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStateMachine.g:207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStateMachine.g:207:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalStateMachine.g:208:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:216:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:227:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:227:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:228:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:234:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:240:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalStateMachine.g:241:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalStateMachine.g:241:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalStateMachine.g:242:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalStateMachine.g:242:3: ()
            // InternalStateMachine.g:243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalStateMachine.g:249:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:250:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:250:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:251:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"iDM_Test.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:272:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:272:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:273:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:279:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'open' | otherlv_1= 'close' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStateMachine.g:285:2: ( ( (otherlv_0= 'open' | otherlv_1= 'close' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalStateMachine.g:286:2: ( (otherlv_0= 'open' | otherlv_1= 'close' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalStateMachine.g:286:2: ( (otherlv_0= 'open' | otherlv_1= 'close' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalStateMachine.g:287:3: (otherlv_0= 'open' | otherlv_1= 'close' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            // InternalStateMachine.g:287:3: (otherlv_0= 'open' | otherlv_1= 'close' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalStateMachine.g:288:4: otherlv_0= 'open'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOpenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:293:4: otherlv_1= 'close'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getCloseKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalStateMachine.g:298:3: ( ( ruleEString ) )
            // InternalStateMachine.g:299:4: ( ruleEString )
            {
            // InternalStateMachine.g:299:4: ( ruleEString )
            // InternalStateMachine.g:300:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalStateMachine.g:318:3: ( ( ruleEString ) )
            // InternalStateMachine.g:319:4: ( ruleEString )
            {
            // InternalStateMachine.g:319:4: ( ruleEString )
            // InternalStateMachine.g:320:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});

}