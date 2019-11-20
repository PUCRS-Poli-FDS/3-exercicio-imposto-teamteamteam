package calculator.database.data;

import java.util.ArrayList;

import calculator.domain.Taxpayer;
import calculator.services.CPF;

public class TaxpayerList {
    private ArrayList<Taxpayer> list;

// criar singleton para essa classe

    public void register(Taxpayer person){
        list.add(person);
    }

    public Taxpayer get(String cpf) throws Exception {
        if(CPF.isValid(cpf)) {
            throw new Exception("CPF não é válido.");
        }
        int index = getTaxpayerIndex(cpf);
        if(index == 0) {
            throw new Exception("CPF não encontrado.");
        }
        Taxpayer taxpayer = list.get(index);
        return taxpayer;
    }

    public int getTaxpayerIndex(String cpf) {
        int index = 0;
        for(Taxpayer taxpayer: list) {
            if(CPF.compare(cpf, taxpayer.getCPF())) {
                index = list.indexOf(taxpayer);
            }
        }
        return index;
    }

}