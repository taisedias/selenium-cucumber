# language: pt
Funcionalidade: Registro de usuário e login

  Para poder comprar um produto
  O usuário deve poder se registrar
  E logar no site

  Cenário: Registro de usuário
    Quando eu registro o seguinte usuário:
      | username | email               | password | confirmPassword |
      | rafael29 | rafalima7@gmail.com | 1234     | 1234            |
    Então vejo a seguinte mensagem: "Thank you for signing up! You are now logged in."


  Cenário: Logar com um usuário já cadastrado
    Quando eu logar com os dados:
      | email               | password |
      | rafalima7@gmail.com | 1234     |
    Então vejo a mensagem de boas vindas "Welcome rafael29!"