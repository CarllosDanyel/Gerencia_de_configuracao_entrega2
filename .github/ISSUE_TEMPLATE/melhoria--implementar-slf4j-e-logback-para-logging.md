---
name: 'Melhoria: Implementar SLF4J e Logback para Logging'
about: O uso de System.out.println não é considerado uma boa prática para aplicações,
  pois não permite controle sobre níveis de log (INFO, DEBUG, ERROR)
title: ''
labels: ''
assignees: ''

---

Adicionar as dependências slf4j-api e logback-classic ao pom.xml.

Criar um arquivo de configuração logback.xml básico em src/main/resources/.

Na classe App.java, substituir a chamada System.out.println por uma instância do Logger do SLF4J (ex: logger.info(...)).
