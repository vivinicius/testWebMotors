package br.com.webmotors;


import br.com.webmotors.ui.page.objects.AdvancedSearchPage;
import br.com.webmotors.ui.page.objects.HomePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.webmotors.ui.driver.DriverFactory.webdriver;
import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UiSteps {

    HomePage homePage = new HomePage();
    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();

    @Dado("que eu estou na pagina incial da WebMotors")
    public void queEuEstouNaPaginaIncialDaWebMotors() {
        assertTrue("A Pagina inicial da WebMotors não foi exibida", homePage.isLogoDisplayed());
    }

    @E("eu seleciona a opcao Busca Avancada")
    public void euSelecionaAOpcaoBuscaAvancada() {
        homePage.openAdvancedSearch();
    }

    @Quando("a pagina de busca avancada for exibida")
    public void aPaginaDeBuscaAvancadaForExibida() {
        assertEquals("https://www.webmotors.com.br/carros/estoque", webdriver.getCurrentUrl());
    }

    @E("eu seleciono a marca {string}")
    public void euSelecionoAMarcaHonda(String brand) {
        advancedSearchPage.selectBrand(brand.toLowerCase());
    }


    @Entao("ao selecionar o modelo {string}")
    public void aoSelecionarOModelo(String model) {
        advancedSearchPage.selectModel(model);
    }

    @Entao("a URL deve conter {string} e {string}")
    public void aURLDeveConterE(String arg0, String arg1) {
        WebDriverWait wait = new WebDriverWait(webdriver, ofSeconds(8));

        wait.until(ExpectedConditions.urlContains(arg0.toUpperCase()));
        wait.until(ExpectedConditions.urlContains(arg1.toUpperCase()));

        assertTrue(webdriver.getCurrentUrl().contains(arg0.toUpperCase()));
        assertTrue(webdriver.getCurrentUrl().contains(arg1.toUpperCase()));
    }
}
