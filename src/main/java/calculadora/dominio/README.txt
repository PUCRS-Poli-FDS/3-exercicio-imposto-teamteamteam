 /*


    salario-contribuicao = salario bruto( valor da onde sera calculado o imposto)
        valores também se alteram conforme idade do contribuinte
        valore dos dependentes apenas alteram o deconto no salario bruto

        salario > 12.000 e < 24.000
        if( dependepente <= 2 )
            salarioBruto * 0.02 = valor do desconto

            salarioBruto - desconto = valorLiquido

            valorLiquido * 0.15 = valor do imposto a ser pago


        salario > 24.000
        if( dependepente <= 2 )
        salarioBruto * 0.02 = valor desconto 

        salarioBruto - desconto = valorLiquido

        valorLiquido * 0.275 = valor(não se exatamente onome desse resultado, mas funciona) 
        valor - 4800 ( imposto acumulado) = valor do imposto a ser pago

    */