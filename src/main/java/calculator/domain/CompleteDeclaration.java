package calculator.domain;

public class CompleteDeclaration implements Declaration {
    private double deduction;

    public CompleteDeclaration(double deduction) {
        setDeduction(deduction);
    }

    private void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double deduction() {
        return (double) this.deduction;
    }
}