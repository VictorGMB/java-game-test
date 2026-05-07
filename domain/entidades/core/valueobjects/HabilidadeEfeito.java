package domain.entidades.core.valueobjects;

import domain.entidades.core.enums.TipoEfeito;
import domain.entidades.core.exceptions.HabilidadeEfeitoException;
import domain.entidades.core.interfaces.Habilidade;
import utils.Validador;

public class HabilidadeEfeito implements Habilidade {
    
    private final Nome nome;
    private final Descricao descricao;
    private final TipoEfeito tipo;
    private final int intensidade;

    public HabilidadeEfeito(String nome, String descricao, TipoEfeito tipo, int intensidade) {
        this.nome = new Nome(nome);
        this.descricao = new Descricao(descricao);
        this.tipo = Validador.naoNuloOuVazio(tipo, () -> new HabilidadeEfeitoException.TipoEfeitoInvalido());

        if (intensidade <= 0 ){
            throw new HabilidadeEfeitoException.IntensidadeInvalida(intensidade);
        }
        this.intensidade = intensidade;
    }

    public Nome getNome() {
        return this.nome;
    }

    public Descricao getDescricao() {
        return this.descricao;
    }

    public TipoEfeito getTipo() {
        return this.tipo;
    }

    public int getIntensidade() {
        return this.intensidade;
    }
}
