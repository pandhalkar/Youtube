package Toutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JflowLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10000);
		
		Thread.sleep(3000);
		driver.get("https://jflow-test.public.springernature.app/login.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("usernameInput")).sendKeys("reg_adm01");
		driver.findElement(By.id("passwordInput")).sendKeys("Welc0me");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class=\"mx-grid-search-input mx-name-GridSearch_widget_Comparison_0\"]")).sendKeys("90001");
		//driver.manage().timeouts().implicitlyWait(Durations.ofSeconds(5));
		//driver.findElement(By.xpath("//div[contains(@data-mendix-id, 'AllJournals')]//input")).sendKeys("90001");
		driver.switchTo().frame("_hjSafeContext_25471611");
		WebElement element=driver.findElement(By.xpath("//input[@type='text' and @placeholder='Search']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys("90001");
		Thread.sleep(3000);

	}

}
