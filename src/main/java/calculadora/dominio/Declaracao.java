package calculadora.dominio;

public class Declaracao {
    private double desconto;

    public Declaracao(double desconto) {
        setDesconto(desconto);
    }

    private void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double desconto() {
        return (double) this.desconto;
    }
}