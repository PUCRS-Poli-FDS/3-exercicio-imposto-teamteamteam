package calculadora.dominio;

public final class DeclaracaoSimples {
    private final double DESCONTO = 0.05;
    private Declaracao declaracao = new Declaracao(DESCONTO);
    private PessoaFisica pessoa;

    public DeclaracaoSimples(Pessoa pessoa, HistoricoAnualRendimentosPessoaFisica harpf) {
        
    }
}