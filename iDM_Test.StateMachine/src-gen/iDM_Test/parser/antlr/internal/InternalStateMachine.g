/*
 * generated by Xtext 2.12.0
 */
grammar InternalStateMachine;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package iDM_Test.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	iv_ruleStateMachine=ruleStateMachine
	{ $current=$iv_ruleStateMachine.current; }
	EOF;

// Rule StateMachine
ruleStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStateMachineAccess().getStateMachineAction_0_0(),
						$current);
				}
			)
			otherlv_1='StateMachine'
			{
				newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_0_2_0());
					}
					lv_name_2_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateMachineRule());
						}
						set(
							$current,
							"name",
							lv_name_2_0,
							"iDM_Test.StateMachine.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3='state'
				{
					newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getStateKeyword_0_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_0_3_1_0());
						}
						lv_states_4_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStateMachineRule());
							}
							add(
								$current,
								"states",
								lv_states_4_0,
								"iDM_Test.StateMachine.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			(
				otherlv_5='transition'
				{
					newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getTransitionKeyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_1_0_1_0());
						}
						lv_transition_6_0=ruleTransition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStateMachineRule());
							}
							add(
								$current,
								"transition",
								lv_transition_6_0,
								"iDM_Test.StateMachine.Transition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			(
				otherlv_7='init'
				{
					newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getInitKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStateMachineAccess().getInitStateParserRuleCall_1_1_1_0());
						}
						lv_init_8_0=ruleState
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStateMachineRule());
							}
							set(
								$current,
								"init",
								lv_init_8_0,
								"iDM_Test.StateMachine.State");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStateAccess().getStateAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"iDM_Test.StateMachine.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='open'
			{
				newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOpenKeyword_0_0());
			}
			    |
			otherlv_1='close'
			{
				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getCloseKeyword_0_1());
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_3_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
