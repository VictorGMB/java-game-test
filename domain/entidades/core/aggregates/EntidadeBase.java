package domain.entidades.core.aggregates;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;

import domain.entidades.core.enums.TipoDefesa;
import domain.entidades.core.valueobjects.ConjuntoHabilidades;
import domain.entidades.core.valueobjects.Defesa;
import domain.entidades.core.valueobjects.Descricao;
import domain.entidades.core.valueobjects.Nivel;
import domain.entidades.core.valueobjects.Nome;
import domain.entidades.core.valueobjects.Vida;

public class EntidadeBase {

    private final UUID uuid;
    private final Nome nome;
    private final Descricao descricao;
    private final Vida vida;
    private final Map<TipoDefesa, Defesa> defesas;
    private final ConjuntoHabilidades habilidades;
    private final Nivel nivel;

    public EntidadeBase(String nome, String descricao, int vida, int nivel, float multiplicadorXp) {
        this(UUID.randomUUID(), nome, descricao, vida, 0, 0, new ConjuntoHabilidades(4), nivel, 0, multiplicadorXp);
    }

    public EntidadeBase(
        UUID uuid,
        String nome,
        String descricao,
        int vida,
        int defesaFisica,
        int defesaMagica,
        ConjuntoHabilidades habilidades,
        int nivelAtual,
        int xpAtual,
        float multiplicadorXp
    ) {
        this.uuid = uuid;
        this.nome = new Nome(nome);
        this.descricao = new Descricao(descricao);
        this.vida = new Vida(vida);
        this.habilidades = habilidades;
        this.nivel = new Nivel(nivelAtual, xpAtual, multiplicadorXp);

        this.defesas = new EnumMap<>(TipoDefesa.class);
        this.defesas.put(TipoDefesa.FÍSICA, new Defesa(TipoDefesa.FÍSICA, defesaFisica));
        this.defesas.put(TipoDefesa.MÁGICA, new Defesa(TipoDefesa.MÁGICA, defesaMagica));
    }
}
