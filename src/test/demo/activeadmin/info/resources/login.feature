# language: pt
Funcionalidade: Registro de usuário e login

  Como leitor de livros
  Eu quero me registrar e logar na Active Store
  Para que eu possa ver livros à venda

  Cenário: Registro de usuário
    Quando eu registro o seguinte usuário:
      | username | email           | password | confirmPassword |
      | Taise    | taise@gmail.com | 1234     | 1234            |
    Então vejo a seguinte mensagem: "Thank you for signing up! You are now logged in."


  Cenário: Logar com um usuário já cadastrado
    Quando eu logo com os dados:
      | email           | password |
      | taise@gmail.com | 1234     |
    Então vejo a mensagem de boas vindas "Welcome Taise!"
