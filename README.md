# 50 Exercícios de Lógica de Programação em Java

## 📋 Sobre este Projeto

Esta coleção contém **50 exercícios práticos** desenvolvidos para aprimorar suas habilidades em lógica de programação usando Java. Os exercícios foram criados pela IA Manus e cobrem desde conceitos básicos até programação orientada a objetos (POO), proporcionando uma progressão natural de aprendizado.

## 🎯 Objetivos

- Desenvolver e fortalecer a lógica de programação
- Praticar estruturas de controle (if/else, switch)
- Dominar o uso de loops (for e while)
- Aplicar conceitos básicos de Programação Orientada a Objetos
- Resolver problemas algorítmicos do mundo real

## 📚 Estrutura do Conteúdo

### 🟢 Package: `logica_basica` (Exercícios 1-10)
**Conceitos abordados:**
- Entrada e saída de dados
- Operações matemáticas básicas
- Estruturas condicionais (if/else, switch)
- Tratamento de casos especiais (divisão por zero)

**Exercícios por package:**
- `exercicio01` → Saudação personalizada
- `exercicio02` → Calculadora básica com 4 operações
- `exercicio03` → Cálculo de área de retângulo
- `exercicio04` → Conversão de temperatura (Celsius para Fahrenheit)
- `exercicio05` → Verificação de números pares/ímpares
- `exercicio06` → Comparação de três números
- `exercicio07` → Verificação de maioridade
- `exercicio08` → Cálculo de perímetro de circunferência
- `exercicio09` → Identificação de dias da semana
- `exercicio10` → Cálculo de IMC (Índice de Massa Corporal)

### 🔵 Package: `loops_for` (Exercícios 11-25)
**Conceitos abordados:**
- Loops for simples e aninhados
- Iteração com contadores
- Manipulação de strings
- Algoritmos matemáticos
- Uso de Math.random()

**Exercícios por package:**
- `exercicio11` → Sequências numéricas (1-10)
- `exercicio12` → Números pares (2-20)
- `exercicio13` → Soma de números (1-100)
- `exercicio14` → Tabelas de multiplicação
- `exercicio15` → Cálculo de factorial
- `exercicio16` → Sequência de Fibonacci
- `exercicio17` → Manipulação de caracteres
- `exercicio18` → Padrões com asteriscos
- `exercicio19` → Análise de divisores
- `exercicio20` → Verificação de números primos
- `exercicio21` → Soma de números ímpares
- `exercicio22` → Cálculo de promedios
- `exercicio23` → Inversão de strings
- `exercicio24` → Contagem de vocais
- `exercicio25` → Simulação de dados

### 🟡 Package: `loops_while` (Exercícios 26-40)
**Conceitos abordados:**
- Loops while e condições de parada
- Validação de entrada
- Jogos interativos
- Processamento de dados até condição específica
- Manipulação de números (dígitos, palíndromos)

**Exercícios por package:**
- `exercicio26` → Contagem regressiva (10-1)
- `exercicio27` → Acumulação de valores positivos
- `exercicio28` → Jogo de adivinhação
- `exercicio29` → Cálculo de potências
- `exercicio30` → Números ímpares (1-50)
- `exercicio31` → Validação de senhas
- `exercicio32` → Contagem de dígitos
- `exercicio33` → Menu interativo
- `exercicio34` → Soma de dígitos
- `exercicio35` → Estatísticas de números
- `exercicio36` → Detecção de palíndromos
- `exercicio37` → Números aleatórios
- `exercicio38` → Séries matemáticas
- `exercicio39` → Processamento de caracteres
- `exercicio40` → Contagem regressiva personalizada

### 🔴 Package: `poo` (Exercícios 41-50)
**Conceitos abordados:**
- Classes e objetos
- Atributos e métodos
- Construtores
- Encapsulamento (getters/setters)
- Herança
- Polimorfismo
- Classes abstratas

**Exercícios por package:**
- `exercicio41` → Classe Coche (modelagem básica)
- `exercicio42` → Classe Rectangulo (métodos de cálculo)
- `exercicio43` → Classe CuentaBancaria (encapsulamento)
- `exercicio44` → Classe Estudiante (métodos condicionais)
- `exercicio45` → Classe Libro (construtores)
- `exercicio46` → Classe Circulo (getters/setters)
- `exercicio47` → Classe Producto (encapsulamento completo)
- `exercicio48` → Herança (Empleado → Gerente)
- `exercicio49` → Polimorfismo (Animal → Perro, Gato)
- `exercicio50` → Classes abstratas (FiguraGeometrica)

