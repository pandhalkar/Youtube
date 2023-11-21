package everyDayPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import practice.selectdropdown;

public class dropDownValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lru3825\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://macmillan-education-staging.myshopify.com/nl-be");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//a[@id='customer_register_link']")).click();
        
        Thread.sleep(30000);
      WebElement choosecountry=  driver.findElement(By.xpath("//select[@placeholder='Select your region']"));
      Select dropdown=new Select(choosecountry);
      dropdown.selectByValue("Belgium");
      
      Thread.sleep(30000);
      WebElement role = driver.findElement(By.xpath("//select[@id='117783']"));
      Select roledropdown = new Select(role);
      roledropdown.selectByValue("Teacher");
      Thread.sleep(10000);

      
      if(roledropdown.getFirstSelectedOption().getText().equals("Teacher"))
    	  
      {
    	  WebElement msgelement=driver.findElement(By.xpath("//div[@id='141022description']"));
    	  String msg=msgelement.getText();
    	  
    	  if(msg.contains("If your school is not listed in the above drop-down, please register it by clicking Add School button"))
    	  {
    		  System.out.println("Message is displayed " + msg);
    		  WebElement clickonAddSchoolButton=driver.findElement(By.xpath("//a[text()='Add School']"));
    		  clickonAddSchoolButton.click();
    	  }
      }
      

        
        Thread.sleep(3000);
        driver.quit();

	}

}
