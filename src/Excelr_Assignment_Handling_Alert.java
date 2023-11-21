import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Excelr_Assignment_Handling_Alert {

	public static void main(String[] args) throws InterruptedException {
		// Handling alert
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert msg = driver.switchTo().alert();
		Thread.sleep(3000);

		String alrtmsg = driver.switchTo().alert().getText();
		System.out.println(alrtmsg);
		Thread.sleep(3000);

		msg.dismiss();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);

		msg.accept();
		String acptmsg = driver.switchTo().alert().getText();
		System.out.println(acptmsg);
		Thread.sleep(3000);
		driver.quit();


		
	
		

	}

}
