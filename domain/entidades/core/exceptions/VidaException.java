package domain.entidades.core.exceptions;

public class VidaException extends RuntimeException {
    
    private VidaException(String s) {
        super(s);
    }

    public static class ValorInvalido extends VidaException {
        public ValorInvalido(String s, int n) {
            super("Valor " + n + " para " + s + " é inválido.");
        }
    }
}
