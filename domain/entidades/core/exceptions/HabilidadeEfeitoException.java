package domain.entidades.core.exceptions;

public class HabilidadeEfeitoException extends RuntimeException {

    private HabilidadeEfeitoException(String s) {
        super(s);
    }

    public static class IntensidadeInvalida extends HabilidadeEfeitoException {
        public IntensidadeInvalida(int intensidade) {
            super("Valor inválido de intensidade:" + intensidade);
        }
    }

    public static class TipoEfeitoInvalido extends HabilidadeEfeitoException {
        public TipoEfeitoInvalido() {
            super("Tipo inválido para habilidade de efeito");
        }
    }
}
