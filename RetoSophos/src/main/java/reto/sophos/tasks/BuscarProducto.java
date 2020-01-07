package reto.sophos.tasks;


import net.thucydides.core.requirements.reports.FileSystemRequirmentsOutcomeFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SendKeys;
import reto.sophos.interactions.Esperar;
import reto.sophos.interactions.RobotJava;
import reto.sophos.userinterfaces.PantallaInicial;

import java.awt.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class BuscarProducto implements Task{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BuscarProducto.class);
	private static String producto;

	public BuscarProducto(String producto) {

		BuscarProducto.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

			
		actor.attemptsTo(SendKeys.of(producto).into(PantallaInicial.BUSCADOR))
		;
		System.out.println("ingreso");
		try {

			new RobotJava();
			Esperar.segundos(4000);
			System.out.println("Ya realizo enter");
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static BuscarProducto buscandoproducto(String producto) { 

		return instrumented(BuscarProducto.class, producto);
}


}
