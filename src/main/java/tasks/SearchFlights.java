package tasks;



import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import userinterfaces.BookFlightUi;

public class SearchFlights implements Task {
	private String originFlight;
	private String destinationFlight;

	public SearchFlights(String originFlight, String destinationFlight) {
		this.originFlight = originFlight;
		this.destinationFlight = destinationFlight;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(originFlight).into(BookFlightUi.TXT_ORIGIN_FLIGHT),
				Hit.the(Keys.ENTER).keyIn(BookFlightUi.TXT_ORIGIN_FLIGHT),
				Enter.theValue(destinationFlight).into(BookFlightUi.TXT_DESTINATION_FLIGHT),
				Hit.the(Keys.ENTER).keyIn(BookFlightUi.TXT_DESTINATION_FLIGHT), Click.on(BookFlightUi.BTN_DATES),
				Click.on(BookFlightUi.SELECT_DEPARTURE_DATE), Click.on(BookFlightUi.SELECT_RETURN_DATE),
				Click.on(BookFlightUi.BTN_APPLY), Click.on(BookFlightUi.BTN_SEARCH));
		
	
		

	}

	public static SearchFlights search(String originFlight, String destinationFlight) {
		return Tasks.instrumented(SearchFlights.class, originFlight, destinationFlight);
	}
}
