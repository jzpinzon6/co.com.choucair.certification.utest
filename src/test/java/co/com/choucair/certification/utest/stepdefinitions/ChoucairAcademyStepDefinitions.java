package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.tasks.Login;
import co.com.choucair.certification.utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Javier wants to take a test to enter the platform$")
    public void thanJavierWantsToTakeATestToEnterThePlatform() {
        OnStage.theActorCalled("Javier").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^when He search  to automate the entrance to the portal (.*) and automate the creation of new users$")
    public void whenHeSearchToAutomateTheEntranceToThePortalAndAutomateTheCreationOfNewUsers() {

    }

    @Then("^then he finds through the process of creating a new user$")
    public void thenHeFindsThroughTheProcessOfCreatingANewUser() {

    }


}
