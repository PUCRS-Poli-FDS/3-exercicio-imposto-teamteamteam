package calculator.domain;

public class SimpleDeclaration implements Declaration {
    private double deduction;

    public SimpleDeclaration(double deduction) {
        setDeduction(deduction);
    }

    private void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double deduction() {
        return (double) this.deduction;
    }
}