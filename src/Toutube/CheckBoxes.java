package Toutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Lalita\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		//count of checkboxes
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
