package reto.sophos.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/reto/sophos/features/reto.feature",


		glue = { "reto.sophos.stepdefinitions" }, snippets = SnippetType.CAMELCASE)

public class RetoCompra {

}

