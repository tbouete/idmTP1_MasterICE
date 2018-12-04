/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import iDM_Test.StateMachine;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.tests.MyDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  private ParseHelper<StateMachine> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final StateMachine result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
