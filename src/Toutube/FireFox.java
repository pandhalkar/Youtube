package Toutube;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		String name="Rahul";
		System.setProperty("webdriver.gecko.driver", "C:\\Lalita\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		//Assert.assertEquals("driver.findElement(By.xpath(\"(//h1[contains(text(),'Rahul Shetty Academy')])[2]\")).getText()", "Rahul Shetty Academy");
		System.out.println(driver.findElement(By.xpath("(//h1[contains(text(),'Rahul Shetty Academy')])[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='An Academy to Learn Earn & Shine  in your QA Career']")).getText());
		//driver.findElement(By.id("visitUsTwo")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("name");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
	}
	

}
