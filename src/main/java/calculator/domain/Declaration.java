package calculator.domain;

public class Declaration {
    private double desconto;

    public Declaration(double desconto) {
        setDesconto(desconto);
    }

    private void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double desconto() {
        return (double) this.desconto;
    }
}