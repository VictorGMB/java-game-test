package domain.entidades.core;

import java.util.EnumMap;
import java.util.Map;

import domain.entidades.core.enums.TipoDefesa;
import domain.entidades.core.interfaces.Habilidade;
import domain.entidades.core.valueobjects.Defesa;
import domain.entidades.core.valueobjects.Descricao;
import domain.entidades.core.valueobjects.Nome;
import domain.entidades.core.valueobjects.Vida;

public class EntidadeBase {

    private Nome nome;
    private Descricao descricao;
    private Vida vida;
    private final Map<TipoDefesa, Defesa> defesas;
    private final Habilidade[] slots = new Habilidade[4];

    public EntidadeBase(String nome, String descricao, int vida) {
        this.nome = new Nome(nome);
        this.vida = new Vida(vida);
        this.defesas = new EnumMap<>(TipoDefesa.class);
    }

}
