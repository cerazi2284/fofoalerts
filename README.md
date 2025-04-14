# 🚀 FofoAlerts

## 📌 Visão Geral
O **FofoAlerts** é uma aplicação de mensageria que utiliza **Apache Kafka**, desenvolvida em uma arquitetura de microserviços composta por:

- **Producer (Spring Boot):** Recebe mensagens via API REST e publica nos tópicos do Kafka.
- **Consumer (Spring Boot):** Escuta os tópicos do Kafka, recebe as mensagens publicadas e executa ações pré-definidas, como enviar e-mails, notificações ou atualizar dashboards.
- **Frontend (React):** Interface web simples que permite o envio de mensagens ao Producer.

## 🛠️ Tecnologias Utilizadas
- **Backend:** Java, Spring Boot, Spring Kafka
- **Frontend:** React, Axios
- **Mensageria:** Apache Kafka
- **Outros:** Swagger, H2 Database (para testes locais)

## 📂 Estrutura do Projeto

fofoalerts/
├── producer/     # Serviço backend Producer (Spring Boot)
├── consumer/     # Serviço backend Consumer (Spring Boot)
├── frontend/     # Aplicação Front-end (React)
└── docs/         # Documentação e diagramas

## ▶️ Como Executar Localmente

### 🔸 Producer (Spring Boot)
1. Navegue até a pasta `producer`.
2. Execute o comando:
   mvn spring-boot:run

   O serviço ficará disponível em `http://localhost:8080` (ou conforme definido no `application.properties`).

### 🔸 Consumer (Spring Boot)
1. Navegue até a pasta `consumer`.
2. Execute o comando:
   mvn spring-boot:run

   O Consumer ficará escutando as mensagens publicadas pelo Producer no Kafka.

### 🔸 Frontend (React)
1. Navegue até a pasta `frontend`.
2. Instale as dependências:
   npm install
3. Inicie a aplicação:
   npm start

   A aplicação ficará disponível em `http://localhost:3000`.

## 📐 Arquitetura do Projeto
*(Diagrama de arquitetura será adicionado futuramente na pasta `docs`.)*

## 🖥️ Demonstração
*(Imagem ou GIF da aplicação rodando será adicionado futuramente.)*



## 🙌 Considerações Finais
O projeto **FofoAlerts** demonstra o conhecimento em desenvolvimento full-stack, integração de microserviços, uso de mensageria com Kafka e boas práticas na organização e documentação de código.  
Desenvolvido com o propósito educacional e profissional, evidenciando aprendizado contínuo e evolução técnica.
