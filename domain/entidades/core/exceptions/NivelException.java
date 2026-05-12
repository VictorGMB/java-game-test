package domain.entidades.core.exceptions;

public class NivelException extends RuntimeException {
    private NivelException(String s) {
        super(s);
    }

    public static class NivelInvalido extends NivelException {
        public NivelInvalido(int n) {
            super("Valor " + n + " é inválido para nível.");
        }
    }

    public static class XpInvalido extends NivelException {
        public XpInvalido(int n) {
            super("Valor " + n + " é inválido para xp.");
        }
    }
}
