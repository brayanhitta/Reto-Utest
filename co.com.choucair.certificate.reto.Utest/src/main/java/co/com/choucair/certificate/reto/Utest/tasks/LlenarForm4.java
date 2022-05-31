package co.com.choucair.certificate.reto.Utest.tasks;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarForm4 implements Task {

    private String password;
    private String confirmPassword;

    public LlenarForm4(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static LlenarForm4 datos(String password, String confirmPassword) {
        return Tasks.instrumented(LlenarForm4.class, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.keyValues(password).into(LocalizadoresForm4.PASSWORD),
                Enter.keyValues(confirmPassword).into(LocalizadoresForm4.CONFIRM_PASSWORD),
                Click.on(LocalizadoresForm4.CHECK_CONDUCT),
                Click.on(LocalizadoresForm4.CHECK_PRIVACY)
        );

    }
}
