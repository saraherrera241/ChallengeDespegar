package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.BookFlightUi;

public class BuyFlight implements Task {
	public BuyFlight() {

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BookFlightUi.BTN_BUY),
				Click.on(BookFlightUi.BTN_CONTINUE));

	}

	public static BuyFlight buy() {
		return Tasks.instrumented(BuyFlight.class);
	}
}
