package domain.entidades.core.valueobjects;

import domain.entidades.core.enums.TipoDano;
import domain.entidades.core.exceptions.HabilidadeDanoException;
import domain.entidades.core.interfaces.Habilidade;
import utils.Validador;

public class HabilidadeDano implements Habilidade {

    private final Nome nome;
    private final TipoDano tipo;
    private final int danoBase;
    private final Descricao descricao;

    public HabilidadeDano(String nome, TipoDano tipo, int danoBase, String descricao) {
        this.nome = new Nome(nome);
        this.descricao = new Descricao(descricao);
        this.tipo = Validador.naoNuloOuVazio(tipo,() -> new HabilidadeDanoException.TipoInvalido());

        if (danoBase <= 0) {
            throw new HabilidadeDanoException.DanoBaseInvalido(danoBase);
        }
        this.danoBase = danoBase;
    }

    public Nome getNome() {
        return this.nome;
    }

    public TipoDano getTipo() {
        return this.tipo;
    }

    public int getDanoBase() {
        return this.danoBase;
    }

    public Descricao getDescricao() {
        return this.descricao;
    }
}
