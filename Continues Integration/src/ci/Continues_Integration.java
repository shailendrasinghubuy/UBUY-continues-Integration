package ci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Continues_Integration extends AllKeywords {
	@Test
	public void tc01LaunchURL() {
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.get("https://www.ubuy.ie/en/");
	}

	@Test
	public void tc02SearchProducts() {
		webDriver.findElement(By.xpath(search)).sendKeys("laptop");
		webDriver.findElement(By.xpath(clickonSaerchButton)).click();
	}
	
	@Test
	public void tc03SelecthProducts() {
		webDriver.findElement(By.xpath(SelectProducts)).click();
	}

	
	@Test
	public void tc04AddToCart() {
		webDriver.findElement(By.xpath(AddToCart)).click();
		
		String myWindowHandle = webDriver.getWindowHandle();
		  webDriver.switchTo().window(myWindowHandle);
		  WebElement element = (new WebDriverWait(webDriver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath(PopUp)));
		  element.click();	  
		}

	@Test
	public void tc05ProceedToCheckout() throws Exception {
		Thread.sleep(4000);
		webDriver.findElement(By.xpath(ProceedToCheckOut)).click();
	
	}
}


