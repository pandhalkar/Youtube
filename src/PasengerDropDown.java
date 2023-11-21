import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PasengerDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=1; i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		Thread.sleep(2000);

		
		for (int j=1; j<=3;j++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		Thread.sleep(2000);

		
		for (int i=0;i<1;i++)
		{
			driver.findElement(By.id("hrefIncInf")).click();
		}
		Thread.sleep(2000);

		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);

		//Select operation for static dropdown
		
		WebElement selectdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(selectdropdown);
		dropdown.selectByIndex(2);
		Thread.sleep(2000);
		dropdown.selectByValue("USD");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("AED");
		Thread.sleep(2000);

		
		
		
		
		
		driver.quit();

	}

}
