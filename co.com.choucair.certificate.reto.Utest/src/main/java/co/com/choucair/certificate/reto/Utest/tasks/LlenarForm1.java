package co.com.choucair.certificate.reto.Utest.tasks;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class LlenarForm1 implements Task {

    private String firstName;
    private String lastName;
    private String email;

    public LlenarForm1(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static LlenarForm1 datos(String firstName, String lastName, String email) {
        return Tasks.instrumented(LlenarForm1.class, firstName, lastName, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.theValue(firstName).into(LocalizadoresForm1.FIRST_NAME),
                Enter.theValue(lastName).into(LocalizadoresForm1.LAST_NAME),
                Enter.theValue(email).into(LocalizadoresForm1.EMAIL),

                Click.on(LocalizadoresForm1.MONTH),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.MONTH),
                Hit.the(Keys.ENTER).into(LocalizadoresForm1.MONTH),

                Click.on(LocalizadoresForm1.DAY),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.DAY),
                Hit.the(Keys.ENTER).into(LocalizadoresForm1.DAY),

                Click.on(LocalizadoresForm1.YEAR),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.YEAR),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.YEAR),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.YEAR),
                Hit.the(Keys.ENTER).into(LocalizadoresForm1.YEAR),

                Click.on(LocalizadoresForm1.TEXT_BOX),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.TEXT_BOX),
                Hit.the(Keys.ARROW_DOWN).into(LocalizadoresForm1.TEXT_BOX),
                Hit.the(Keys.ENTER).into(LocalizadoresForm1.TEXT_BOX),

                Click.on(LocalizadoresForm1.NEXT1)
        );

    }
}
