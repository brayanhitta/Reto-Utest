package co.com.choucair.certificate.reto.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoresForm1 extends PageObject {
    public static final Target BOTOB_JOIN = Target.the("Localizador del boton Join Today")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target FIRST_NAME = Target.the("Localizador del firstname")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Localizador del lastname")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Localizador del email")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("Localizados del month")
            .located(By.id("birthMonth"));
    public static final Target DAY = Target.the("Localizador del day")
            .located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Localizador del year")
            .located(By.id("birthYear"));
    public static final Target TEXT_BOX = Target.the("Localizador del lenguage")
            .located(By.xpath("//input[@type='search']"));
    public static final Target NEXT1 = Target.the("Localizador del boton next")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target VALIDATE_TEXT = Target.the("Localizador del texto principal")
            .located(By.xpath("//div[@class='image-box-header']"));
}
