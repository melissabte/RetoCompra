package reto.sophos.stepdefinitions;

import net.thucydides.core.annotations.Managed;
import reto.sophos.exceptions.CarroCompras;
import reto.sophos.questions.ValidarProductoEnELCarrito;
import reto.sophos.tasks.AbrirElNavegador;
import reto.sophos.tasks.BuscarProducto;
import reto.sophos.tasks.SeleccionarProducto;
import reto.sophos.userinterfaces.PantallaInicial;
import static reto.sophos.exceptions.CarroCompras.PRODUCTO_EN_EL_CARRITO ;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static reto.sophos.userinterfaces.PantallaInicial.TEXTO_VERIFICACION;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Stepdefinitions {
	@Managed()
	private WebDriver herBrowser;

	private Actor Felipe = Actor.named("Felipe");

	private PantallaInicial pantallainicial;

	@Before
	public void setup() {

		Felipe.can(BrowseTheWeb.with(herBrowser));
		
	}

	@Given("^Que felipe ingresa a la pagina de plaza vea$")
	    public void queFelipeIngresaALaPaginaDePlazaVea() {
	       
			Felipe.wasAbleTo(AbrirElNavegador.at(pantallainicial));
	}
	@When("^Desea buscar un (.*) lo selecciona y envia al carrito de compras$")
	public void deseaBuscarUnTelevisorLoSeleccionaYEnviaAlCarritoDeCompras(String producto) {
		Felipe.attemptsTo(BuscarProducto.buscandoproducto(producto));
		Felipe.attemptsTo(SeleccionarProducto.seleccionando());
	}


@Then("^Muestre el mensaje (.*)$")
public void muestreElProductoEnElCarritoDeCompras(String mensaje) {
	Felipe.should(seeThat(ValidarProductoEnELCarrito.decompra(TEXTO_VERIFICACION), containsString(mensaje))
			.orComplainWith(CarroCompras.class,PRODUCTO_EN_EL_CARRITO ));

}
}