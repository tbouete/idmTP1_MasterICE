/*
 * generated by Xtext 2.12.0
 */
package iDM_Test.ide

import com.google.inject.Guice
import iDM_Test.StateMachineRuntimeModule
import iDM_Test.StateMachineStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class StateMachineIdeSetup extends StateMachineStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new StateMachineRuntimeModule, new StateMachineIdeModule))
	}
	
}