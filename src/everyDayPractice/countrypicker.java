package everyDayPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import practice.selectdropdown;

public class countrypicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lru3825\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(10000);

        driver.get("https://macmillan-education-staging.myshopify.com/nl-be");
        Thread.sleep(10000);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//a[@id='customer_register_link']")).click();
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(20000);
//      WebElement choosecountry=  driver.findElement(By.xpath("//select[@placeholder='Select your region']"));
//      Select dropdown=new Select(choosecountry);
//      dropdown.selectByValue("Belgium");
////      
      WebElement phno=driver.findElement(By.xpath("(//select[@aria-label='Select a country calling code'])[1]"));
      Select phselect=new Select(phno);
      phselect.selectByValue("BE");
      
      Thread.sleep(10000);
      driver.quit();

      
      

	}

}
