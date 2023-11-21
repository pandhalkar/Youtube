package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceAction {
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
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		launchwebsite();
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"))).contextClick(move).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"))).click().keyDown(Keys.SHIFT).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
