package calculator.domain;

import java.util.ArrayList;

public class Taxpayer extends Person {
    // >>> Define all private variables
    private int birthYear;
    private ArrayList<Person> dependents;
    
    private TaxpayerEarnings earnings;



    // >>> Define all taxpayer constructors

    /**
     * Taxpayer person constructor
     * @param name Person's name
     * @param CPF Person's CPF
     */
    public Taxpayer(String name, String CPF) {
        super(name, CPF);
        setEarnings(new TaxpayerEarnings(0));
    }

    /**
     * Taxpayer person constructor
     * @param name Person's name
     * @param CPF Person's CPF
     * @param earnings Person's earnings history of a predefined year
     */
    public Taxpayer(String name, String CPF, TaxpayerEarnings earnings) {
        super(name, CPF);
        setEarnings(earnings);
    }

    /**
     * Taxpayer person constructor
     * @param name Person's name
     * @param CPF Person's CPF
     * @param birthYear Person's birth year
     * @param dependents Array of all person's dependens
     */
    public Taxpayer(String name, String CPF, int birthYear, ArrayList<Person> dependents) {
        super(name, CPF);
        setBirthYear(birthYear);
        setDependents(dependents);
    }

    /**
     * Taxpayer person constructor
     * @param name Person's name
     * @param CPF Person's CPF
     * @param birthYear Person's birth year
     * @param dependents Array of all person's dependens
     * @param earnings Person's earnings history of a predefined year
     */
    public Taxpayer(String name, String CPF, int birthYear, ArrayList<Person> dependents, TaxpayerEarnings earnings) {
        super(name, CPF);
        setBirthYear(birthYear);
        setDependents(dependents);
        setEarnings(earnings);
    }



    // >>> Define all public methos for this class

    /**
     * Sets the earnings history for this taxpayer
     * @param earnings The taxpayer earnings history of a predefined year
     */
    public void setEarnings(TaxpayerEarnings earnings) {
        this.earnings = earnings;
    }


    public int getBirthYear() {
        return this.birthYear;
    }

    /**
     * @param birthYear The taxpayer birth year
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public ArrayList<Person> getDependents() {
        return this.dependents;
    }

    /**
     * @param birthYear ArrayList with all the taxpayer's dependents
     */
    public void setDependents(ArrayList<Person> dependents) {
        this.dependents = dependents;
    }




    /**
     * @return The value for all income in a predefined year for this taxpayer.
     */
    public double getAnualIncome() {
        return this.earnings.getAnualIncome();
    }

    /**
     * @return The value for all social security contribution in a predefined year for this taxpayer.
     */
    public double getAnualSocialSecurityContribution() {
        return this.earnings.getAnualSocialSecurityContribution();
    }

    /**
     * @return Taxpayer 'name' and 'CPF'
     */
    @Override
    public String toString() {
        return getName().toUpperCase()+" ("+getCPF()+")";
    }
}