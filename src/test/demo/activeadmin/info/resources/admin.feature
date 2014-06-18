# language: pt
Funcionalidade: Área de administração do sistema

  Para poder realizar vendas
  Um administrador deve poder gerenciar
  Usuários, pedidos e produtos


  Cenário: Criar Produto
    Quando acesso a funcionalidade de produtos
    E crio o produto:
      | title                 | description         | price | image        |
      | Dark Side of the moon | Album do Pink Floyd | 123   | darkside.jpg |
    Então vejo a mensagem: "Product was successfully created."
    E os dados do novo produto são listados corretamente