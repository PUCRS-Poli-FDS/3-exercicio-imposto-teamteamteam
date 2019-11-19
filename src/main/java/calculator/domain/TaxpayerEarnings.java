package calculator.domain;

import java.util.ArrayList;

public class TaxpayerEarnings {
    // >>> Define all private variables

    private int year;

    private double anualIncome;
    private double anualSocialSecurityContribution;

    private ArrayList<Paycheck> paychecks;



    // >>> Defines the constructor

    /**
     * Stores the taxpayer earnings;
     * @param year defines the year in which the object will store the taxpayer earnings.
     */
    public TaxpayerEarnings(int year) {
        setEarningsYear(year);
    }



    // >>> Define all public methods for this class

    /**
     * @return The year in which this taxpayer earnings history refers to.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Iterates through the paychecks array and adds up the earnings from each month, then sets the
     * anualIncome variable with this sum.
     */
    public void setAnualIncome() {
        sumAllPaychecksIncome();
    }

    /**
     * @return The value for all taxpayer income in the set year.
     */
    public double getAnualIncome() {
        return this.anualIncome;
    }

    /**
     * Iterates through the paychecks array and adds up the social security contribution from each 
     * month, then sets the anualSocialSecurityContribution variable with this sum.
     */
    public void setAnualSocialSecurityContribution() {
        sumAllSocialSecurityContribution();
    }

    /**
     * @return The value for all social security contribution in the set year.
     */
    public double getAnualSocialSecurityContribution() {
        return this.anualSocialSecurityContribution;
    }

    /**
     * 
     * @param month The month in which you want to get the taxpayer income from.
     * @return Income for this month.
     */
    public double getPaycheckIncome(int month) {
        Paycheck paycheck = paychecks.get(month);
        double income = paycheck.getIncome();
        return income;
    }

    /**
     * 
     * @param month The month in which you want to get the taxpayer social security contribution from.
     * @return Social security contribution for this month.
     */
    public double getSocialSecurityContribution(int month) {
        Paycheck paycheck = paychecks.get(month);
        double contribution = paycheck.getSocialSecurityContribution();
        return contribution;
    }



    // >>> Define all private methods for this class

    /**
     * Defines the year in which the object will store the taxpayer earnings.
     * @param year 
     */
    private void setEarningsYear(int year) {
        this.year = year;
    }

    /**
     * Iterates through the paychecks array and adds up the earnings from each month, then sets the
     * anualIncome variable with this sum.
     */
    private void sumAllPaychecksIncome(){
        for(Paycheck paycheck: paychecks) {
            int month = paycheck.getMonth();
            double monthIncome = getPaycheckIncome(month);
            this.anualIncome += monthIncome;
        }
    }

    /**
     * Iterates through the paychecks array and adds up the social security contribution from each 
     * month, then sets the anualSocialSecurityContribution variable with this sum.
     */
    private void sumAllSocialSecurityContribution() {
        for(Paycheck paycheck: paychecks) {
            int month = paycheck.getMonth();
            double monthSocialSecurityContribution = getSocialSecurityContribution(month);
            this.anualSocialSecurityContribution += monthSocialSecurityContribution;
        }
    }
}