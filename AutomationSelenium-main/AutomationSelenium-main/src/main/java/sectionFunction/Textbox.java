package sectionFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Textbox {
	private WebDriver driver;
	
	
	public Textbox(WebDriver driver) {
		this.driver = driver;
	}
	
	public void textboxFunction() throws InterruptedException {
		driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Nishat Yesmin");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("nish@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("currentAddress")).sendKeys("Dakhina Abasan");
        Thread.sleep(2000);
        driver.findElement(By.id("permanentAddress")).sendKeys("Dhaka");
        Thread.sleep(2000); 
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");
        
        driver.findElement(By.id("submit")).click();

        
		
}
	}