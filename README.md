# API REST - CRUD de Produtos

Este projeto é uma API REST desenvolvida em Java com Spring Boot, que permite realizar operações de CRUD (Create, Read, Update, Delete) em produtos.

## Tecnologias Utilizadas

- Java 17+ (ou versão compatível)
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (ex: H2, MySQL, PostgreSQL)
- Maven

## Como Executar

1. **Clone o repositório:**
   ```bash
   git clone <url-do-repositorio>
   cd API-REST---estudo
   ```

2. **Configure o banco de dados:**
   - Por padrão, o projeto pode estar configurado para usar H2 (em memória) ou outro banco. Verifique o arquivo `src/main/resources/application.properties` para detalhes.

3. **Execute a aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```
   ou, se estiver no Windows:
   ```bash
   mvnw.cmd spring-boot:run
   ```

4. **Acesse a API:**
   - A aplicação estará disponível em: `http://localhost:8080`

## Endpoints

| Método | Endpoint           | Descrição                  |
|--------|--------------------|----------------------------|
| GET    | /products          | Lista todos os produtos    |
| GET    | /products/{id}     | Busca produto por ID       |
| POST   | /products          | Cria um novo produto       |
| PUT    | /products/{id}     | Atualiza um produto        |
| DELETE | /products/{id}     | Remove um produto          |

### Exemplo de JSON para criação/atualização

```json
{
  "name": "Produto Exemplo",
  "price": 100
}
```

## Estrutura do Projeto

- `controllers/` - Controladores REST
- `model/` - Entidades JPA
- `dtos/` - Data Transfer Objects
- `repositories/` - Interfaces de acesso ao banco de dados

