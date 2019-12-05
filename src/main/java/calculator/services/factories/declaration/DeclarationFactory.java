package calculator.services.factories.declaration;

import calculator.domain.SimpleDeclaration;
import calculator.domain.CompleteDeclaration;

public class DeclarationFactory implements AbstractDeclarationFactory{

    /**
     * Create a new simple declaration
     */
    @Override
    public SimpleDeclaration createSimple() {
        return new SimpleDeclaration(0.05);
    }

    /**
     * Create a new complete declaration
     */
    @Override
    public CompleteDeclaration createComplete() {
        return new CompleteDeclaration(0.1);
    }
}