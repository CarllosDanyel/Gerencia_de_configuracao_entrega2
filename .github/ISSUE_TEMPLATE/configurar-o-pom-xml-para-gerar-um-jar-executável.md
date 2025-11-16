---
name: Configurar o pom.xml para gerar um JAR executável
about: Describe this issue template's puO pom.xml atual gera um JAR, mas ele não é
  autossuficiente. Não é possível executá-lo com java -jar <nome-do-jar>.jarrpose
  here.
title: ''
labels: ''
assignees: ''

---

Adicionar o plugin maven-jar-plugin (ou maven-shade-plugin se dependências futuras forem necessárias) à seção <build> do pom.xml.

Configurar o plugin para especificar a mainClass no manifesto. O valor deve ser com.meuprojeto.App.

Após rodar mvn clean package, o JAR gerado em /target deve ser executável usando java -jar meu-projeto-minimo-1.0.0.jar.
