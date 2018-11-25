package stepDef;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testBase.BaseClass;

public class AirlineSearchStepDef extends BaseClass {

	private String url = "https://www.phptravels.net/";

	@Given("^I visit https://www\\.phptravels\\.net website$")
	public void i_visit_https_www_phptravels_net_website() throws Throwable {
		navigate.navigateTo(url);
	}

	@Given("^I click FLIGHTS$")
	public void i_click_FLIGHTS() throws Throwable {
		airlineSearchPage.flightClick();
	}

	@Given("^I select from London City Arpt$")
	public void i_select_from_London_City_Arpt() throws Throwable {
		airlineSearchPage.selectFromLondon();
		
	}

	@Given("^I select to Dubai Intl Arpt$")
	public void i_select_to_Dubai_Intl_Arpt() throws Throwable {
		airlineSearchPage.selectToDubai();
	}

	@Given("^I select Return Trip$")
	public void i_select_Return_Trip() throws Throwable {
		airlineSearchPage.selectReturnTrip();
	}

	@Given("^I select departure date (\\d+) weeks from today's date$")
	public void i_select_departure_date_weeks_from_today_s_date(int arg1) throws Throwable {
		airlineSearchPage.selectDepartueDat();
	}

	@Given("^I select return date (\\d+) weeks from departure date$")
	public void i_select_return_date_weeks_from_departure_date(int arg1) throws Throwable {
		airlineSearchPage.selectReturnDate();
	}

	@Given("^I select (\\d+) Adult$")
	public void i_select_Adult(int arg1) throws Throwable {
		airlineSearchPage.selectAdult();
	}

	@Given("^I select (\\d+) Child$")
	public void i_select_Child(int arg1) throws Throwable {
		airlineSearchPage.selectChild();
	}

	@When("^I click SEARCH button$")
	public void i_click_SEARCH_button() throws Throwable {
		airlineSearchPage.clickSearchButton();
	}

	@When("^I filter by the following flight carrier$")
	public void i_filter_by_the_following_flight_carrier(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

	@When("^I click on BOOK NOW with the cheapest price$")
	public void i_click_on_BOOK_NOW_with_the_cheapest_price() throws Throwable {

	}

	@Then("^I am taken to booking page$")
	public void i_am_taken_to_booking_page() throws Throwable {

	}

}
