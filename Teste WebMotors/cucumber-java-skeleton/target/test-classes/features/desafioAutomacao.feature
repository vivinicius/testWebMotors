#language: pt

Funcionalidade:
  Sabendo que para a próxima entrega no site de produção teremos que validar os campos de
  busca de "Marca", "Modelo" e "Versão" da página de resultado de busca da Webmotors, além
  da listagem de estoque de uma determinada loja.
  Você, como QA do produto, deverá criar os cenários de testes em formato de BDD e
  automatizar estes cenários com validações de API e de Tela.

  Cenario: Desafio Automacao
    Dado que eu estou na pagina incial da WebMotors
    E eu seleciona a opcao Busca Avancada
    Quando a pagina de busca avancada for exibida
    E eu seleciono a marca "Honda"
    E ao selecionar o modelo "City"
    Entao a URL deve conter "HONDA" e "CITY"



