package questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerifyMessage implements Question<String>{
	private Target target;

	public VerifyMessage(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		 actor.attemptsTo(WaitUntil.the(target, isVisible()).forNoMoreThan(1).seconds());
		 return target.resolveFor(actor).getText();

	}

	public static VerifyMessage value(Target target) {
		return new VerifyMessage(target);

	}


}
