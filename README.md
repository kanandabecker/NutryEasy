# 🥗 NutryEasy

O **NutryEasy** é uma aplicação fullstack desenvolvida para facilitar o acompanhamento nutricional, conectando **usuários, nutricionistas e (futuramente) empresas** em uma única plataforma inteligente.

A proposta é simples: transformar o controle de dieta e saúde em algo **prático, acessível e eficiente**.

---

## 🚀 Tecnologias Utilizadas

### 🎨 Frontend

* React
* TypeScript
* Vite
* Tailwind CSS

### ⚙️ Backend

* Java
* Spring Boot
* PostgreSQL
* Swagger (documentação da API)

---

## 📁 Estrutura do Projeto

```
nutryeasy/
 ├── frontend/   # Interface do usuário (React)
 └── backend/    # API e regras de negócio (Spring Boot)
```

---

## 🧠 Conceito do Sistema

O sistema foi pensado com base em **arquitetura escalável**, permitindo diferentes perfis de usuários:

* 👤 **Usuário comum**

  * Visualiza dietas
  * Acompanha progresso
  * Gerencia dados pessoais

* 🥗 **Nutricionista**

  * Gerencia pacientes
  * Cria e edita planos alimentares
  * Acompanha evolução

* 🏢 **Empresa (futuro)**

  * Relatórios de saúde
  * Gestão de usuários
  * Indicadores

---

## ⚙️ Como Executar o Projeto

### 🔹 Frontend

```bash
cd frontend
npm install
npm run dev
```

A aplicação estará disponível em:

```
http://localhost:5173
```

---

### 🔹 Backend

```bash
cd backend
./mvnw spring-boot:run
```

A API estará disponível em:

```
http://localhost:8080
```

---

## 📌 Funcionalidades (Roadmap)

* 🔐 Autenticação de usuários (login e cadastro)
* 👤 Gerenciamento de perfil
* 🥗 Criação e visualização de dietas
* 📊 Dashboard dinâmico por tipo de usuário
* 🧑‍⚕️ Painel do nutricionista
* 🏢 Módulo empresarial (em desenvolvimento)

---

## 🧱 Arquitetura

O projeto segue boas práticas de desenvolvimento:

* Frontend com **arquitetura baseada em features**
* Backend com **camadas (Controller, Service, Repository)**
* Separação clara de responsabilidades
* Preparado para crescimento e manutenção

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

* Prática de desenvolvimento fullstack
* Aplicação de boas práticas de arquitetura
* Construção de um sistema real escalável
* Evolução contínua com novas funcionalidades

---

## 👨‍💻 Autor

Desenvolvido por **Kananda Becker**

---

## ⭐ Observações

O NutryEasy está em constante evolução. Novas funcionalidades e melhorias serão adicionadas ao longo do tempo 🚀
