package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import questions.VerifyMessage;
import tasks.BuyFlight;
import tasks.SearchFlights;
import userinterfaces.BookFlightUi;
import userinterfaces.OpenWebSiteUi;
import utils.MessageValidations;

public class BookFlightStepDefinition {
	@Managed(driver = "chrome")
	private WebDriver driver;
	private Actor actor = Actor.named("Actor");

	@Before
	public void configuracionInicial() {
		actor.can(BrowseTheWeb.with(driver));
	}

	@Given("^I open despegar page$")
	public void loginProfilingTool() throws Exception {
		actor.wasAbleTo(Open.browserOn().the(OpenWebSiteUi.class));
	}

	@When("^I search for flights with (.*) and (.*)$")
	public void addIdiom(String originFlight, String destinationFlight) throws Exception {
		actor.attemptsTo(SearchFlights.search(originFlight, destinationFlight));
		actor.attemptsTo(BuyFlight.buy());
	}

	@Then("^I validate Idiom added$")
	public void validateIdiomAdded() {
		actor.should(seeThat(VerifyMessage.value(BookFlightUi.MESSAGE_FINAL),
				containsString(MessageValidations.MESSAGE)));
		driver.close();
	}
}
