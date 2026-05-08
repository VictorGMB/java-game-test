package domain.entidades.core.valueobjects;

import domain.entidades.core.exceptions.HabilidadeException;
import domain.entidades.core.interfaces.Habilidade;
import utils.Validador;

public class ConjuntoHabilidades {
    
    private final Habilidade[] espaco;

    public ConjuntoHabilidades(int quantidade) {
        this.espaco = new Habilidade[quantidade];
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        for (int i = 0; i < espaco.length; i++) {
            if (estaLivre(i)) {
                this.espaco[i] = Validador.naoNuloOuVazio(habilidade, () -> new HabilidadeException.HabilidadeNula());
                return;
            }
        }
    }

    public void substituirHabilidade(Habilidade habilidade, int posicao) {
        this.espaco[posicao] = Validador.naoNuloOuVazio(habilidade, () -> new HabilidadeException.HabilidadeNula());
    }

    private boolean estaLivre(int posicao) {
        return this.espaco[posicao] == null;
    }

}
