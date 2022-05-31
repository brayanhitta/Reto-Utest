package co.com.choucair.certificate.reto.Utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoresForm4 extends PageObject {
    public static final Target PASSWORD = Target.the("Localizador del campo de texto")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Localizador del campo de texto")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_CONDUCT = Target.the("Localizador del check box condcut")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("Localizador del check box privacy")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETE = Target.the("Localizador del boton complete setup")
            .located(By.id("laddaBtn"));
}
