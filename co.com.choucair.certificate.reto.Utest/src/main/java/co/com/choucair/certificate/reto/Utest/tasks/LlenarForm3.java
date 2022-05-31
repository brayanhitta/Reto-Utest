package co.com.choucair.certificate.reto.Utest.tasks;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class LlenarForm3 implements Task {
    public static LlenarForm3 datos() {
        return Tasks.instrumented(LlenarForm3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocalizadoresForm3.MOBILE));
        try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm3.MOBILE_APPLE),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm3.MOBILE_APPLE),
                Hit.the(Keys.ENTER).into(LocalizadoresForm3.MOBILE_APPLE),

                Click.on(LocalizadoresForm3.MODEL),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm3.MODEL_MOBILE),
                Hit.the(Keys.ENTER).into(LocalizadoresForm3.MODEL_MOBILE),

                Click.on(LocalizadoresForm3.SYSTEM),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm3.SYSTEM_OS),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm3.SYSTEM_OS),
                Hit.the(Keys.ENTER).into(LocalizadoresForm3.SYSTEM_OS),
                Click.on(LocalizadoresForm3.NEXT)
        );

    }
}
