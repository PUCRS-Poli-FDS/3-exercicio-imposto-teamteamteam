package calculator.data;

import java.util.ArrayList;

public class TaxpayerList {
    private ArrayList<PessoaFisica> pessoas;

// criar singleton para essa classe

    void cadastrar(PessoaFisica pessoa){
        // gerar um cpf unico para a pessoa
        pessoas.add(pessoa);
    }


}