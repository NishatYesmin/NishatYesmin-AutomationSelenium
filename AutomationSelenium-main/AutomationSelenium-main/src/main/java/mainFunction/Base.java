package mainFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sectionFunction.Checkbox;
import sectionFunction.Elements;
import sectionFunction.Textbox;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();
		Thread.sleep(1000);

		Elements elem = new Elements(driver);
		elem.elementsFunction();
		
		Textbox tb = new Textbox(driver);
		tb.textboxFunction();
		
		Checkbox cb = new Checkbox(driver);
		cb.checkboxFunction();

	}

}
