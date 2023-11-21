package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.manage().deleteCookie();
		
		WebDriverWait w=new WebDriverWait(driver,5);
		
		
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String [] vegy= {"Cucumber", "Brocolli", "Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addm(driver, vegy);	
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='PROCEED TO CHECKOUT']")));
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
	
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
		//Thread.sleep(3000);

		driver.quit();

		}
	
	
	public static void addm(WebDriver driver, String [] vegy)
	{
		int j=0;

	
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		//Thread.sleep(3000);

		for(int i=0; i<product.size();i++)
		{
			//Cucumber - 1 Kg

			String[] name=product.get(i).getText().split("-");
			String formatedname=name[0].trim();
			
			// 0th index= Cucumber
			//1 index= 1 Kg
			//check the name is present in the array or not
			//convert array into arrayList
			
			List listname=Arrays.asList(vegy);
			
			if (listname.contains(formatedname))
				
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
				if (j==vegy.length) {
					break;
				}
			
		}
		}

	}

}
