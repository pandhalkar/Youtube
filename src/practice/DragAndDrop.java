package practice;

import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		         
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//java.io.File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		org.openqa.selenium.interactions.Actions act=new org.openqa.selenium.interactions.Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		act.dragAndDropBy(source, 310, 126).build().perform();
		//act.dragAndDrop(source, target).build().perform(); 
		//Files.copy(f,new File("C:\\Lalita\\beforeDragging.jpg"));
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//a[text()='Accordion']")).click();
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
