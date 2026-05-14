package domain.entidades.core.valueobjects;

import domain.entidades.core.exceptions.NivelException;

public class Nivel {

    private static final int XP_BASE = 100;
    private static final int INCREMENTO_BASE = 50;
    
    private int nivel;
    private int xpAtual;
    private int xpProximoNivel;
    private final float multiplicador;

    public Nivel(int nivel, int xpAtual, float multiplicador) {
        if (nivel < 1) throw new NivelException.NivelInvalido(nivel);
        if (xpAtual < 0) throw new NivelException.XpInvalido(xpAtual);
        this.nivel = nivel;
        this.xpAtual = xpAtual;
        this.multiplicador = multiplicador;
        this.xpProximoNivel = this.calcularXpProximoNivel();
    }

    public void ganharXp(int valor) {
        int xp = valor + this.xpAtual;
        while (xp >= this.xpProximoNivel) {
            xp = xp - this.xpProximoNivel;
            this.SubirNivel();
            this.xpProximoNivel = this.calcularXpProximoNivel();
        }
        this.xpAtual = xp;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getXpAtual() {
        return this.xpAtual;
    }

    public int getXpProximoNivel() {
        return this.xpProximoNivel;
    }

    public float getMultiplicador() {
        return this.multiplicador;
    }

    private void SubirNivel() {
        this.nivel++;
    }

    private int calcularXpProximoNivel() {
        return XP_BASE + (int)(INCREMENTO_BASE * this.multiplicador) * (this.nivel - 1);
    } 
}
