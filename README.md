# 🏦 Desafio Backend BTG Pactual

## 📌 Sobre o Projeto
Este projeto é uma reimplementação do desafio do **BTG Pactual**, focado na criação e gerenciamento de pedidos, utilizando **RabbitMQ** para ordenação de filas e **MongoDB** para persistência de dados.

## 🚀 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.4.4**
- **Spring Data MongoDB**
- **Spring Web**
- **Spring AMQP** (RabbitMQ)
- **Docker** (para containers de banco de dados e fila)
- **Lombok** (para reduzir código boilerplate)
- **Spring Boot DevTools** (para facilitar desenvolvimento)
- **JUnit 5** e **Spring Rabbit Test** (para testes automatizados)

## ⚙️ Configuração do Ambiente
### 🐳 Requisitos
Certifique-se de ter instalado:
- **Java 21**
- **Maven**
- **Docker e Docker Compose**

### 📂 Clonando o Repositório
```sh
git clone https://github.com/Guh-paixao/btg-pactural-test-queue.git
cd btg-pactural-test-queue
```

### 🔧 Subindo os Containers
Utilizamos **Docker Compose** para facilitar a configuração dos serviços:
```sh
cd /local
docker-compose up -d
```
Isso iniciará **MongoDB** e **RabbitMQ**.

### ▶️ Executando a Aplicação
```sh
mvn spring-boot:run
```
A aplicação estará disponível em **http://localhost:8080**.

## 🔥 Funcionalidades
- 📥 **Recebimento de pedidos** via **RabbitMQ**.
- 📄 **Persistência de pedidos** no **MongoDB**.
- 📌 **Consulta de pedidos por cliente**.
- 📊 **Paginação e ordenação** dos pedidos.

## 📡 Endpoints Principais
### 1️⃣ Criar um Pedido
```http
POST /orders
```
📌 **Request Body:**
```json
{
  "codigoCliente": 1,
  "itens": [
    { "produto": "lápis", "quantidade": 100, "preco": 1.10 },
    { "produto": "caderno", "quantidade": 10, "preco": 1.00 }
  ]
}
```

### 2️⃣ Listar Pedidos por Cliente
```http
GET /customers/{customerId}/orders?page=0&pageSize=10
```
📌 **Response:**
```json
{
  "summary": {
    "totalOnOrders": 2670.1
  },
  "data": [
    {
      "orderId": 1001,
      "customerId": 1,
      "total": 120
    },
    {
      "orderId": 1002,
      "customerId": 1,
      "total": 2550.1
    }
  ],
  "pagination": {
    "page": 0,
    "pageSize": 10,
    "totalElements": 2,
    "totalPages": 1
  }
}
```

## 🛠 Testes
Para rodar os testes automatizados:
```sh
mvn test
```

## 📄 Licença
Este projeto está sob a **MIT License** - sinta-se à vontade para utilizá-lo e contribuir! 🚀