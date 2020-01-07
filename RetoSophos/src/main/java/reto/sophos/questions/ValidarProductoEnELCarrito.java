/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package reto.sophos.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarProductoEnELCarrito implements Question<String>{
    private Target target;

    public ValidarProductoEnELCarrito(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(target).viewedBy(actor).value();

    }

    public static ValidarProductoEnELCarrito decompra(Target mensaje) {

        return new ValidarProductoEnELCarrito(mensaje);
    }


}
