import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class Locators3 {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("web driver.chrome.driver", "c/Zia/Selenium course/SeleniumTraining/Chromedriver");
        WebDriver driver = new ChromeDriver();
        ////header/div/button[1]/following-sibling::button[1]
        //driver.navigate("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).cilck();



    }
    }