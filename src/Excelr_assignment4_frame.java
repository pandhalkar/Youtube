import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class Excelr_assignment4_frame {

	public static void main(String[] args) throws InterruptedException {
		// Frames

			System.setProperty("webdriver.chrome.driver",
					"C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			System.out.println(driver.findElement(By.xpath("//div[@id='droppable']")).getText());
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.quit();

	}

}
