package practice;

import java.awt.Checkbox;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class PracticeAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement check=driver.findElement(By.id("checkBoxOption3"));
		
		if (check.isSelected()) {
			check.click();
		}
		
		WebElement labelelement=driver.findElement(By.id("checkBoxOption3"));
		String label=labelelement.getText();
		System.out.println(label);
		
		
		
		
		
//		for(int i=0; i<driver.findElements(By.id("dropdown-class-example")).size();i++)
//		{
//		
//
//		}
		
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
