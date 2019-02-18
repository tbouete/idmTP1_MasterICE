/**
 * generated by Xtext 2.12.0
 */
package iDM_Test.generator;

import iDM_Test.StateMachine;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StateMachineGenerator extends AbstractGenerator {
  private StateMachine stateMachine;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _get = resource.getContents().get(0);
    this.stateMachine = ((StateMachine) _get);
    fsa.generateFile("StateManager.java", this.stateManagerClass());
    String _firstUpper = StringExtensions.toFirstUpper(this.stateMachine.getName());
    String _plus = (_firstUpper + ".java");
    fsa.generateFile(_plus, this.getStateMachineClass());
    fsa.generateFile("State.java", this.stateClass());
    fsa.generateFile("Transition.java", this.transitionClass());
  }
  
  public CharSequence getStateMachineClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import State;");
    _builder.newLine();
    _builder.append("import Transition;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(this.stateMachine.getName());
    _builder.append(_firstUpper);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private State initState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<State> stateList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Transition> transitionList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(this.stateMachine.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("(State init) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.name = ");
    String _firstUpper_2 = StringExtensions.toFirstUpper(this.stateMachine.getName());
    _builder.append(_firstUpper_2, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.initState = init;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.stateList = new ArrayList<State>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.transitionList = new ArrayList<Transition>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getName(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State getInitState(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.initState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<State> getStateList(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.stateList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addState(State newState){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.stateList.add(newState);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Transition> getTransitionList(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.transitionList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addtransition(Transition newTransition){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.transitionList.add(newTransition);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence stateClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package states;");
    _builder.newLine();
    _builder.append("import Transition;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class State {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Transition> incoming;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Transition> outgoing;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State(String name){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.incomimng = new ArrayList<Transition>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.outgoing =  new ArrayList<Transition>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getName(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Transition> getIncoming(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.incomimng;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addIncoming(Transition newIncoming) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.incomimng.add(newIncoming);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Transition> getOutgoing(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.outgoing;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addOutgoing(Transition newOutgoing) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.outgoing.add(newOutgoing);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence transitionClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("improt state.*");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Transition {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<State> from;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<State> to;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Transition(String name){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.from = new ArrayList<State>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.to =   new ArrayList<State>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getName(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Transition> getFrom(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.from;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addFrom(Transition newFrom) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.from.add(newFrom);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Transition> getTo(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return this.to;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addTo(Transition newTo) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.to.add(newTo);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence stateManagerClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static void main(String[] args){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//create and add States");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//create and add Transitions");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//create StateMachine");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//runStateMachine()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}