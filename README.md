# Worker Income Calculator

Sistema em Java que calcula a renda mensal de um trabalhador com base em contratos por hora. 
Demonstra composição de classes, uso de enum, datas e Streams da API Java.

## 💼 Objetivo
Calcular o salário mensal de um trabalhador com base em seu salário base e nos contratos de horas 
realizados em um determinado mês e ano.

## 🧩 Conceitos aplicados
- Programação Orientada a Objetos (POO)
- Enum (`WorkerLevel`)
- Composição de objetos (`Worker`, `Department`, `HourContract`)
- API de datas (`LocalDate`, `DateTimeFormatter`)
- Streams para filtragem e soma de valores
- Boas práticas de encapsulamento

## 🚀 Como executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/TH14G00-J/worker-income-calculator.git
   ```
2. Abra no IntelliJ IDEA ou VS Code com o Java configurado.
3. Execute a classe `Main`.

## 🧮 Exemplo de uso
```
Enter department's name: Design
Name: Ana
Level: JUNIOR
Base salary: 1200
How many contracts to this worker? 2
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2025
Value per hour: 50
Duration (hours): 10
Enter contract #2 data:
Date (DD/MM/YYYY): 13/08/2025
Value per hour: 30
Duration (hours): 20
Enter month and year to calculate income (MM YYYY): 08 2025

Worker: Ana
Department: Design
Income for 08/2025: 2200.00
```

## 🧠 Tecnologias
- Java 17+
- IntelliJ IDEA / VS Code

## ✨ Autor
Thiago José
## Exercício do curso: Java COMPLETO Programação Orientada a Objetos + Projetos
