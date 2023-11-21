package Toutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.name("search_query")).sendKeys("Github");
		driver.findElement(By.xpath("//input[@id='search' or contains(@name,'search')]")).sendKeys("jenkin");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(10000);
		driver.quit();
		

	}

}
