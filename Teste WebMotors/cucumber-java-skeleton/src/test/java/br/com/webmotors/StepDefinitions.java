//package br.com.webmotors;
//
//
//import br.com.webmotors.ui.page.objects.HomePage;
//import br.com.webmotors.ui.page.objects.SearchResultsPage;
//import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.E;
//import io.cucumber.java.pt.Entao;
//import io.cucumber.java.pt.Quando;
//
//import static org.junit.Assert.assertTrue;
//
//public class StepDefinitions {
//
//    private HomePage homePage = new HomePage();
//    private SearchResultsPage searchResultsPage = new SearchResultsPage();
//
//    @Dado("que eu estou na pagina incial do Google")
//    public void queEuEstouNaPaginaIncialDoGoogle() {
//        assertTrue("A Pagina inicial do Google não foi exibida", homePage.isLogoDisplayed());
//    }
//
//    @Quando("eu preencho o campo de pesquisa com o valor {string}")
//    public void euPreenchoOCampoDePesquisaComOValorILABQuality(String searchText) {
//        homePage.fillSearchText(searchText);
//    }
//
//    @E("clico no botao Pesquisa Goggle")
//    public void clicoNoBotaoPesquisaGoggle() {
//        homePage.clickSearchBtn();
//    }
//
//    @Entao("a tela de resultados deve exibir o link {string}")
//    public void aTelaDeResultadosDeveExibirOLink(String url) {
//        assertTrue("O Link +" + url + "não foi exibido", searchResultsPage.isUrlDisplayed(url));
//    }
//}
