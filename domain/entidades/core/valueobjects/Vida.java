package domain.entidades.core.valueobjects;

import domain.entidades.core.exceptions.VidaException;

public class Vida {  

    private int total;
    private int atual;

    public Vida(int total, int atual) {
        if (total <= 0) {
            throw new VidaException.ValorInvalido("Total", total);
        }
        if (atual < 0) {
            throw new VidaException.ValorInvalido("Atual", atual);
        }
        this.total = total;
        this.atual = atual;
    }

    public Vida(int total) {
        this(total, total);
    }

    public int getTotal() {
        return this.total;
    }

    public int getAtual() {
        return this.atual;
    }

    public void dano(int dano) {
        int novaVida = this.atual - dano;
        novaVida = novaVida < 0 ? 0 : novaVida;
        this.atualizaVidaAtual(novaVida);
    }

    public void cura(int cura) {
        int novaVida = this.atual + cura;
        novaVida = novaVida > total ? total : novaVida;
        this.atualizaVidaAtual(novaVida);
    }

    public boolean estaMorto() {
        return this.atual == 0;
    }

    public boolean estaComVidaCheia() {
        return this.atual == this.total;
    }

    private void atualizaVidaAtual(int novoAtual) {
        this.atual = novoAtual;
    }
}
