package practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");//easy
		driver.findElement(By.name("inputPassword")).sendKeys("password");//easy
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.className("signInBtn")).click();//easy
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("123@1234.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567898");
		driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1245667898");

		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	
		Thread.sleep(3000);		
		driver.quit();
		
	}

	
	
}
