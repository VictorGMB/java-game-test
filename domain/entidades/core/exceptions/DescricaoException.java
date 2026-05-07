package domain.entidades.core.exceptions;

public class DescricaoException extends RuntimeException {
    private DescricaoException(String s) {
        super(s);
    }

    public static class TextoInvalido extends DescricaoException {
        public TextoInvalido() {
            super("Texto da descrição não poder estar vazio ou nulo.");
        }
    }
}
