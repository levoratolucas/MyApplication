# 📱 MyApplication

Base de aplicação Android construída com **Jetpack Compose**, focada em **modularização de UI**, reutilização de componentes e organização escalável.

---

## 🚀 Objetivo

Criar uma estrutura limpa e profissional para desenvolvimento de interfaces Android, com:

* Separação clara de responsabilidades
* Componentes reutilizáveis
* Facilidade de manutenção
* Base para evolução futura (arquitetura completa)

---

## 🧱 Estrutura do Projeto

```
com.example.myapplication
│
├── ui/
│   ├── screens/           # Telas (Home, Login, etc)
│   ├── components/        # Componentes reutilizáveis
│   │   ├── topbar/
│   │   └── footer/
│   └── theme/
│
└── MainActivity.kt
```

---

## 🧠 Arquitetura

O projeto segue um padrão em camadas:

### 🔹 1. Components (Genéricos)

Componentes desacoplados, reutilizáveis e sem dependência de navegação.

Exemplos:

* `TopBar`
* `Footer`

---

### 🔹 2. App Components (Adaptadores)

Camada que conecta os componentes com o comportamento do app.

Exemplos:

* `AppTopBar`
* `AppFooter`

Responsável por:

* Definir ações (ex: navegação)
* Centralizar regras de UI

---

### 🔹 3. Screens (Telas)

Responsáveis apenas por exibir conteúdo.

Exemplos:

* `HomeScreen`
* `LoginScreen`
* `SairScreen`

---

## 🔝 TopBar

### ✔️ Componente genérico

```kotlin
TopBar(
    biblioteca = Map<String, () -> Unit>,
    tabAtual = String
)
```

* Não depende de `NavController`
* Executa ações externas

---

### ✔️ AppTopBar

```kotlin
AppTopBar(navController, currentRoute)
```

* Controla navegação
* Reutiliza `TopBar`

---

## 🔻 Footer

### ✔️ Componente genérico

```kotlin
Footer(
    autor: String,
    ano: Int
)
```

Exemplo:

```
© 2026 - Criado por Lucas
```

---

### ✔️ AppFooter

Define valores fixos da aplicação:

```kotlin
Footer("Lucas", 2026)
```

---

## 🧱 Layout com Scaffold

As telas utilizam `Scaffold` como estrutura base:

```kotlin
Scaffold(
    topBar = { AppTopBar(...) },
    bottomBar = { AppFooter() }
) { innerPadding ->

    // Conteúdo da tela

}
```

---

## 📐 Edge-to-Edge (UI Moderna)

O projeto utiliza layout edge-to-edge com ajustes adequados:

### 🔝 Topo

```kotlin
.statusBarsPadding()
```

### 🔻 Rodapé

```kotlin
.navigationBarsPadding()
```

---

## ✅ Boas práticas aplicadas

* Componentes desacoplados
* Navegação separada da UI
* Reutilização de layout
* Uso correto de `Scaffold`
* Compatibilidade com diferentes dispositivos

---

## 📌 Próximos passos

* [ ] Criar `Workspace` (container de conteúdo)
* [ ] Criar `ScreenTemplate`
* [ ] Melhorar navegação
* [ ] Adicionar ícones e animações
* [ ] Evoluir arquitetura (ViewModel, data layer)

---

## 👨‍💻 Autor

**Lucas**
📅 2026

---

## ⭐ Observação

Este projeto serve como base para evolução de aplicações Android modernas utilizando Jetpack Compose.
