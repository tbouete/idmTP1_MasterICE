package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'state'", "'transition'", "'close'", "'open'", "'->'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalMyDsl.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalMyDsl.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
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
    // InternalMyDsl.g:71:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )* (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )* ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_states_4_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )* (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )* ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )* (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )* )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )* (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )* )
            // InternalMyDsl.g:79:3: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )* (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0());
            				
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
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:109:3: (otherlv_3= 'state' ( (lv_states_4_0= ruleState ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:110:4: otherlv_3= 'state' ( (lv_states_4_0= ruleState ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getStateKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:114:4: ( (lv_states_4_0= ruleState ) )
            	    // InternalMyDsl.g:115:5: (lv_states_4_0= ruleState )
            	    {
            	    // InternalMyDsl.g:115:5: (lv_states_4_0= ruleState )
            	    // InternalMyDsl.g:116:6: lv_states_4_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:134:3: (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:135:4: otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) )
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getTransitionKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:139:4: ( (lv_transition_6_0= ruleTransition ) )
            	    // InternalMyDsl.g:140:5: (lv_transition_6_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:140:5: (lv_transition_6_0= ruleTransition )
            	    // InternalMyDsl.g:141:6: lv_transition_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_4_1_0());
            	    					
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
            	    							"org.xtext.example.mydsl.MyDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // InternalMyDsl.g:163:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:163:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:164:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:170:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:176:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:177:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:177:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:178:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:186:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:197:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:197:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:198:2: iv_ruleState= ruleState EOF
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
    // InternalMyDsl.g:204:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:210:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:211:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:211:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:212:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:212:3: ()
            // InternalMyDsl.g:213:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:219:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:220:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:220:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:221:5: lv_name_1_0= ruleEString
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
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // InternalMyDsl.g:242:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:242:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:243:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalMyDsl.g:249:1: ruleTransition returns [EObject current=null] : ( (otherlv_0= 'close' | otherlv_1= 'open' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( ( (otherlv_0= 'close' | otherlv_1= 'open' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:256:2: ( (otherlv_0= 'close' | otherlv_1= 'open' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:256:2: ( (otherlv_0= 'close' | otherlv_1= 'open' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) ) )
            // InternalMyDsl.g:257:3: (otherlv_0= 'close' | otherlv_1= 'open' ) ( ( ruleEString ) ) otherlv_3= '->' ( ( ruleEString ) )
            {
            // InternalMyDsl.g:257:3: (otherlv_0= 'close' | otherlv_1= 'open' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:258:4: otherlv_0= 'close'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getCloseKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:4: otherlv_1= 'open'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getOpenKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:268:3: ( ( ruleEString ) )
            // InternalMyDsl.g:269:4: ( ruleEString )
            {
            // InternalMyDsl.g:269:4: ( ruleEString )
            // InternalMyDsl.g:270:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalMyDsl.g:288:3: ( ( ruleEString ) )
            // InternalMyDsl.g:289:4: ( ruleEString )
            {
            // InternalMyDsl.g:289:4: ( ruleEString )
            // InternalMyDsl.g:290:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_3_0());
            				
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});

}