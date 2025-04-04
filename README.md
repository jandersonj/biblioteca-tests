# Testes Unitários do Sistema de Gerenciamento de Biblioteca

Este documento descreve os cenários de teste implementados para o sistema de gerenciamento de biblioteca, desenvolvido em Java 21 com testes unitários utilizando **JUnit 5** e **Mockito**. Os testes garantem que as funcionalidades principais do sistema estejam funcionando corretamente e ajudam a prevenir regressões durante o desenvolvimento.

---

## Cenários Cobertos


* Criar um livro e verificar seus atributos.
* Adicionar um livro à biblioteca.
* Emprestar um livro disponível.
* Tentar emprestar um livro indisponível (comportamento esperado: não muda o estado).
* Devolver um livro.

## Requisitos para Rodar os Testes

Para executar os testes, você precisará dos seguintes componentes instalados em sua máquina:

- **Java 21**: O projeto foi desenvolvido e testado com o JDK 21. Certifique-se de ter essa versão instalada. Você pode baixá-la em [oracle.com/java](https://www.oracle.com/java/).
- **Maven**: Utilizado para gerenciar dependências e executar os testes. Faça o download em [maven.apache.org](https://maven.apache.org).
- **Git** (opcional): Necessário se você deseja clonar o repositório. Disponível em [git-scm.com](https://git-scm.com).

As dependências abaixo estão configuradas no arquivo `pom.xml` e serão baixadas automaticamente pelo Maven ao executar os testes:

- **JUnit 5**: Framework de testes unitários.
- **Mockito**: Biblioteca para criação de mocks e stubs.

---

## Como Rodar os Testes

Siga os passos abaixo para executar os testes unitários:

1. **Clone o repositório** (caso ainda não tenha o projeto localmente):
   ```bash
   git clone https://github.com/jandersonj/biblioteca-tests.git

1. **Navegue até o diretório do projeto:**
   ```bash 
   cd biblioteca

2. **Execute os testes com maven**
    ```bash 
    mvn test