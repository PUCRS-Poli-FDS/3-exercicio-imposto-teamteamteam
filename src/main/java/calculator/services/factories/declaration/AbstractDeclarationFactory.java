package calculator.services.factories.declaration;

import calculator.domain.SimpleDeclaration;
import calculator.domain.CompleteDeclaration;

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