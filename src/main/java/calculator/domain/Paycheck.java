package calculator.domain;

public class Paycheck {
    private double income;
    private int month;
    private double socialSecurityContribution;

    public Paycheck (double income, int month) {
        
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }
    
    public double getSocialSecurityContribution() {
        return this.socialSecurityContribution;
    }

    public void setSocialSecurityContribution() {
        this.socialSecurityContribution =  0.1 * this.income;
    }

    @Override
    public String toString() {
        return "{" +
            " income:'R$" + getIncome() + "'" +
            ", month:'" + getMonth() + "'" +
            "}";
    }

}