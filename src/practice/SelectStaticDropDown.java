package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(3);
		Thread.sleep(3000);		
		dropdown.selectByValue("AED");
		Thread.sleep(3000);
		dropdown.selectByVisibleText("INR");
		Thread.sleep(3000);	
		
//		Select select=new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//		select.selectByValue("value of the satic dropdown");
		driver.quit();
		
	}

}
