# MockLoginAPI

## Descrição

O **MockLoginAPI** é um projeto de apoio ao desenvolvimento do **HgManager**, criado para disponibilizar dados e validar credenciais de usuários em testes e demonstrações. Ele contém modelos de usuário e departamento, acesso a dados com JPA e uma rotina de validação de login.

## Tecnologias utilizadas

- **Java 22** — linguagem e versão configurada no Maven.
- **Maven** — gerenciamento de dependências e build.
- **JPA / EclipseLink** — persistência e mapeamento objeto-relacional.
- **PostgreSQL** — banco de dados configurado na unidade de persistência.

## Como executar

### Pré-requisitos

- JDK 22 instalado.
- Maven instalado.
- Acesso a uma instância PostgreSQL compatível com a configuração do projeto.

### Passos

1. Clone ou extraia este repositório e entre na pasta que contém o arquivo `pom.xml`.
2. Configure a conexão com o banco de dados no arquivo `src/main/resources/META-INF/persistence.xml`. Informe URL, usuário e senha por meio de uma configuração segura; não publique credenciais no repositório.
3. Compile o projeto e baixe as dependências:

   ```bash
   mvn clean package
   ```

4. Use as classes de serviço no código de testes ou demonstrações do HgManager. A validação de login está disponível em `br.cefetmg.mockloginapi.service.UsuarioValidation`.

### Validação de login

A classe `UsuarioValidation` oferece os métodos `validateLogin(login, senha)` e `validateLogin(login, senha, useNomeAsLogin)`. O método de dois parâmetros utiliza CPF como identificador; o método com o terceiro parâmetro permite selecionar o nome como identificador (`true`) ou CPF (`false`). Credenciais inválidas geram `InvalidLoginCredentialsException`.

O projeto não documenta uma aplicação executável com servidor HTTP ou endpoints REST; portanto, `mvn clean package` compila e empacota o código, mas não inicia por si só um servidor de API.

## Estrutura principal

- `dao/` — consultas e acesso a usuários e departamentos.
- `dto/` — objetos de transferência de dados.
- `entity/` — entidades JPA `Usuario` e `Departamento`.
- `service/` — validação de login e conversão de entidades para DTOs.
- `src/main/resources/META-INF/persistence.xml` — configuração da persistência.

## Uso pretendido

Utilizar o projeto como suporte para testes e demonstrações do HgManager. Não o trate como serviço de autenticação de produção sem revisão de segurança, configuração adequada de credenciais e implementação da camada de API necessária.
