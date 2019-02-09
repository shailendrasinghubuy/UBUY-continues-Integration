package ci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllKeywords {
	public static  WebDriver webDriver = new FirefoxDriver();;

	 String search = "//input[@name='q']";
	 String clickonSaerchButton ="//form[@id='search-form']//button[@type='submit']";
	 String SelectProducts = "//body/div[@class='section search-content']/div[@class='container-fluid']/div[@class='row']/div[@id='usstore-product-block-section']/div[@id='store']/div[@class='row']/div[1]";
	 String AddToCart  ="//*[@id='add-to-cart-btn' and @class='add-to-cart-btn']";
	 String PopUp=".//*[@class='view-cart-and-checkout']";
	 String ProceedToCheckOut ="//div[@class='totals']//ul[@class='checkout-types']//li//button[@title='Proceed to Checkout']//span//span[contains(text(),'Proceed to Checkout')]";

}
