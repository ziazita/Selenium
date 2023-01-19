import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

      public static void main(String[] args){

      System.setProperty("web driver.chrome.driver","c/Zia/Selenium course/SeleniumTraining/Chromedriver");
      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
               // select dropdown with select tag
          WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
          Select dropdown = new Select(staticDropdown);
          dropdown.selectByIndex(3);
          System.out.println(dropdown.getFirstSelectedOption().getText());
          dropdown.selectByVisibleText("AED");
          System.out.println(dropdown.getFirstSelectedOption().getText());
          dropdown.selectByValue("INR");
          System.out.println(dropdown.getFirstSelectedOption().getText());




                }
        }
