package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int j=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		String [] item= {"Carrot", "Cauliflower", "Beetroot"};
		List <WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		
		for(int i=0; i<product.size();i++)
		{
			String [] name=product.get(i).getText().split("-");
			String formatedtext=name[0].trim();
			
			List sortedlist=Arrays.asList(item);
			
			if (sortedlist.contains(formatedtext))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==item.length);
				{
					break;
				}
			}
			
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
