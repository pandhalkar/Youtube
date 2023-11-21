package Toutube;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerLink {
    
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://macmillan-education-staging.myshopify.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0, 3000)");
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("About Us")).click();
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);


        
        driver.quit();
    }
}
