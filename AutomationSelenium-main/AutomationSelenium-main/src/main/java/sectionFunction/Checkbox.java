package sectionFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
	private WebDriver driver;

	public Checkbox(WebDriver driver) {
		this.driver = driver;
	}

	public void checkboxFunction() throws InterruptedException {
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")).click();
		
	}
}