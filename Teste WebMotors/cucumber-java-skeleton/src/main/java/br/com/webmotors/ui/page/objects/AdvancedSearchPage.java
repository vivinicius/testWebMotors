package br.com.webmotors.ui.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static br.com.webmotors.ui.driver.DriverFactory.webdriver;
import static br.com.webmotors.ui.page.objects.CookiesDialog.acceptCookies;
import static java.time.Duration.ofSeconds;

public class AdvancedSearchPage {

    private By modelsListBy = By.cssSelector(".Filters__line.Filters__line__result");
    private By allModelsBtn = By.cssSelector(".Filters__line.Filters__line--gray.Filters__line--icon.Filters__line--icon--right");

    private WebDriverWait wait;

    public void selectBrand(String brand){
        acceptCookies();
        By brandBy = By.xpath("//a[@title='" + brand + "']");
        webdriver.findElement(brandBy).click();
    }

    public void selectModel(String model){
        webdriver.findElement(allModelsBtn).click();

        wait = new WebDriverWait(webdriver, ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(modelsListBy));

        try {
            List<WebElement> modelsList = webdriver.findElements(modelsListBy);

            modelsList.forEach(modelElement -> {
                if(modelElement.getText().equals(model.toUpperCase())){
                    modelElement.click();
                    System.out.println("FOI!");
                }
            });
        } catch (StaleElementReferenceException ex){
            List<WebElement> modelsList = webdriver.findElements(modelsListBy);

            modelsList.forEach(modelElement -> {
                if(modelElement.getText().equals(model.toUpperCase())){
                    modelElement.click();
                    System.out.println("FOI!");
                }
            });
        }

    }

    public void calma(String model){
        By modelBy = By.xpath("//a[text()='"+ model.toUpperCase() +"']");
        webdriver.findElement(modelBy).click();
    }
}
