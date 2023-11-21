import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Excelr_Assignment3_WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement title=driver.findElement(By.xpath("//table/thead/tr/th[1]"));
		System.out.println(title.getText());
		
		java.util.List<WebElement>celldata=driver.findElements(By.cssSelector(".dataTable td:nth-child(1)"));
		
		for(WebElement element:celldata)
		{               
			System.out.println(element.getText());
		}
		
		Thread.sleep(3000);
		
		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pandhalkar.leeta1@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("B1zmat1cs@");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(3000);		
		driver.quit();
		
	}

}
