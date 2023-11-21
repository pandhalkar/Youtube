package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class performAction {

	static WebDriver driver;
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public static void launchwebsite() throws InterruptedException
	{
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		launchwebsite();
		Actions a=new Actions(driver);
		
		//double click
		a.moveToElement(driver.findElement(By.xpath("//h2[contains(@id,'example-code-simple-context-menu')]")))
		.click().keyDown(Keys.SHIFT).doubleClick().build().perform();
		
		Thread.sleep(3000);
		//click
		a.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
		driver.findElement(By.xpath("//ul//li[contains(@class,'edit')]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}
