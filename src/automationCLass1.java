import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.ie.IntrnetExplorerDriver;

public class automationCLass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		Map<String,Object> pref= new HashMap<String,Object>();
		pref.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions roptions=new ChromeOptions();
		roptions.setExperimentalOption("pref",pref);
		
		WebDriver driver = new ChromeDriver(roptions);

		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement from = driver.findElement(By.xpath("//*[@id='origin']/span/input"));
		from.clear();
		from.sendKeys("NDSL");
		Thread.sleep(3000);
		//dropdown value
		driver.findElement(By.xpath("//ul[@role='listbox']/li[1]/span[1]")).click();
		Thread.sleep(3000);

//		WebElement to = driver.findElement(By.xpath("//*[@id='destination']/span/input"));
//		from.clear();
//		to.sendKeys("pneb");
//		Thread.sleep(3000);
		//dropdown value


		
		//WebElement search=driver.findElement(By.xpath("//button[text()='Search']"));
		//search.click();
		
		Thread.sleep(3000);

		driver.quit();

	}

}
