package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.onlinenotepad.tasks.abrirPagina;
import net.onlinenotepad.tasks.escoge;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class stepDefs {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Meli accede a la página online-notepad")
    public void meliAccedeALaPáginaOnlineNotepad() {
        OnStage.theActorCalled("Meli").wasAbleTo(abrirPagina.urlPage());
    }

    @When("ella crea una nota de texto enriquecido con letra en negrita")
    public void ellaCreaUnaNotaDeTextoEnriquecidoConLetraEnNegrita() throws InterruptedException, IOException {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(
                        escoge.laNotadeTextoEnriquecido(),
                        escoge.laLetraenNegrita(),
                        escribir.Nota()
                );
        Thread.sleep(2000);
    }

    @Then("ella visualiza la nota creada")
    public void ellaVisualizaLaNotaCreada() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
