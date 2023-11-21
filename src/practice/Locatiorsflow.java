//package practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//
//public class Locatiorsflow {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		String password=getpassword(driver);
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");//easy
//		driver.findElement(By.name("inputPassword")).sendKeys(password);//easy
//		driver.findElement(By.className("signInBtn")).click();//easy		
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Forgot your password?")).click();
//
//		System.out.println(driver.findElement(By.tagName("h2")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello Rahul,");
//		//Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello lalita.");
//		System.out.println(driver.findElement(By.tagName("p")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
//		Thread.sleep(3000);
//
//		driver.quit();
//
//	}
//
//	public static String getpassword(WebDriver driver) throws InterruptedException
//	{
//		driver.get("https://rahulshettyacademy.com/locatorspractice/");
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
//		String passwordtext=driver.findElement(By.cssSelector("p.infoMsg")).getText();
//		//Please use temporary password 'rahulshettyacademy' to Login.
//		String [] passwordArry=passwordtext.split("'");
//		//0th index= Please use temporary password
//		//1st index= rahulshettyacademy' to Login.
//		
//		//0th index= rahulshettyacademy
//		//1st index= ' to Login.
////		String [] passwordArry2=passwordArry[1].split("'");		
////		passwordArray2[0];
//		
//		String password=passwordArry[1].split("'")[0];
//		return password;
//
//		
//
//
//	}
//	
//	
//	
//	
//	
//}
