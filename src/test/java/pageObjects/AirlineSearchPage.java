package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

	public void departueDat(int arg1) {

	}

	public void i_select_return_date_weeks_from_departure_date(int arg1) {

	}

	public void i_select_Adult(int arg1) {

	}

	public void i_select_Child(int arg1) {

	}

	public void i_click_SEARCH_button() {

	}

	public void i_filter_by_the_following_flight_carrier(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	public void i_click_on_BOOK_NOW_with_the_cheapest_price() {

	}

	public void i_am_taken_to_booking_page() {

	}

}
