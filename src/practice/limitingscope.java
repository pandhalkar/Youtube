package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limitingscope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//limiting web driver scope
		WebElement minidriver=driver.findElement(By.id("gf-BIG"));
		System.out.println("footer links count: " + minidriver.findElements(By.tagName("a")).size());
		
		//only one column link
		WebElement columnlink=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Sinle column links count: " + columnlink.findElements(By.tagName("a")).size());
		//click on each link and open it
		
		for(int i=1; i<columnlink.findElements(By.tagName("a")).size();i++)
		{
			String clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnlink.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(3000);
		}
		
		Set<String>abc=driver.getWindowHandles();
		Iterator <String> it=abc.iterator();
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
			
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
