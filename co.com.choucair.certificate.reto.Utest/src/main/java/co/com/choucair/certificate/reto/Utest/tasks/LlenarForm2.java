package co.com.choucair.certificate.reto.Utest.tasks;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class LlenarForm2 implements Task {

    private String city;
    private String postalCode;

    public LlenarForm2(String city, String postalCode) {
        this.city = city;
        this.postalCode = postalCode;
    }

    public static LlenarForm2 datos(String city, String postalCode) {
        return Tasks.instrumented(LlenarForm2.class, city, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Clear.field(LocalizadoresForm2.CITY),
                Enter.theValue(city).into(LocalizadoresForm2.CITY),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm2.CITY),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm2.CITY),
                Hit.the(Keys.ENTER).into(LocalizadoresForm2.CITY),

                Clear.field(LocalizadoresForm2.POSTAL_CODE),
                Enter.theValue(postalCode).into(LocalizadoresForm2.POSTAL_CODE),

                Click.on(LocalizadoresForm2.NEXT)
        );

    }
}
