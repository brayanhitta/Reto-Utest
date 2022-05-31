package co.com.choucair.certificate.reto.Utest.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crear_usuario.feature",
        tags = "@HU001",
        glue = "co.com.choucair.certificate.reto.Utest.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class runnerTags {
}
