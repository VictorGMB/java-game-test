package domain.entidades.core.exceptions;

public class HabilidadeDanoException extends RuntimeException {
    
    private HabilidadeDanoException(String s) {
        super(s);
    }

    public static class DanoBaseInvalido extends HabilidadeDanoException {
        public DanoBaseInvalido(int s) {
            super("Valor inválido para dano base: " + s);
        }
    }

    public static class TipoInvalido extends HabilidadeDanoException {
        public TipoInvalido() {
            super("Tipo não pode ser nulo ou vazio.");
        }
    }
}
