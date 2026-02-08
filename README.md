# memelandia

## Sobre o Projeto
API backend desenvolvida como exercício prático de arquitetura, com foco na evolução de um monólito para microserviços utilizando o Strangler Pattern.
O objetivo do projeto é estudar separação de responsabilidades, comunicação entre serviços e decisões arquiteturais reais, sem foco em produção.

## Tecnologias Utilizadas
- Java 21 (microservices)
- Spring Boot 4 (microservices)
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- RestTemplate (comunicação entre as APIs)

## Como executar o projeto

Pré-requisitos:
- Java 21 ou superior
- Maven (ou Maven Wrapper)
- Docker
- PostgreSQL
- Postman (opcional)

Banco de dados:
O PostgreSQL deve estar rodando via Docker antes de subir os serviços.

Execução dos serviços:

usuario-service:
Comando:
./mvnw spring-boot:run
Rodando em:
http://localhost:8081

legado (memelandia):
Comando:
./mvnw spring-boot:run
Rodando em:
http://localhost:8080

## Comunicação entre serviços
- O legado consome o usuario-service via HTTP
- O legado não acessa o banco de usuário diretamente
- O usuario-service é o dono do dado

## Endpoints principais (Usuário)

Criar usuário:
POST /usuarios

Listar usuários:
GET /usuarios

- Exemplo de usuário pra adicionar
  ```
  {
  "nome": "Carlos Pereira",
  "email": "carlos@memelandia.com",
  "dataCadastro": "2026-02-06"
  }
  ```

As requisições podem ser feitas tanto diretamente no usuario-service quanto através do legado.

## Banco de Dados
- PostgreSQL
- Banco compartilhado apenas para fins de estudo
- Cada serviço é responsável apenas pelos seus próprios dados
- O domínio de usuário é persistido exclusivamente pelo usuario-service

## Objetivo do Projeto
Projeto voltado exclusivamente para aprendizado, com foco em:
- Arquitetura
- Migração incremental
- Comunicação entre serviços
- Boas práticas em APIs

## Status
- Extração do domínio de Usuário concluída
- Próximos domínios: Categoria, Meme
- Evoluções futuras: gateway, melhorias de comunicação, observabilidade
