#language: pt

Funcionalidade:
  Sabendo que para a próxima entrega no site de produção teremos que validar os campos de
  busca de "Marca", "Modelo" e "Versão" da página de resultado de busca da Webmotors, além
  da listagem de estoque de uma determinada loja.
  Você, como QA do produto, deverá criar os cenários de testes em formato de BDD e
  automatizar estes cenários com validações de API e de Tela.


  #Esse mesmo cenario pode ser utilizado para outros carros.

  Esquema do Cenario: Desafio API
    Dado que eu desejo um carro da marca <marca>
    E no modelo Honda <modelo>
    Quando eu seleciono a versao <versao>
    Entao ele deve estar disponivel na pagina <pagina>
    E seu valor deve ser de <valor>

    Exemplos:
      | marca | modelo   | versao                                 | pagina | valor    |
      | Honda | City     | 2.0 EXL 4X4 16V GASOLINA 4P AUTOMÁTICO | 1      | 59000,00 |
#      | Ford  | Ecosport | 1.6 FREESTYLE 16V FLEX 4P MANUAL       | 3      | 45000,00 |

#     O cenario da Ecosport nao funciona devido ao endpoint de versao nao possuir a versao correta, que é a FREESTYLE
