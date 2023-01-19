import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {

    public static void main(String[] args) {


        System.setProperty("web driver.chrome.driver", "c/Zia/Selenium course/SeleniumTraining/Chromedriver");
        WebDriver driver = new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.navigate().to("http://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();




    }

}
