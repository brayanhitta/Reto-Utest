package co.com.choucair.certificate.reto.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoresForm2 extends PageObject {
    public static final Target CITY = Target.the("Localizador del city")
            .located(By.id("city"));
    public static final Target POSTAL_CODE = Target.the("Localizador del postal code")
            .located(By.id("zip"));
    public static final Target NEXT = Target.the("Localizador del boton next")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
