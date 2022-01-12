package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/BookFlight.feature", 
tags = "@BookFlight", 
glue = "stepdefinitions", 
snippets = SnippetType.CAMELCASE)
public class BookFlightRunner {

}
