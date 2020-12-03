package br.com.webmotors.ui.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.webmotors.ui.driver.DriverFactory.webdriver;

public class CookiesDialog {

    private WebDriverWait wait;

    public static void acceptCookies(){
        webdriver.findElement(By.cssSelector(".sc-htoDjs.gtMZoW")).click();
    }
}
