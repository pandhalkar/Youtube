package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class SwitchingWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);

		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		java.util.Iterator<String> it= windows.iterator();
		String parentID=it.next();
		String childID=it.next();	
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		
		driver.findElement(By.cssSelector("p.im-para.red")).getText();
		String email=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(email);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
