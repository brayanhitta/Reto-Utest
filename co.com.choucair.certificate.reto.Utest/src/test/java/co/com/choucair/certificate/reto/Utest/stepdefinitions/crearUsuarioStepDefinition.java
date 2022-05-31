package co.com.choucair.certificate.reto.Utest.stepdefinitions;

import co.com.choucair.certificate.reto.Utest.questions.Validar;
import co.com.choucair.certificate.reto.Utest.tasks.LlenarForm1;
import co.com.choucair.certificate.reto.Utest.tasks.LlenarForm2;
import co.com.choucair.certificate.reto.Utest.tasks.LlenarForm3;
import co.com.choucair.certificate.reto.Utest.tasks.LlenarForm4;
import co.com.choucair.certificate.reto.Utest.tasks.SeleccionarBotonJoinTaday;
import co.com.choucair.certificate.reto.Utest.tasks.SeleccionarBotonCompleteSetup;
import co.com.choucair.certificate.reto.Utest.tasks.Abrir;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;


public class crearUsuarioStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Brayan se encuentra en la pagina Utest$")
    public void queBrayanSeEncuentraEnLaPaginaUtest() {
        OnStage.theActorCalled("Brayan").wasAbleTo(Abrir.pagina());
    }

    @Y("^da clic en el boton Join Today$")
    public void daClicEnElBotonJoinToday(){
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonJoinTaday.usuario());
    }

    @Cuando("^ingresa datos en el formulario step1$")
    public void ingresaDatosEnElFormularioStep1(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> dato : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(LlenarForm1.datos(
                    dato.get(0), dato.get(1), dato.get(2)));
        }
    }
    @Y("^ingresa datos en el formulario step2$")
    public void ingresaDatosEnElFormularioStep2(DataTable dataTable){
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> dato : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(LlenarForm2.datos(
                    dato.get(0), dato.get(1)));
        }

    }
    @Y("^ingresa datos en el formulario step3$")
    public void ingresaDatosEnElFormularioStep3(){
            OnStage.theActorInTheSpotlight().attemptsTo(LlenarForm3.datos());

    }

    @Y("^ingresa datos en el formulario step4$")
    public void ingresaDatosEnElFormularioStep4(DataTable dataTable){
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> dato : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(LlenarForm4.datos(
                    dato.get(0), dato.get(1)));
        }
    }

    @Y("^crea el usuario$")
    public void creaElUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarBotonCompleteSetup.usuario());
    }

    @Entonces("^verifica que se regrese a la pagina principal$")
    public void verificaQueSeRegreseALaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Validación pagina", Validar.creacion(),
                Matchers.equalTo("Welcome to the world's largest community of freelance software testers!")));
    }
}
