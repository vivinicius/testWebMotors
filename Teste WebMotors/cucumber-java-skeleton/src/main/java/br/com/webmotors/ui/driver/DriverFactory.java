package br.com.webmotors.ui.driver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver webdriver;

    public static void startDriver(){
        WebDriverManager.chromedriver().setup();
        webdriver = new ChromeDriver();
        webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        webdriver.manage().window().maximize();
    }

    @After
    public static void killDriver(){
        if (webdriver != null) {
            webdriver.quit();
        }
    }
}
