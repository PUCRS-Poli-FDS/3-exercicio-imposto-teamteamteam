package calculator.domain;

public class Declaration {
    private double deduction;

    public Declaration(double deduction) {
        setDeduction(deduction);
    }

    private void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double deduction() {
        return (double) this.deduction;
    }
}