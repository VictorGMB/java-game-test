package domain.entidades.core.exceptions;

public class VidaException extends RuntimeException {
    
    private VidaException(String s) {
        super(s);
    }

    public static class ValorInvalido extends VidaException {
        public ValorInvalido() {
            super("Valor de vida não pode ser menor que 1");
        }
    }
}
