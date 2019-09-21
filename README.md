# Calculadora para Imposto de Renda de Pessoa Física (IRPF)
Um sistema é usado para o cadastramento de contribuintes (pessoas físicas) e cálculo do imposto de renda. O cálculo pode ser feito visando a declaração completa ou a declaração simplificada. Os dados necessários para a declaração completa são:
- Nome*
- CPF*
- Idade**
- Número de dependentes**
- Contribuição previdenciária oficial***
- Total de rendimentos***

###### *Campos obrigatórios para todos os contribuintes
###### **Campos obrigatórios para os contribuintes que fazem declaração completa
###### ***Campos obrigatórios para permitir o cálculo do imposto (qualquer modalidade)

## Cálculo do imposto (declaração simplificada)
- A base de cálculo é obtida descontando-se do total de rendimentos a contribuição previdenciária oficial.
- Aplica-se um desconto único de 5% sobre a base de cálculo.

**O imposto a pagar é obtido a partir da base de cálculo:**
- Se a base de cálculo é de até R$ 12.000,00 então o contribuinte está isento (imposto a pagar zero).
- Se a base de cálculo for maior que R$ 12.000,00 e inferior a R$ 24.000,00, então o imposto a pagar corresponde a 15% do valor da base de cálculo que excede o valor da faixa anterior.
- Se a base de cálculo for maior ou igual a R$ 24.000,00, então o imposto a pagar é equivalente ao imposto devido na faixa anterior mais 27,5% do valor da base de cálculo que excede a faixa anterior.

## Cálculo do imposto (declaração completa)
A base de cálculo é obtida descontando-se do total de rendimentos a contribuição previdenciária oficial.
Em função da idade e do número de dependentes do contribuinte devese aplicar um desconto sobre a base de cálculo.
#### Para contribuintes com menos de 65 anos o desconto é de:
- 2% se o contribuinte tem até 2 dependentes
- 3,5% se contribuinte tem entre 3 e 5 dependentes
- 5% se o contribuinte tem mais de 5 dependentes

#### Para contribuintes com 65 anos ou mais o desconto é de:
- 3% se o contribuinte tem até 2 dependentes
- 4,5% se contribuinte tem entre 3 e 5 dependentes
- 6% se o contribuinte tem mais de 5 dependentes

**O imposto a pagar é obtido a partir da base de cálculo:**
- Se a base de cálculo é de até R$ 12.000,00 então o contribuinte está isento (imposto a pagar zero).
- Se a base de cálculo for maior que R$ 12.000,00 e inferior a R$ 24.000,00, então o imposto a pagar corresponde a 15% do valor da base de cálculo que excede o valor da faixa anterior.
- Se a base de cálculo for maior ou igual a R$ 24.000,00, então o imposto a pagar é equivalente ao imposto devido na faixa anterior mais 27,5% do valor da base de cálculo que excede a faixa anterior.


# Tabela das alíquotas

### Alíquota do Universo de Discurso
| **Valor Máximo** | **Diferença** |  **Imposto**  | **Imposto acumulado** |
| :--------------: | :-----------: | :-----------: | :-------------------: |
|  $R\$12.000,01$  |   $15,0\%$    | $R\$1.800,00$ |     $R\$1.800,00$     |
|  $R\$24.000,00$  |   $12,50\%$   | $R\$3.000,00$ |     $R\$4,800,00$     |

###### *Exemplo:*
| Salário              | $R\$13.141,59$                        |
| :------------------- | :------------------------------------ |
| Alíquota nessa faixa | $15,0\%$                              |
| Valor do imposto     | $R\$1.971,23$ *(R$13.141,59 * 0,15)*  |
| Parcela a deduzir    | $R\$1.800,00$                         |
| Imposto Final        | $R\$171,23$ *(R$1,971,23 - 1.800,00)* |
| Alíquota Efetiva     | $1,303\%$                             |


### Alíquota real em 2019
| **Valor Máximo** | **Diferença** | **Imposto** | **Imposto acumulado** |
| :--------------: | :-----------: | :---------: | :-------------------: |
|  $R\$1.903,98$   |   $7,50\%$    | $R\$142,80$ |      $R\$142,80$      |
|  $R\$2.823,65$   |   $7,50\%$    | $R\$212,00$ |      $R\$354,80$      |
|  $R\$3.751,05$   |   $7,50\%$    | $R\$281,33$ |      $R\$636,13$      |
|  $R\$4.664.68$   |   $5,00\%$    | $R\$233,23$ |      $R\$869,36$      |

###### *Exemplo:*
| Salário              | $R\$5.000,00$                        |
| :------------------- | :----------------------------------- |
| Alíquota nessa faixa | $27,5\%$                             |
| Valor do imposto     | $R\$1.375,00$ *(R$5.000,00 * 0,275)* |
| Parcela a deduzir    | $R\$869,36$                          |
| Imposto Final        | $R\$505,64$ *(R$1.375,00 - 869,36)*  |
| Alíquota Efetiva     | $10,11\%$                            |

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
