package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


public class Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		org.openqa.selenium.interactions.Actions a=new org.openqa.selenium.interactions.Actions(driver);
		WebElement move=(driver.findElement(By.id("twotabsearchtextbox")));
		
		//hover
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		// Typing in Capital letter in search box
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		Thread.sleep(3000);
		
		//Select the text in search box
		a.moveToElement(move).click().keyDown(Keys.SHIFT).doubleClick().build().perform();
		
		//right click
		a.moveToElement(move).contextClick().build().perform();
			
		Thread.sleep(3000);

		
		
		
		driver.quit();
		
		
		
		
		
	}

}
