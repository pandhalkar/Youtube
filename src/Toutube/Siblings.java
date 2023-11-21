package Toutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//siblings
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		//child to parent
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[3]")).getText());
		driver.quit();		
	}

}
