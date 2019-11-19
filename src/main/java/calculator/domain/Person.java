package calculator.domain;

public abstract class Person {
    private String name;
    private String CPF;

    public Person(String name, String CPF) {
        setName(name);
        setCPF(CPF);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getName() {
        return this.name.toString();
    }

    public String getCPF() {
        return this.CPF.toString();
    }

    @Override
    public String toString() {
        return getName().toUpperCase()+" ("+getCPF()+")";
    }
}