package everyDayPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class valuePresentIntheDropDownOrNot {

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
        
        Thread.sleep(12000);
                
        
        WebElement region = driver.findElement(By.xpath("//select[@autocomplete='country']"));
        Select redropdown = new Select(region);
        redropdown.selectByValue("Belgium");
        
        Thread.sleep(13000);

        
        WebElement role = driver.findElement(By.xpath("//select[@autocomplete='role']"));
        Select roledropdown = new Select(role);
        roledropdown.selectByValue("Teacher");
        
        
        //locate the select school dropdown
        
        WebElement chooseSchool=driver.findElement(By.xpath("//select[@name='school']"));
        Select chooseoption=new Select(chooseSchool);
        boolean isOptionPresent=false;
        for(WebElement option:chooseoption.getOptions())
        {
        	if(option.getText().equals("Polan International"))
        	{
        		System.out.println("School found");
        		isOptionPresent=true;
        		break;
        	}
                		
        }
        
        if (!isOptionPresent)
        {
        	WebElement addschoolbutton=driver.findElement(By.xpath("//a[text()='Add School']"));
    		System.out.println("School not found");

        	addschoolbutton.click();
        }
	
        Thread.sleep(10000);
driver.quit();
	}
	
    


}
