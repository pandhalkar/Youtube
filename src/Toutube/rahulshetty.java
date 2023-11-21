package Toutube;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		String name="rahul";
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys(name);//regular expression
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("Jpohn");//regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();//regular expression
		Thread.sleep(3000);
		//parent to child
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		//cssselector
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[contains(@value,'rmbrUsername')]")).click();
		driver.findElement(By.xpath("//input[contains(@value,'agreeTerms')]")).click();
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(3000);
				System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
				//Thread.sleep(3000);
				driver.findElement(By.linkText("Forgot your password?")).click();
				driver.findElement(By.xpath(" //form/input[1]")).sendKeys(name);
				driver.findElement(By.xpath(" //form/input[2]")).sendKeys("222");
				driver.findElement(By.xpath(" //form/input[3]")).sendKeys("abc@dsfgs.com");
				driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
				driver.findElement(By.xpath(" //form/input[1]")).clear();
				driver.findElement(By.xpath(" //form/input[2]")).clear();
				driver.findElement(By.xpath(" //form/input[3]")).clear();
				System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
				driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
				driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.quit();

		
	}

}
