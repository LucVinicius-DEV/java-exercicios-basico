# Exercícios Java Básico

Repositório criado para armazenar os exercícios práticos do meu aprendizado em Java.  
Este material faz parte do curso completo de Java que estou estudando, com foco em lógica de programação, estruturas de controle, laços de repetição, vetores e muito mais.

## Estrutura do Repositório

Cada exercício está salvo em arquivos `.java` separados, nomeados de forma clara para identificar o conteúdo estudado.

## Exercícios já disponíveis

- `NumeroPositivoNegativo.java`:  
  Programa que identifica se o número digitado é positivo, negativo ou zero, usando estrutura condicional `if-else`.

- `NumeroParImpar.java`:  
  Programa que verifica se o número digitado é par ou ímpar utilizando o operador de módulo (`%`).

- `NumerosMultiplos.java`:  
  Programa que verifica se dois números são múltiplos entre si (ou seja, se um é divisível pelo outro).

- `DuracaoJogo.java`:  
  Programa que calcula a duração de um jogo com base na hora inicial e final, considerando que o jogo pode atravessar a meia-noite (ex: iniciar às 22h e terminar às 6h do dia seguinte).

- `CalculadoraContaLanchonete.java`:  
  Programa que simula o sistema de pedidos de uma lanchonete.  
  Com base em um código de item e na quantidade informada pelo usuário, ele calcula o valor total da conta utilizando `switch` e boas práticas de entrada e saída.

- `IntervaloValores.java`:  
  Programa que lê um valor decimal e informa em qual dos intervalos definidos ele se encontra:
  - [0,25]
  - (25,50]
  - (50,75]
  - (75,100]  
  Caso esteja fora desses intervalos, retorna a mensagem "Fora de intervalo".

- `IntervaloNumerico.java`:  
  Programa que identifica em qual dos seguintes intervalos se encontra um número informado pelo usuário: [0,25], (25,50], (50,75], (75,100].  
  Caso o valor esteja fora desses intervalos, imprime "Fora de intervalo".

- `ImpostoRendaLisarb.java`:  
  Programa que calcula o valor do imposto de renda a ser pago com base no salário do usuário, seguindo a tabela progressiva do país fictício Lisarb.  
  Faixas:  
  - Até R$2000.00: isento  
  - R$2000.01 até R$3000.00: 8%  
  - R$3000.01 até R$4500.00: 18%  
  - Acima de R$4500.00: 28%  
  O cálculo é feito progressivamente conforme o valor excedente de cada faixa.

## Como executar os códigos

1. Instale o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) na sua máquina (se ainda não tiver).
2. Compile o arquivo desejado usando o terminal:

   ```bash
   javac NomeDoArquivo.java
