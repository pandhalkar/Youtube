package Toutube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.Actions;

public class AlertBuilder {
	
	static WebDriver driver;

	static void launchchrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	static void launchurl()
	{
		driver.get("https://www.browserstack.com/");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchchrome();
		launchurl();
		JavascriptExecutor jc =(JavascriptExecutor)driver;
		jc.executeScript("scroll(0,500)");

		
		//Actions ac=new Actions();
		Thread.sleep(3000);
		

	}

}
