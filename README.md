# 📦 Sistema de Entregas - Java + Spring Boot 🚀

Bem-vindo ao projeto que simula um sistema de entregas com **arquitetura limpa**, **REST API** e aplicação prática dos padrões de projeto **Singleton**, **Strategy** e **Facade**, tudo isso usando o ecossistema do **Spring Boot**! 🧠💻

## ✨ Sobre o Projeto

Este sistema permite o cadastro de clientes, entregadores e pedidos, com uma lógica flexível para escolher automaticamente um entregador com base em estratégias personalizadas! 🎯

## 💡 Funcionalidades

* 👤 **Cadastro de clientes**
* 🚴 **Cadastro de entregadores**
* 📦 **Criação de pedidos** com atribuição automática de entregador
* 🧠 **Aplicação de estratégia** de seleção de entregador
* 🪪 Uso de padrão **Singleton** para configurações globais
* 🧰 **Facade** centralizando a lógica de negócio
* 🔎 **Documentação da API** com **Swagger**
* 🧪 **Testes da API** via Swagger ou Postman

## ⚙️ Tecnologias e Ferramentas

* **Java 17** ☕
* **Spring Boot** 🧩
* **Spring Web** 🌐
* **Spring Data JPA** 🗂️
* **H2 Database** 🧪
* **Swagger / OpenAPI** 🧾
* **Postman** 📬

## 📐 Padrões de Projeto Aplicados

* 🔁 **Strategy**: Permite mudar a lógica de seleção de entregador dinamicamente.
* 🎩 **Facade**: Simples interface que centraliza toda a lógica de criação e listagem de pedidos.
* 🧍 **Singleton**: Configuração global de sistema injetada com escopo único usando `@Component`.

## 🏃 Como Rodar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/seu-repo.git](https://github.com/seu-usuario/seu-repo.git)
    ```

2.  **Abra o projeto** no IntelliJ, VS Code ou sua IDE favorita.

3.  **Rode o projeto** como uma aplicação Spring Boot.

4.  **Acesse a documentação da API:**
    ```bash
    http://localhost:8080/swagger-ui.html
    ```

5.  **Teste os endpoints** direto no Swagger ou usando o Postman com:
    ```arduino
    http://localhost:8080/
    ```

## 🧪 Exemplos de Requisições

### **➕ Criar Cliente** (`POST /clientes`)

```json
{
  "nome": "Murilo",
  "email": "murilo@email.com"
}
```

### **📦 Criar Pedido** (`POST /pedidos`)

```json
{
  "descricao": "Entregar notebook",
  "clienteId": 1
}
```

## 👨‍💻 Autor

Murilo França de Sousa
