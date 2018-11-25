package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import testBase.BaseClass;

public class AirlineSearchPage extends BaseClass {

	private static By flightLinklocator = By.xpath("//*[@id='body-section']/section/div[2]/div/div/div[2]/ul/li[2]/a");
	private static By searchFromAirportlocator = By.xpath("//*[@id='s2id_location_from']");
	private static By enterFromCitylocator = By.xpath("//*[@id='select2-drop']/div/input");
	private static By londonAirportlocator = By.xpath("//*[@id='select2-drop']/ul/li[3]");
	private static By searchToAirportlocator = By.xpath("//*[@id='s2id_location_to']");
	private static By enterToCitylocator = By.xpath("//*[@id='select2-drop']/div/input");
	private static By dubaiAirportlocator = By.xpath("//*[@id='select2-drop']/ul/li[2]");
	private static By selectReturnTripLocator = By.xpath("//*[@id='flights']/form/div[9]/div[2]/div/div/ins");
	private static By departCalenClick = By.xpath("//*[@id='flights']/form/div[3]/div/input");
	private static By clickNextMonth = By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]");
	private static By passengerLinkLocator = By.xpath("//*[@id='flights']/form/div[5]/div/input");
	private static By adultPassengerSelectLocator = By
			.xpath("//*[@id='manual_flightTravelers']/div/div/div[2]/section/div/div[1]/div[1]/select");
	private static By childPassengerSelectLocator = By
			.xpath("//*[@id='manual_flightTravelers']/div/div/div[2]/section/div/div[2]/div[1]/select");
	private static By passengerSelectDoneButton = By.xpath("//*[@id=\"sumManualPassenger\"]");
	private static By searchButton = By.xpath("//div[@id='flights']/form/div[6]/button[@type='submit']");

	public void phpHomepage() {
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.MILLISECONDS);
	}

	public void flightClick() {
		WebElement travelOptions = driver.findElement(flightLinklocator);
		travelOptions.click();
	}

	public void selectFromLondon() {

		WebElement citySearchbox = driver.findElement(searchFromAirportlocator);
		customwait.Custom_wait(driver, citySearchbox);
		citySearchbox.click();

		WebElement enterToCity = driver.findElement(enterFromCitylocator);
		enterToCity.sendKeys("London");

		WebElement londonAirportSelect = driver.findElement(londonAirportlocator);
		customwait.Custom_wait(driver, londonAirportSelect);
		londonAirportSelect.click();

	}

	public void selectToDubai() {

		WebElement toAirortSearchbox = driver.findElement(searchToAirportlocator);
		toAirortSearchbox.click();

		WebElement entertoToDubai = driver.findElement(enterToCitylocator);
		entertoToDubai.sendKeys("Dubai");

		WebElement airportSelect = driver.findElement(dubaiAirportlocator);
		airportSelect.click();

	}

	public void selectReturnTrip() {

		WebElement returnTripCheckBox = driver.findElement(selectReturnTripLocator);
		returnTripCheckBox.click();
	}

	public void selectDepartueDat() {

		driver.findElement(departCalenClick).click();
		driver.findElement(clickNextMonth).click();

		String xpath1 = "/html/body/div[14]/div[1]/table/tbody/tr[";
		String xpath2 = "]/td[";
		String xpath3 = "]";

		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 7; c++) {

				WebElement innerText = driver.findElement(By.xpath(xpath1 + r + xpath2 + c + xpath3));
				String date = "8";
				if (innerText.getText().equals(date)) {
					innerText.click();
					break;
				}
			}
		}
	}

	public void selectReturnDate() {

		String toxpath1 = "/html/body/div[15]/div[1]/table/tbody/tr[";
		String toxpath2 = "]/td[";
		String toxpath3 = "]";

		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 7; c++) {
				WebElement innerText = driver.findElement(By.xpath(toxpath1 + r + toxpath2 + c + toxpath3));

				String date = "21";
				if (innerText.getText().equals(date)) {
					innerText.click();
					break;
				}
			}
		}
	}

	public void selectAdult() {

		driver.findElement(passengerLinkLocator).click();
		WebElement adultDrop = driver.findElement(adultPassengerSelectLocator);
		Select adultSelect = new Select(adultDrop);
		adultSelect.selectByValue("2");

	}

	public void selectChild() {
		WebElement childDrop = driver.findElement(childPassengerSelectLocator);
		Select childSelect = new Select(childDrop);
		childSelect.selectByValue("2");
		driver.findElement(passengerSelectDoneButton).click();
	}

	public void clickSearchButton() {
	
		WebElement searchButtonwait = driver.findElement(searchButton);
		customwait.Custom_wait(driver, searchButtonwait);
		searchButtonwait.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void i_filter_by_the_following_flight_carrier(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	public void bookCheapestprice() {

	}

	public void bookingPage() {

	}

}
