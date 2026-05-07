package domain.entidades.core.valueobjects;

import domain.entidades.core.exceptions.DescricaoException;
import utils.Validador;

public class Descricao {
    
    private final String texto;

    public Descricao(String texto) {
        this.texto = Validador.naoNuloOuVazio(texto, () -> new DescricaoException.TextoInvalido());
    }

    public String getTexto() {
        return this.texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
