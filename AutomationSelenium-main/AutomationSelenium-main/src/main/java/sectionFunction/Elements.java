package sectionFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Elements{
	
	private WebDriver driver;
	
	public Elements(WebDriver driver) {
		this.driver = driver;
	}

	public void elementsFunction() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);

		driver.findElement(By.xpath("//h5[contains(.,'Elements')]")).click();
		Thread.sleep(1000);
	
	}

}
