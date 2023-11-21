import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
	static WebDriver driver;
	//WebElement mouseHover;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void launchwebsite() {
		driver.get("https://www.amazon.in/");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		launchwebsite();
		Actions action = new Actions(driver);
		//Mouse Hover
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

		Thread.sleep(3000);
		//Hold shift key to make letter capital
//		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
//		.click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("hello");
		
		//Right click
		action.moveToElement(driver.findElement(By.xpath("//a[contains(@class,'nav-logo')]"))).contextClick().build().perform();
		Thread.sleep(3000);

		action.moveToElement(driver.findElement(By.xpath("//h2[text()='Up to 70% off | Clearance store']"))).click()
		.keyDown(Keys.SHIFT).doubleClick().build().perform();
		
		Thread.sleep(4000);
		driver.quit();
	}

}
