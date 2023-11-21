package Toutube;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordFromString {

	public static void main(String[] args) throws InterruptedException {
		String name="Rahul";		
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.quit();
		
		}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String passwordtext=driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String []passwordarray=passwordtext.split("'");
		//0th  index- Please use temporary password
		//1st index- rahulshettyacademy' to Login.
		String []passwordarray2=passwordarray[1].split("'");
		String password=passwordarray2[0];
		//0th index-rahulshettyacademy
		//1st index-to Login.
		return password;
		
		

	}

}
