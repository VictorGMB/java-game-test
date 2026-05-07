package domain.entidades.core.valueobjects;

import domain.entidades.core.enums.TipoDefesa;
import domain.entidades.core.exceptions.DefesaException;
import utils.Validador;

public class Defesa {
    
    private final TipoDefesa tipo;
    private final int resistencia;

    public Defesa(TipoDefesa tipo, int resistencia) {
        this.tipo = Validador.naoNuloOuVazio(tipo, () -> new DefesaException.TipoDefesaInvalida());
        if (resistencia < 0) {
            throw new DefesaException.ResistenciaInvalida(resistencia);
        }
        this.resistencia = resistencia;
    }

    public TipoDefesa getTipo() {
        return this.tipo;
    }

    public int getResistencia() {
        return this.resistencia;
    }
}
