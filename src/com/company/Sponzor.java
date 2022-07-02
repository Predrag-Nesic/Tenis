package com.company;

public class Sponzor extends Osoba {
    private int sponzorstvo;

    public Sponzor(String ime, TeniskiTurnir turnir, int sponzorstvo) {
        super(ime, turnir);
        this.sponzorstvo = sponzorstvo;
    }

    public int getSponzorstvo() {
        return sponzorstvo;
    }

    public void setSponzorstvo(int sponzorstvo) {
        this.sponzorstvo = sponzorstvo;
    }

    @Override
    protected String predstaviSe() {
        return "Sponzor";
    }

    @Override
    public String toString() {
        return predstaviSe() + " { " + getIme() + ", sponzorstvo = " + getSponzorstvo() + " }";
    }
}
