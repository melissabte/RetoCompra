/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package reto.sophos.tasks;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;


public class AbrirElNavegador implements Task {
	private PageObject page;
	public AbrirElNavegador(PageObject page) {
		this.page = page;
	}
	@Override
	@Step("{0} goes to #OpenTheBrowser")  
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo((Open.browserOn(page)));
		
	}public static AbrirElNavegador at(PageObject page) {
		return instrumented(AbrirElNavegador.class, page) ;
	}
}




