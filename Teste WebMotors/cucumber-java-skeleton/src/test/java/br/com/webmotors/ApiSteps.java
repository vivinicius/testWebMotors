package br.com.webmotors;


import br.com.webmotors.api.services.Make;
import br.com.webmotors.api.services.Model;
import br.com.webmotors.api.services.Page;
import br.com.webmotors.api.services.Version;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.Assert.*;

public class ApiSteps {

    private Make make = new Make();
    private Model model = new Model();
    private Version version = new Version();
    private Page page = new Page();

    private Integer makeId;
    private Integer modelId;
    private Integer versionId;
    private Integer pageId;

    private String versionName;

    @Dado("que eu desejo um carro da marca {}")
    public void queEuDesejoUmCarroDaMarca(String makeName) {
        makeId = make.getMakeIdByName(makeName);
    }

    @E("no modelo Honda {}")
    public void noModeloHonda(String modelName) {
        modelId = model.getModelIdByName(modelName, makeId);
    }

    @Quando("eu seleciono a versao {}")
    public void euSelecionoOModelo(String versionName) {
        this.versionName = versionName;
        versionId = version.getVersionIdByName(versionName, modelId);
        assertNotNull("A versao desejada nao foi encontrada.", versionId);
    }

    @Entao("ele deve estar disponivel na pagina {}")
    public void eleDeveEstarDisponivelNaPagina(int pageNumber) {
        pageId = page.getVehiclesPageIdByVersionName(versionName, pageNumber);
        assertNotNull("A versao desejada nao foi encontrada na pagina informada", versionId);
    }

    @E("seu valor deve ser de {}")
    public void seuValorDeveSerDe(String price) {
        assertEquals(price, page.getPrice());

    }
}
