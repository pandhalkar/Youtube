import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Excelr_Asignment1_Drivers {

	public static void main(String[] args) throws InterruptedException {

		// Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		chromedriver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		Thread.sleep(3000);
		chromedriver.navigate().back();
		Thread.sleep(3000);
		chromedriver.quit();

		// Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\geckodriver.exe");
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.manage().window().maximize();
		firefoxdriver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		firefoxdriver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		Thread.sleep(3000);
		firefoxdriver.navigate().back();
		Thread.sleep(3000);
		firefoxdriver.quit();

		// IE browser
		System.setProperty("webdriver.ie.driver",
				"C:\\Lalita\\Selenium\\chromedriver_win32\\internetexplorerdriver.exe");
		WebDriver InternetExplorerDriver = new InternetExplorerDriver();
		InternetExplorerDriver.manage().window().maximize();
		InternetExplorerDriver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		InternetExplorerDriver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		Thread.sleep(3000);
		InternetExplorerDriver.navigate().back();
		Thread.sleep(3000);
		InternetExplorerDriver.quit();

		// Safari browser
		System.setProperty("webdriver.safari.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\safaridriver.exe");
		WebDriver SafariDriver = new SafariDriver();
		SafariDriver.manage().window().maximize();
		SafariDriver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		SafariDriver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		Thread.sleep(3000);
		SafariDriver.navigate().back();
		Thread.sleep(3000);
		SafariDriver.quit();

		// Opera browser
		System.setProperty("webdriver.opera.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\operadriver.exe");
		WebDriver OperaDriver = new OperaDriver();
		OperaDriver.manage().window().maximize();
		OperaDriver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		OperaDriver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		Thread.sleep(3000);
		OperaDriver.navigate().back();
		Thread.sleep(3000);
		OperaDriver.quit();

	}

}
