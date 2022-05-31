package co.com.choucair.certificate.reto.Utest.questions;

import co.com.choucair.certificate.reto.Utest.userinterface.LocalizadoresForm1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Validar implements Question {

    public static Validar creacion() {
        return new Validar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LocalizadoresForm1.VALIDATE_TEXT).getText();
    }
}
