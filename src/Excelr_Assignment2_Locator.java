import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excelr_Assignment2_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@value='Option 1']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='checkbox2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='checkbox3']")).click();
		Thread.sleep(1000);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select selectdropdown=new Select(dropdown);
		selectdropdown.selectByValue("KUWAIT");		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
