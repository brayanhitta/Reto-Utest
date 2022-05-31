package co.com.choucair.certificate.reto.Utest.tasks;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonCompleteSetup implements Task {

    public static SeleccionarBotonCompleteSetup usuario() {
        return Tasks.instrumented(SeleccionarBotonCompleteSetup.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocalizadoresForm4.BOTON_COMPLETE)
        );

    }
}
