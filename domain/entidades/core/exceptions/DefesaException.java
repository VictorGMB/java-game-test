package domain.entidades.core.exceptions;

public class DefesaException extends RuntimeException {
    private DefesaException(String s) {
        super(s);
    }

    public static class ResistenciaInvalida extends DefesaException {
        public ResistenciaInvalida(int resistencia) {
            super("Valor inválido de resistência: " + resistencia);
        }
    }

    public static class TipoDefesaInvalida extends DefesaException {
        public TipoDefesaInvalida() {
            super("Tipo inválido de defesa.");
        }
    }
}
