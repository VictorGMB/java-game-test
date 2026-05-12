package domain.entidades.core.exceptions;

public class ConjuntoHabilidadesException extends RuntimeException {
    private ConjuntoHabilidadesException(String s) {
        super(s);
    }

    public static class QuantidadeInvalida extends ConjuntoHabilidadesException {
        public QuantidadeInvalida(int n) {
            super("Quantidade " + n + " é inválida para o conjunto de habilidades.");
        }
    }

    public static class IndiceInvalido extends ConjuntoHabilidadesException {
        public IndiceInvalido(int n) {
            super("Indice " + n + " é inválido.");
        }
    }

    public static class SemEspacoDisponivel extends ConjuntoHabilidadesException {
        public SemEspacoDisponivel() {
            super("Não há espaços disponíveis para adicionar uma nova habilidade.");
        }
    }
}
