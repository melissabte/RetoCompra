package reto.sophos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import reto.sophos.interactions.Esperar;
import reto.sophos.userinterfaces.PantallaInicial;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PantallaInicial.PRODUCTO),Click.on(PantallaInicial.AGREGAR_PRODUCTO));
    }
    public static SeleccionarProducto seleccionando() {
        return instrumented(SeleccionarProducto.class);
    }

}
