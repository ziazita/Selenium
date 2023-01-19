import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdowns {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web driver.chrome.driver", "c/Zia/Selenium course/SeleniumTraining/Chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

           System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
            Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")). isSelected());

            driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
            System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
// count the number of checkboxes//
            System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


            driver.findElement(By.id("divpaxinfo")).click();
            Thread.sleep(2000);*/

       int i=1;
        while (i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
            for(int i=1;i<5;i++)
            {
                driver.findElement(By.id("hrefIncAdt")).click();
            }
            driver.findElement(By.id("btnclosepaxoption")).click();
            Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());*/

        // dynamic dropdowns
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();




    }
}
