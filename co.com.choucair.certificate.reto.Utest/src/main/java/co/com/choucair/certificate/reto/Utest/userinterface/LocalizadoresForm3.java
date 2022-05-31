package co.com.choucair.certificate.reto.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoresForm3 extends PageObject {
    public static final Target MOBILE = Target.the("Localizador del mobile")
            .located(By.name("handsetMakerId"));
    public static final Target MOBILE_APPLE = Target.the("Localizador de la marca a seleccionar")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target MODEL = Target.the("Localizador del model")
            .located(By.name("handsetModelId"));
    public static final Target MODEL_MOBILE = Target.the("Localizador del modelo a seleccionar")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target SYSTEM = Target.the("Localizador del system")
            .located(By.name("handsetOSId"));
    public static final Target SYSTEM_OS = Target.the("Localizador del sistema operativo a seleccionar")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT = Target.the("Localizador del boton next")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));



}
