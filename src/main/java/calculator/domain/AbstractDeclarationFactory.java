package calculator.domain;

public interface AbstractDeclarationFactory {

    /**
     * Create a new simple declaration
     */
    public SimpleDeclaration createSimple();

    /**
     * Create a new complete declaration
     */
    public CompleteDeclaration createComplete();
}