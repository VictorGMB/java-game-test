package domain.entidades.core.exceptions;

public class EntidadeException extends RuntimeException {
    private EntidadeException(String s) {
        super(s);
    }
}
