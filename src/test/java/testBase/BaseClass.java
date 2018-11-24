package testBase;

import org.openqa.selenium.WebDriver;

import pageObjects.AirlineSearchPage;
import pageObjects.Navigate;
import utilities.CustomWait;

public class BaseClass {
	
	public static WebDriver driver;

	public static Navigate navigate =  new Navigate();
	public static CustomWait customwait = new CustomWait();
	public static AirlineSearchPage airlineSearchPage = new AirlineSearchPage();
}
