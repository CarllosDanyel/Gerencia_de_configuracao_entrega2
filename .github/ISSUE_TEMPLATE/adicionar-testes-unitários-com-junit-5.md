---
name: Adicionar Testes Unitários com JUnit 5
about: O projeto atualmente não possui testes automatizados para garantir que a classe
  Utils funcione como esperado. Precisamos adicionar o JUnit 5 como dependência e
  criar casos de teste.
title: ''
labels: ''
assignees: ''

---

Adicionar as dependências junit-jupiter-api e junit-jupiter-engine ao pom.xml com o escopo (<scope>) de test.

Criar a estrutura de pastas de teste: src/test/java/com/meuprojeto/.

Criar uma classe de teste UtilsTest.java dentro da pasta de teste.

Escrever um método de teste (ex: deveRetornarAMensagemCorreta()) que verifique se o método Utils.mensagem() (após ser refatorado pela Issue 2) retorna a string "Ai não".

O comando mvn test deve ser executado com sucesso.
