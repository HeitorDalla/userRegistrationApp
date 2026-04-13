# 📱 User Registration App

Aplicativo Android simples para cadastro e listagem de usuários utilizando **Java + Room Database**.

---

## 🚀 Funcionalidades

- Cadastro de usuários
- Validação de campos obrigatórios (Nome e CPF)
- Armazenamento local com Room (SQLite)
- Visualização de relatório com usuários cadastrados

---

## 🛠️ Tecnologias utilizadas

- Java
- Android SDK
- Room Database (SQLite)
- XML (layouts)

---

## 📂 Estrutura do Projeto

📦 com.example.userregistrationapp
 ┣ 📜 MainActivity.java
 ┣ 📜 ReportActivity.java
 ┣ 📜 User.java
 ┣ 📜 UserDao.java
 ┣ 📜 UserDatabase.java
 ┣ 📂 res/layout
 ┃ ┣ 📜 activity_main.xml
 ┃ ┗ 📜 activity_report.xml

---

## 📸 Telas do App

### Cadastro de Usuário
- Inserção de nome, CPF, email e telefone
- Botão para salvar usuário

### Relatório
- Lista todos os usuários cadastrados
- Botão para voltar para tela inicial

---

## ⚙️ Como rodar o projeto

1. Clone o repositório:
git clone https://github.com/seu-usuario/userRegistrationApp.git

2. Abra no Android Studio

3. Aguarde o Gradle sincronizar

4. Execute o app em um emulador ou dispositivo físico

---

## ⚠️ Observações

- Uso de allowMainThreadQueries() apenas para simplificação
- Banco de dados local (não persiste após desinstalação)
- Validação básica dos dados

---

## 📌 Melhorias futuras

- Validação de CPF
- Melhorias de interface
- Busca de usuários
- Editar e deletar usuários
- Integração com API ou Firebase

---

## 👨‍💻 Autor

Projeto simples para fins de estudo.
