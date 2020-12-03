package br.com.webmotors.ui.page.objects;

import br.com.webmotors.ui.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static br.com.webmotors.ui.driver.DriverFactory.webdriver;
import static java.time.Duration.ofSeconds;

public class HomePage {

    private WebDriverWait wait;

    private By buyButtonBy = By.xpath("//li[@class='Menu-User__list-links__navigation__item'][1]");
    private By AdvancedSearchBtnBy = By.id("navigationSearchAdvanced");
    private By logoBy = By.id("logoHomeWebmotors");

    public boolean isLogoDisplayed(){
        wait = new WebDriverWait(webdriver, ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOf(webdriver.findElement(logoBy)));
        return webdriver.findElement(logoBy).isDisplayed();
    }

    public void openAdvancedSearch(){
        webdriver.findElement(buyButtonBy).click();
        webdriver.findElement(AdvancedSearchBtnBy).click();

        ArrayList<String> tabs = new ArrayList<String>(webdriver.getWindowHandles());
        webdriver.switchTo().window(tabs.get(1));
    }
}
