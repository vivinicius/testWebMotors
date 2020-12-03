package br.com.webmotors;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static br.com.webmotors.ui.driver.DriverFactory.startDriver;
import static br.com.webmotors.ui.driver.DriverFactory.webdriver;

public class Hooks {

    @Before
    public void startSession(Scenario scenario){
        if (scenario.getName().contains("API")){
            
        } else {
            startDriver();
            webdriver.get("https://www.webmotors.com.br/");
        }
    }

    @AfterStep
    public void printStep(Scenario scenario){
        if (scenario.getName().contains("API")){

        } else {
            final byte[] screenshot = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "");
        }
    }
}
