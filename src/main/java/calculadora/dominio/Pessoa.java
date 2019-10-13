package calculadora.dominio;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private int dependentes;
    private double salario;  
    private double contribuicao;

    public Pessoa(String nome,String cpf,int idade){

    }


    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }


    public int getIdade() {
        return idade;
    }

    public int getDependentes() {
        return dependentes;
    }

    public double getSalario() {
        return salario;
    }


    public double getContribuicao() {
        return contribuicao;
    }


    
}