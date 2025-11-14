TechFlow – Gerenciador de Tarefas 2.0

 Objetivo

O TechFlow é um sistema simples de gerenciamento de tarefas desenvolvido em Java com Maven, estruturado em camadas para demonstrar boas práticas de programação orientada a objetos, versionamento com Git e integração contínua utilizando GitHub Actions.

 Escopo do Projeto

O sistema permite:

Criar novas tarefas

Listar todas as tarefas existentes

Buscar uma tarefa pelo ID

Excluir uma tarefa específica

Cada tarefa possui:

ID

Título

Descrição

Data de vencimento

Status (concluída ou não)

 Metodologia Adotada

A arquitetura do projeto foi organizada da seguinte forma:

✔ Model

Contém a classe Task, que representa a estrutura de cada tarefa.

✔ Repository

A classe TaskRepository faz o armazenamento das tarefas em memória usando uma List.

✔ Service

TaskService concentra as regras de negócio e manipulação das tarefas.

✔ Main

Classe responsável pela execução do sistema e demonstração das funcionalidades implementadas.

✔ Integração Contínua

Pipeline configurado com GitHub Actions, validando o build automaticamente.

Build automatizado com Maven.

▶ Como Executar o Sistema
1. Requisitos

Java 17+

Apache Maven instalado e configurado