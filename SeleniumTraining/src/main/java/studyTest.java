import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class studyTest {
    public static void main(String[] args) throws InterruptedException {

    System.setProperty("web driver.chrome.driver", "c/Zia/Selenium course/SeleniumTraining/Chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    Thread.sleep(2000);

    driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Zita");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Selecka");
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("password123");
    driver.findElement(By.id("exampleCheck1")).click();
    WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
    Select dropdown = new Select(staticDropdown);
    dropdown.selectByVisibleText("Female");
    driver.findElement(By.id("inlineRadio1")).click();
    driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("31.10.2003");
    driver.findElement(By.cssSelector("input[value='Submit']")).click();
    System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
    Assert.assertEquals(driver.findElement(By.xpath("//strong[normalize-space()='Success!']")).getText(), "Success!");

    }
}
