---
name: Desacoplar a lógica da mensagem da impressão no console
about: 'Atualmente, o método Utils.mensagem() faz duas coisas: define uma string e
  a imprime no console (System.out.println).'
title: ''
labels: ''
assignees: ''

---

Refatorar o método Utils.mensagem() para que ele apenas retorne uma string. O nome pode ser mudado para public static String getMensagem().O método getMensagem() deve retornar uma string "Ai não".Atualizar a classe App.java (sem método principal) para ser responsável pela impressão, chamando System.out.println(Utils.getMensagem());.
