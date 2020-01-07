
package reto.sophos.userinterfaces;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("https://www.plazavea.com.pe/")


public class PantallaInicial extends PageObject {
public static final Target BUSCADOR= Target.the("buscador de la pagina").located(By.id("search_box"));
public static final Target PRODUCTO= Target.the("producto a seleccionar").located(By.xpath("//ul[1]//li[2]//figure[@class='Showcase__photo']"));
public static final Target AGREGAR_PRODUCTO= Target.the("agregar producto al carrito de compras").located(By.xpath("//*[@id=\"ProductCard__add-to-cart\"]"));
public static final Target TEXTO_VERIFICACION= Target.the("texto de verificacion de producto agregado en el carrito de compras").located(By.xpath("//span[@class='minicart__snackbar__text']"));



}


