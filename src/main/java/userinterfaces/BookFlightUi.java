package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookFlightUi extends PageObject {
	public static final Target TXT_ORIGIN_FLIGHT = Target.the("Input origin flight").located(By.xpath(
			"//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));

	public static final Target TXT_DESTINATION_FLIGHT = Target.the("Input destination flight").located(By.xpath(
			"//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));

	public static final Target BTN_DATES = Target.the("Button dates").located(By.xpath(
			"//body/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]"));

	public static final Target SELECT_DEPARTURE_DATE = Target.the("Select departure date")
			.located(By.xpath("//body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[12]/div[1]"));

	public static final Target SELECT_RETURN_DATE = Target.the("Select departure date")
			.located(By.xpath("//body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[22]/div[1]"));

	public static final Target BTN_APPLY = Target.the("Button apply")
			.located(By.xpath("//button[@class='sbox5-3-btn -primary -md']"));

	public static final Target BTN_SEARCH = Target.the("Button search flights")
			.located(By.cssSelector("button.sbox5-box-button-ovr--3LK5x"));

	public static final Target BTN_BUY = Target.the("Button buy")
			.located(By.xpath("//body/div[@id='flights-container-wrapper']"
					+ "/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[4]/app-root[1]/app-common[1]/"
					+ "items[1]/div[1]/span[1]/div[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/div[2]/buy-button[1]/a[1]"));

	public static final Target BTN_CONTINUE = Target.the("Button continue")
			.located(By.cssSelector("button.eva-3-btn.pricebox-sticky-button"));

	public static final Target MESSAGE_FINAL = Target.the("Message final")
			.located(By.xpath("//h2[contains(text(),'�Falta poco! Completa tus datos y finaliza tu comp')]"));

}
