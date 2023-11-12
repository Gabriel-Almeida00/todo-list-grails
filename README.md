# Todo List API com Grails

Este é um projeto de API REST desenvolvido em Grails, utilizando Groovy como linguagem de programação e Gradle como sistema de build.

## Pré-requisitos

Certifique-se de ter o Grails e o Gradle instalados em sua máquina.

- [Instalação do Grails](https://docs.grails.org/latest/guide/gettingStarted.html#installingGrails)
- [Instalação do Gradle](https://gradle.org/install/)
- PostgreSQl


## Endpoints da API

### 1. Usuários

- **Listar Usuários**
  - Endpoint: `GET /api/usuarios`
  - Descrição: Retorna todos os usuários cadastrados.

- **Buscar Usuário por ID**
  - Endpoint: `GET /api/usuarios/{id}`
  - Descrição: Retorna informações detalhadas de um usuário específico.

- **Cadastrar Usuário**
  - Endpoint: `POST /api/usuarios`
  - Descrição: Cadastra um novo usuário.
  - Corpo da Requisição:
    ```json
    {
      "nome": "Nome do Usuário",
      "email": "usuario@example.com"
      "password": "senha"
    }
    ```

- **Atualizar Usuário**
  - Endpoint: `PUT /api/usuarios/{id}`
  - Descrição: Atualiza as informações de um usuário existente.
  - Corpo da Requisição:
    ```json
    {
       "nome": "Nome do Usuário",
      "email": "usuario@example.com"
      "password": "senha"
    }
    ```

- **Deletar Usuário**
  - Endpoint: `DELETE /api/usuarios/{id}`
  - Descrição: Deleta um usuário existente.

- Os outros endpoints seguem o mesmo padrão para criar, listar, atualizar e deletar com diferentes objetos como alarm, task e category

## Contribuição

Sinta-se à vontade para contribuir para o desenvolvimento deste projeto. Para contribuir, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-feature`).
3. Commit suas alterações (`git commit -am 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Crie um novo Pull Request.



