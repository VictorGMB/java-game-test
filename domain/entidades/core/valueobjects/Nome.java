package domain.entidades.core.valueobjects;

import domain.entidades.core.exceptions.NomeException;
import utils.Validador;

public class Nome {
    
    private String nome;

    public Nome(String nome) {
        String s = Validador.naoNuloOuVazio(nome, () -> new NomeException.NomeInvalido());
        this.nome = s.toUpperCase();
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
