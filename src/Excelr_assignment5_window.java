import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;

public class Excelr_assignment5_window {

	public static void main(String[] args) throws InterruptedException {
		// Frames

		System.setProperty("webdriver.chrome.driver",
				"C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator <String>it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("lalita.pandhalkar@yahoo.com");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
