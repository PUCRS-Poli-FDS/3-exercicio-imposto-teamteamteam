package calculadora.dominio;

public class PessoaFisica {
    private String nome;
    private String CPF;

    public PessoaFisica(String nome, String CPF) {
        setNome(nome);
        setCPF(CPF);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome.toString();
    }

    public String getCPF() {
        return this.CPF.toString();
    }

    @Override
    public String toString() {
        return getNome().toUpperCase()+" ("+getCPF()+")";
    }
}