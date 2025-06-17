# Aula: Scala - recursos básicos

Este projeto contém exemplos introdutórios de programação funcional e orientada a objetos em Scala, utilizados na disciplina MCCC015 - Programação Funcional (2025, Q2).

## Estrutura do Projeto

- `Expressions.scala`: Exemplos de expressões em Scala
- `FuncionalStructure.scala`: Estruturas funcionais básicas
- `HelloWorld.scala`: Exemplo clássico "Hello, World!"
- `Lists.scala`: Manipulação de listas
- `OOStructure.scala`: Estruturas orientadas a objetos
- `OOStructureBraces.scala`: Sintaxe alternativa para estruturas OO
- `Output.scala`: Exemplos de saída de dados
- `Typing.scala`: Tipagem em Scala
- `Variables.scala`: Declaração e uso de variáveis

## Como Executar

1. Certifique-se de ter o [Scala](https://www.scala-lang.org/download/) instalado em seu sistema.
2. No terminal, navegue até a pasta do projeto.
3. Para executar um arquivo específico, utilize:

```bash
scala src/NomeDoArquivo.scala
```

Exemplo:

```bash
scala src/HelloWorld.scala
```

## Requisitos

- Scala 3.x
- Java JDK 17+

## Observações

- Os arquivos são exemplos didáticos e podem ser executados individualmente.
- Recomenda-se o uso de um editor como VS Code com a extensão Metals para melhor experiência.

---

## Ambiente de Container, DevContainer e Codespaces

Este projeto pode ser facilmente utilizado em ambientes de container (como Docker), no GitHub Codespaces ou localmente via Dev Containers do VS Code, facilitando a configuração do ambiente de desenvolvimento.

### Usando Codespaces

1. Abra o repositório no GitHub e clique em "Code" > "Open with Codespaces".
2. Aguarde o provisionamento do ambiente. O Scala e o Java já estarão configurados.
3. Utilize o terminal integrado para executar os exemplos conforme instruções acima.

### Usando Dev Containers no VS Code (localmente)

1. Certifique-se de ter o [Docker](https://www.docker.com/), o [VS Code](https://code.visualstudio.com/) e a extensão [Dev Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) instalados.
2. Abra o projeto no VS Code.
3. Se existir a pasta `.devcontainer` com um arquivo `devcontainer.json`, o VS Code irá sugerir a reabertura do projeto no container. Aceite a sugestão.
4. O ambiente será configurado automaticamente com Scala e Java prontos para uso.
5. Utilize o terminal integrado para executar os exemplos normalmente.

---

Material de apoio para as aulas de programação funcional em Scala.
