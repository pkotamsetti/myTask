package pageObjects;

import testBase.BaseClass;

public class Navigate extends BaseClass{
	
	  public void navigateTo(String url) {
	        driver.navigate().to(url);
	    }

}
