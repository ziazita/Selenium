package java.lang.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

    public static void main(String[] args) {

//Invoking Browser
//Chrome - ChromeDriver exten->Methods close get
//Firefox- FirefoxDriver ->methods close get
// WebDriver  close  get
//WebDriver methods + class methods

// Chrome
        System.setProperty("web-driver.chrome.driver", "c/Zia/Selenium course/SeleniumTraining/Chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

//Firefox

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\selec\\OneDrive\\Dokumenty\\geckodriver\\geckodriver.exe");
       // WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge este doupravovať cestu a nazvy!!!!
//
//        System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//        WebDriver driver2 = new EdgeDriver();
//        driver.get("https://rahulshettyacademy.com");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.close();

//driver.quit();



    }



}

