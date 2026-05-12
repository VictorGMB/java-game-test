package domain.entidades.core.exceptions;

public class HabilidadeException extends RuntimeException {

    private HabilidadeException(String s) {
        super(s);
    }

    public static class HabilidadeNula extends HabilidadeException {
        public HabilidadeNula() {
            super("Habilidade não pode ser nula");
        }
    }
}
