import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class Excelr_Assignment6_DragnDropnScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/aside[@class='widget'][1]/ul/li[1]")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement draggable=driver.findElement(By.id("draggable"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(draggable, 23 ,100).build().perform();
		driver.switchTo().defaultContent();
		
		//Take a screenshot
		File src=((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File ("C:\\Lalita\\draggableimage.png"));
		

		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
