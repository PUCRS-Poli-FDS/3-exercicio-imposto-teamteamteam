[link](https://github.com/Steppschuh/Java-Markdown-Generator) para baixar a extensão do vscode para visualizar corretamente este arquivo readme.

# Calculadora para Imposto de Renda de Pessoa Física (IRPF)
Um sistema é usado para o cadastramento de contribuintes (pessoas físicas) e cálculo do imposto de renda. O cálculo pode ser feito visando a declaração completa ou a declaração simplificada usando as alíquotas definidas no enunciado do trabalho ou as alíquotas reais no Brasil em 2019.  

</br>

### Observações a respeito dos limites de contribuição
---
- Existe um limite máximo de desconto no INSS. Se o funcionário tiver salário muito alto, só poderá contribuir para a previdência até o valor do teto estabelecido (não pode contribuir mais que o teto). 
O limite máximo de desconto do INSS sobre o salário é `R$642,34`/mês, ou `11%` de R$5.839,45. 
- No caso de o funcionário fazer uma contribuição facultativa superior ao desconto máximo que é descontado por padrão, ele pode contribuir com no máximo o valor teto da contribuição para o INSS que é `R$1.167,89`/mês.

</br>

## Nomenclatura
---
`contribuinte:` Pessoa que paga o imposto.  
`total de rendimentos:` É o valor do salário anual do contribuinte (salário x12 meses).  
`contribuição previdenciária:` Normalmente é 10% do **total de rendimentos**.  
`base de cálculo:` É o valor central a partir do qual se aplica as fórmulas do cálculo do imposto obtido descontando-se do **total de rendimentos** a **contribuição previdenciária** anual.  
`dependentes` Número de pessoas dependentes do contrubuinte. Quanto mais pessoas maior o desconto.  
`desconto:` É um valor calculado dependendo da *idade* do contribuinte e de quantos *dependentes* ele tem.  

</br>

# Cálculo do imposto
Válido tanto para a declararação simplificada quanto a completa.

### Imposto a pagar
- É obtido a partir da base de cálculo:
  - Se a base de cálculo é de até `R$12.000,00` então o contribuinte está isento (imposto a pagar zero).
  - Se a base de cálculo estiver no intervalo (maior que `R$12.000,00` e inferior a `R$24.000,00`), então o imposto a pagar corresponde a `15%` do valor da base de cálculo que excede os R$12.000,00.
  - Se a base de cálculo for maior ou igual a `R$24.000,00`, então o imposto a pagar é equivalente ao imposto devido na faixa anterior mais `27,5%` do valor da base de cálculo que excede os R$24.000,00.

</br>

## Declaração simplificada
---
Os dados necessários para a declaração simplificada são:
- Nome `*`
- CPF `*`
- Contribuição previdenciária oficial `**`
- Total de rendimentos `**`

###### `*` Campos obrigatórios para todos os contribuintes  
###### `**` Campos obrigatórios para permitir o cálculo do imposto (qualquer modalidade)`

### Base de cálculo
- Obtida descontando-se do **total de rendimentos** a **contribuição previdenciária** oficial.

### Desconto
- Na declaração simples não consideraremos a *idade* e os *dependentes* do contribuinte.
- Aplica-se um **desconto** único de `5%` sobre a **base de cálculo**.

</br>

## Declaração completa
---
Os dados necessários para a declaração completa são:
- Nome `*`
- CPF `*`
- Contribuição previdenciária oficial `**`
- Total de rendimentos `**`
- Idade `***`
- Número de dependentes `***`

###### `*` Campos obrigatórios para todos os contribuintes  
###### `**` Campos obrigatórios para permitir o cálculo do imposto (qualquer modalidade)
###### `***` Campos obrigatórios para os contribuintes que fazem a declaração completa  

### Base de cálculo
- Obtida descontando-se do **total de rendimentos** a **contribuição previdenciária** oficial.
- Em função da *idade* e do número de *dependentes* do contribuinte devese aplicar um **desconto** sobre a **base de cálculo**.  

### Descontos
- Para contribuintes com menos de 65 anos:
  - `2%` se o contribuinte tem até 2 dependentes
  - `3,5%` se contribuinte tem entre 3 e 5 dependentes
  - `5%` se o contribuinte tem mais de 5 dependentes

- Para contribuintes com 65 anos ou mais:
  - `3%` se o contribuinte tem até 2 dependentes
  - `4,5%` se contribuinte tem entre 3 e 5 dependentes
  - `6%` se o contribuinte tem mais de 5 dependentes

</br>

# Tabela das alíquotas
Os valores das alíquotas foram divididos em valores diferentes, além da declaração completa e simplificada.  
- Valores dados no enunciado do trabalho, que são resumidos
- Valores do imposto no Brasil em 2019, que são reais.

## Alíquota do Universo de Discurso do enunciado
---
| **Valor Máximo** | **Diferença** |  **Imposto**  | **Imposto acumulado** | **Cálculo imposto acumulado** |
| :--------------: | :-----------: | :-----------: | :-------------------: | :---------------------------- |
|    R$12.000,00   |       0%      |   R$0,00      |       R$0,00          |                               |
|    R$12.000,01   |      15%      |   R$1.800,00  |       R$1.800,00      | *(R$0,00 + R$1.800,00)*       |
|    R$24.000,00   |      12%      |   R$3.000,00  |       R$4,800,00      | *(R$1.800,00 + R$3.000,00)*   |

###### *Exemplo:*  
| **Total de Rendimentos** | **R$13.141,59** | **Cálculo**               |
| :----------------------- | :-------------- | :------------------------ |
| Salário                  | R$1.095,13      |                           |
| Alíquota nessa faixa     | 15%             |                           |
| Valor do imposto         | R$1.971,23      | *(R$13.141,59 * 0,15)*    |
| Parcela a deduzir        | R$1.800,00      | *(R$12.000,00 * 0,15)*    |
| Imposto Final            | R$171,23        | *(R$1,971,23 - 1.800,00)* |
| Alíquota Efetiva         | 1,303%          |                           |

</br>

## Alíquota real em 2019 no Brasil
---
| **Valor Máximo** | **Diferença** | **Imposto** | **Imposto acumulado** | **Cálculo imposto aculudado** |
| :--------------: | :-----------: | :---------: | :-------------------: | :---------------------------- |
|    R$1.903,97    |       0%      |   R$0,00    |        R$0,00         |                               |
|    R$1.903,98    |     7,5%      |   R$142,80  |        R$142,80       |                               |
|    R$2.823,65    |     7,5%      |   R$212,00  |        R$354,80       | *(R$142,80 + R$212,00)*       |
|    R$3.751,05    |     7,5%      |   R$281,33  |        R$636,13       | *(R$354,80 + R$281,33)*       |
|    R$4.664.68    |     5,0%      |   R$233,23  |        R$869,36       | *(R$636,13 + R$233,23)*       |

###### *Exemplo:*  
| **Total de Rendimentos** | **R$60.000,00** | **Cálculo**               |
| :----------------------- | :-------------- | :------------------------ |
| Salário                  | R$5.000,00      |                           |
| Alíquota nessa faixa     | 27,5%           |                           |
| Valor do imposto         | R$1.375,00      | *(R$5.000,00 * 0,275)*    |
| Parcela a deduzir        | R$869,36        | *(R$1.375,00 - R$869,36)* |
| Imposto Final            | R$505,64        | *(R$1.375,00 - 869,36)*   |
| Alíquota Efetiva         | 10,11%          |                           |

</br>

# Elementos identificados no universo de discurso
- Pessoa
  - Nome
  - CPF
  - Renda
    - Rendimento total nos últimos 12 meses
    - Contribuição total previdenciária oficial
    - **Base de cálculo** (Rendimento total - Contribuição total previdenciária)
    - Desconto (baseado na idade ex.:5%)
    - Valor do desconto (base de cálculo * desconto)
    - **Base de cálculo** *final com desconto* (Base de cálculo - Valor do desconto)
  - Idade (data nascimento)
  - Número de dependentes

- Declaração 
    - Declaração Simples *(desconto fixo em 5%)*
    - Declaração Completa *(desconto varia em função da idade e nº de dependentes)*
    - Cálculo do imposto de renda de pessoa física
      - Base de cálculo
          - Base de cálculo zero (isento)
          - Base de cálculo com rendimentos 
          - Base de cálculo com rendimento excedente
    - Contribuição (valor final após o cálculo)

</br>

## Design Arquitetural
---

### Pacotes
```
└── src
    ├── main
    │   └── java
    │       └── calculator
    │           └── userinterface
    │               ├── gui
    │               └── report
    │           ├── domain
    │           ├── services
    │           └── database
    │               ├── data
    │               └── jdbc
    └── test
```

</br>

## Roadmap
---

### Branches & Builds

```java
// Change code from portuguese to english
+ fiz/feat/change-denominations-to-english-words
    @commit: "Alter packages and classes denomination"
    @commit: "Alter atributes and methods denomination"
    @build: "v0.1"
    @merge -> master
```

```java
// Define architectural constraints
+ fiz/feat/define-achitectural-constraints
    @commit: ""t7
    @build: "v0.2"
    @merge -> master
```

```java
// Implement tax algorithm
+ fiz/feat/implement-algorithm-to-calculate-tax
```

```java
// Generate random data for taxpayer
+ fiz/feat/generate-taxpayer-random-data
```

```java
+ fiz/feat/print-report-in-markdown
```

```java
+ fiz/feat/implement-main-parameter-handling
```

###### legend:

`fiz/` "desenvolvedor atribuído"  
`test/` "implementar testes"  
`fix/` "consertar algo"  
`bug/` "corrigir um bug"  
`feat/` "implementar uma feature"  
`@commit:` "título do commit"  
`@build` "rodar testes e compilar o código antes do merge"  
`@merge->master` "a branch master recebe a feature da branch atual"  
`+ fiz/feat/branch-name` "uma *branch* em que o desenvolvedor *fiz* implementa uma *feature*"

---