package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		org.openqa.selenium.interactions.Actions act=new org.openqa.selenium.interactions.Actions(driver);
		WebElement source =driver.findElement(By.xpath("//div[@ID='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@ID='droppable']"));
		
		act.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='sidebar']/aside[2]/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		

	}

}
