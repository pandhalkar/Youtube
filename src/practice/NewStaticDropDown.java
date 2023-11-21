package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Select dropdown only for static dropdown.
		
		WebElement SelectDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(SelectDropDown);
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		dropdown.selectByValue("AED");
		Thread.sleep(3000);
		dropdown.selectByVisibleText("USD");		
		Thread.sleep(3000);

		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
