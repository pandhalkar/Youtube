package Toutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorAbove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement namebox = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']"));
//		System.out.println(driver.findElement(with(By.tagName("label"))).above(namebox).getText();

		
		WebElement dob=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		//driver.findElement(with(By.tagName("input"))).below(dob).click();
		
		WebElement icecheck=driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		//driver.findElement(with(By.tagName("Input"))).toleftof(icecheck).click();
		
		WebElement rob=driver.findElement(By.id("inlineRadio1"));
		//driver.findElement(with(By.tagName("label"))).torightof(rob).click();
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
