/*
 * generated by Xtext 2.12.0
 */
package iDM_Test.serializer;

import com.google.inject.Inject;
import iDM_Test.services.StateMachineGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class StateMachineSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StateMachineGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Transition_CloseKeyword_0_1_or_OpenKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StateMachineGrammarAccess) access;
		match_Transition_CloseKeyword_0_1_or_OpenKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransitionAccess().getCloseKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getTransitionAccess().getOpenKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Transition_CloseKeyword_0_1_or_OpenKeyword_0_0.equals(syntax))
				emit_Transition_CloseKeyword_0_1_or_OpenKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'open' | 'close'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) from=[State|EString]
	 */
	protected void emit_Transition_CloseKeyword_0_1_or_OpenKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
