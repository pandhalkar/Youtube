package everyDayPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emailAddressInvalid {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lru3825\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://macmillan-education-staging.myshopify.com/nl-be");
        
        // Click the "Login" link
        driver.findElement(By.linkText("Login")).click();

        // Re-locate the email address and password fields after the page has changed
        WebElement email_address = driver.findElement(By.xpath("//input[@id='customer_email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='customer_password']"));
        WebElement click_login = driver.findElement(By.xpath("//button[contains(@class,'button-primary form-action')]"));
        
        
        email_address.sendKeys("lalita.rajput@springernature.com");
        password.clear();
        click_login.click();
        String errorMessageText = "Incorrect email or password.";


       

        // Verify that the error message is "Incorrect email or password."
        if (email_address.getAttribute("value").isEmpty()||password.getAttribute("value").isEmpty()) {
            System.out.println(errorMessageText);
        } else {
            System.out.println("Test failed! Expected error message:");
        }

        Thread.sleep(4000);
        driver.quit();
    }
}
