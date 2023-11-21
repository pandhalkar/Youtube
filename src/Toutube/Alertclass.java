package Toutube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {
	static 	WebDriver driver;
	
	
	static void launchchrome()
	{
		System.setProperty ("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	static void launchsite()
	{
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement userid=driver.findElement(By.xpath("//input[@name='cusid']"));
		userid.sendKeys("5320");
		WebElement submit= driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchchrome();
		launchsite();
		Alert alert=driver.switchTo().alert();
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		Thread.sleep(3000);
		alert.accept();
		driver.quit();

	}

}
