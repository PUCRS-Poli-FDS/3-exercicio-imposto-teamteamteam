package calculator.data;

import java.util.ArrayList;

import calculator.domain.Taxpayer;

public class TaxpayerList {
    private ArrayList<Taxpayer> list;

// criar singleton para essa classe

    void register(Taxpayer person){
        list.add(person);
    }


}