## 📁 Estrutura do Projeto

O projeto está organizado de forma simples e intuitiva:

```
src/main/java/
├── logica_basica/          # Exercícios 1-10
│   ├── exercicio01/
│   ├── exercicio02/
│   └── ...
├── loops_for/              # Exercícios 11-25
│   ├── exercicio11/
│   ├── exercicio12/
│   └── ...
├── loops_while/            # Exercícios 26-40
│   ├── exercicio26/
│   ├── exercicio27/
│   └── ...
└── poo/                    # Exercícios 41-50
    ├── exercicio41/
    ├── exercicio42/
    └── ...
```

Cada exercício tem seu próprio **package independente**, facilitando:
- ✅ Navegação rápida
- ✅ Desenvolvimento isolado
- ✅ Organização por temas
- ✅ Ausência de conflitos entre exercícios

## 🛠️ Pré-requisitos

- **Java JDK 8+** instalado
- **IDE de sua preferência** (IntelliJ IDEA, Eclipse, VS Code, etc.)
- Conhecimentos básicos de sintaxe Java
- Conceitos fundamentais de programação

## 🚀 Como Usar

1. **Clone ou baixe** os arquivos do projeto
2. **Abra sua IDE** favorita
3. **Navegue pelos packages** seguindo a ordem:
    - `logica_basica` → `loops_for` → `loops_while` → `poo`
4. **Implemente cada exercício** em seu respectivo package
5. **Teste cada solução** com diferentes entradas
6. **Compare suas soluções** com outras implementações
7. **Pratique regularmente** para fixar os conceitos

## 💡 Exemplos de Imports

Quando precisar usar um exercício em outro:
```java
// Exemplo de imports entre packages
import logica_basica.exercicio02.CalculadoraBasica;
import loops_for.exercicio15.Factorial;
import poo.exercicio43.CuentaBancaria;
```

## 📝 Dicas de Estudo

### Para Iniciantes:
- Resolva os exercícios seguindo a ordem dos packages: `logica_basica` → `loops_for` → `loops_while` → `poo`
- Não pule packages - cada um prepara para o próximo
- Teste com diferentes casos de entrada
- Comente seu código para entender a lógica

### Para Intermediários:
- Tente resolver cada exercício de múltiplas formas
- Foque na otimização e legibilidade do código
- Implemente tratamento de erros robusto
- Explore diferentes estruturas de dados

### Para Avançados:
- Refatore soluções para melhor design
- Implemente testes unitários
- Considere padrões de design quando aplicável
- Analise a complexidade algorítmica

## 🎯 Progressão Recomendada

```
Package logica_basica (exercicios 1-10) → Fundamentos sólidos
            ↓
Package loops_for (exercicios 11-25) → Domínio de loops for
            ↓
Package loops_while (exercicios 26-40) → Controle com while
            ↓
Package poo (exercicios 41-50) → POO aplicada
```

## 🏆 Objetivos de Aprendizado por Package

| Package | Habilidades Desenvolvidas | Tempo Estimado |
|---------|---------------------------|----------------|
| logica_basica | Lógica básica, I/O, condicionais | 2-3 dias |
| loops_for | Loops for, algoritmos, strings | 4-5 dias |
| loops_while | Loops while, validação, jogos | 4-5 dias |
| poo | POO, classes, herança | 5-7 dias |

## 💡 Conceitos-Chave Abordados

- **Entrada/Saída**: Scanner, System.out
- **Operadores**: Aritméticos, relacionais, lógicos
- **Estruturas de Controle**: if/else, switch, for, while
- **Tipos de Dados**: int, double, String, boolean
- **Classes da API Java**: Math, String, Random
- **POO**: Classes, objetos, herança, polimorfismo
- **Algoritmos**: Ordenação, busca, validação

## 🤝 Contribuições

Sinta-se à vontade para:
- Propor melhorias nas soluções
- Adicionar casos de teste
- Sugerir exercícios complementares
- Compartilhar implementações alternativas

## 📖 Recursos Adicionais

- [Documentação oficial do Java](https://docs.oracle.com/javase/)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Exercícios interativos online](https://www.hackerrank.com/domains/java)

---

**Desenvolvido para prática educativa • Criado pela IA Manus**

> "A prática leva à perfeição. Cada exercício resolvido é um passo mais próximo do domínio da programação!" 💪

---

*Última atualização: Maio 2025*