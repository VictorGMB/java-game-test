package domain.entidades.core.exceptions;

public class NomeException extends RuntimeException {

    private NomeException(String s) {
        super(s);
    }
    
    public static class NomeInvalido extends NomeException {
        public NomeInvalido() {
            super("Nome não pode ser nulo ou vazio");
        }
    }
}
