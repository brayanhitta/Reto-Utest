package co.com.choucair.certificate.reto.Utest.tasks;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarBotonJoinTaday implements Task {


    public static SeleccionarBotonJoinTaday usuario() {
        return Tasks.instrumented(SeleccionarBotonJoinTaday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocalizadoresForm1.BOTOB_JOIN)
        );
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
