Como eu fiz:
    - Clonei o repositorio cucumber-java-skeleton(repositrio de exemplos da propria mantenedora do cucumber)
    - Limpei os arquivos desnecessarios(gradle etc)
    - Adicionei as dependecias que gostaria de usar(selenium, webdriver, rest-assured)
    - Usei o design pattern Page Object como descrito na pagina do proprio selenium
    
Como fazer Rodar:
    - Ter java 8 devidamente configurado na maquina(path e JAVA_HOME)
    - Ter Maven devidamente condigurado na maquina(path e MAVEN_HOME)
    - Rodar a Classe RunCucumberTest ou executar o comando "mvn clean verify" para executar os testes com o cucumber e gerar o relatorio
    - Para exibir o relatorio abra os htmls que ficam no caminho  /target/cucumber-html-reports
    - O relatorio em detales é o com nome report-feature, ele possui prints de cada passo da execução
    - Os prints ficam na pasta target/cucumber-html-reports/embeddings