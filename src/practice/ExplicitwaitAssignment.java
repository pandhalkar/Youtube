package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		//WebDriverWait w=new WebDriverWait(driver, 5);
		//w.until(ExpectedConditions.visibilityOfElementLocated("locater path"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String [] items= {"Cauliflower", "Beans", "Potato", "Apple"};
		Cart(driver,items);
		
		Thread.sleep(4000);
		WebDriverWait w=new WebDriverWait(driver, 5);

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());

		
		
		

		driver.quit();
	}

		
		
    	public static void Cart(WebDriver driver,String [] items) throws InterruptedException
    	{
    		List<WebElement> product=driver.findElements(By.xpath("//h4[@class='product-name']"));

    		for(int i=0;i<product.size();i++)
    		{
    			int j=1;
    			String []name =product.get(i).getText().split("-");
    			String formatedItemName=name[0].trim();
    			
    	        List al = Arrays.asList(items);
    	        if(al.contains(formatedItemName)) 
    	        {
            		j++;

    	        	driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
    	        	Thread.sleep(4000);
    	        	
    	        	if (j==items.length)
    	        	{
    	        		break;
    	        	}
    	        }

    			
    			
    		}

    	
		
		
    
		

    	
	}

}
