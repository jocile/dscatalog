# DSCatalog

![catalog](https://github.com/jocile/dscatalog/assets/45495068/acba646a-1519-4768-9ed5-111eba0ad36e)

<!-- Status -->

## 🚧 DSCatalog 🚀 Em construção ...  🚧

![Github top language](https://img.shields.io/github/languages/top/jocile/catalog?color=56BEB8)
![Github language count](https://img.shields.io/github/languages/count/jocile/catalog?color=56BEB8)
![Repository size](https://img.shields.io/github/repo-size/jocile/catalog?color=56BEB8)
![License](https://img.shields.io/github/license/jocile/catalog?color=56BEB8)
![Github issues](https://img.shields.io/github/issues/jocile/catalog?color=56BEB8)
![Github forks](https://img.shields.io/github/forks/jocile/catalog?color=56BEB8)
![Github stars](https://img.shields.io/github/stars/jocile/catalog?color=56BEB8)

<!-- Menu -->

[Sobre](#dart-sobre) | [Recursos](#sparkles-recursos) | [Tecnologias](#rocket-tecnologias) | [Requisitos](#white_check_mark-requisitos) | [Iniciando](#checkered_flag-iniciando) | [Documentação](https://github.com/jocile/dscatalog/wiki) | [Licença](#page_facing_up-licença) | [Autor](#construction_worker-autor)

## :dart: Sobre

Sistema de catálogo de produtos usando Spring Boot no backend e React no frontend, desenvolvido no bootcamp do curso [DevSuperior](https://devsuperior.com.br/).

## :sparkles: Recursos

- Tela de detalhes do produto;
- Tela de catálogo de produtos com paginação;
- Interface para listar, inserir, editar e excluir registros.
- Segurança com validação de dados, autenticação e controle de autorização;
- Acesso ao banco de dados CRUD para produtos, categorias e usuários;
- Testes automatizados;

## :rocket: Tecnologias

As seguintes ferramentas foram usadas neste projeto:

- [Java JDK](https://docs.oracle.com/en/java/javase/);
  - [Maven builder](https://maven.apache.org/);
  - [Spring Boot framework](https://glysns.gitbook.io/springframework/);
  - [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data);
- [Banco de dados em memória H2](https://www.h2database.com/);
- [Banco de dados Postgresql](https://www.postgresql.org);
  - [Plataforma de administração de banco de dados PgAdmin](https://www.pgadmin.org/);
- [Interfaces de usuário ReactJS](https://pt-br.reactjs.org/);
  - [Gerenciamento de pacotes - Yarn](https://yarnpkg.com/);
  - [TypeScript](https://www.typescriptlang.org/);
  - [Bootstrap web framework](https://getbootstrap.com/);

## :white_check_mark: Requisitos

Antes de começar :checkered_flag:, é necessário ter instalados:

- Backend:
  - [Java JDK](https://www.oracle.com/java/technologies/downloads/);
  - [Git](https://git-scm.com)
  - [Maven](https://maven.apache.org/install.html).
- Frontend web:
  - [NodeJS](https://nodejs.org/en);
  - [Yarn](https://classic.yarnpkg.com/en/docs/install)

## :checkered_flag: Iniciando

> Clone este projeto

```bash
git clone https://github.com/jocile/dscatalog
```

### :zap: Backend

> Accesse a pasta do backend

```bash
cd dscatalog/backend
```

> Execute o backend do projeto

```bash
./mvnw spring-boot:run
```

> A API será iniciado no navegador: <http://localhost:8080/>\
> O banco de dados H2 será inicializado no navegador: <http://localhost:8080/h2-console>

<!-- Swagger-ui
> The backend API will initialize in the browser: <http://localhost:8080/swagger-ui/index.html>\
-->

### :art: Frontend

🚧 O front-end está 🚀 em construção... 🚧

> Access a pasta do frontend

```bash
cd catalog/frontend
```

> Instalando as dependencias

```bash
yarn
```

> Execute o frontend

```bash
yarn start
```

> O servidor frontend local será iniciado no navegador: <http://localhost:3000/>\
> e a rota URL do Dashboard será iniciada em: <http://localhost:3000/dashboard>\
> A página será recarregada se você fizer edições.\
> Você também verá quaisquer erros de lint no console.

## :page_facing_up: Licença

Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE.md).

## :construction_worker: Autor

Feito com :heart: por [Jocilé](https://github.com/jocile) seguindo o curso [Devsuperior](https://github.com/devsuperior) do Dr. [Nélio Alves](https://github.com/acenelio)

[Voltar ao topo](#dscatalog)
