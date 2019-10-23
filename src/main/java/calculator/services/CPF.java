package calculator.services;

import java.util.InputMismatchException;

public final class CPF {
    
    public static boolean isValid(String code) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (code.equals("00000000000") ||
        code.equals("11111111111") ||
        code.equals("22222222222") || code.equals("33333333333") ||
            code.equals("44444444444") || code.equals("55555555555") ||
            code.equals("66666666666") || code.equals("77777777777") ||
            code.equals("88888888888") || code.equals("99999999999") ||
            (code.length() != 11))
            return(false);
        
            char dig10, dig11;
        int sm, i, r, num, peso;
        
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
        sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0         
        // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(code.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
            
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
                else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
        
                // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(code.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }
        
        r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
            dig11 = '0';
            else dig11 = (char)(r + 48);
        
            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == code.charAt(9)) && (dig11 == code.charAt(10)))
                return(true);
                else 
                return(false);
        }
        catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public static String generate() {
        return "03005182002";
    }

    public static String print(String code) {
        return(code.substring(0, 3) + "." + code.substring(3, 6) + "." +
        code.substring(6, 9) + "-" + code.substring(9, 11));
    }
}