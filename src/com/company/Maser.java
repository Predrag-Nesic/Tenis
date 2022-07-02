package com.company;

public class Maser extends Ucesnik {
    private Teniser teniser;
    private Ekipa ekipa;

    public Maser(String ime, TeniskiTurnir turnir, int zarada, Teniser teniser, Ekipa ekipa) {
        super(ime, turnir, zarada);
        this.teniser = teniser;
        ekipa.dodaj(this);
    }

    @Override
    protected String predstaviSe() {
        return "Maser";
    }

    @Override
    public String toString() {
        return predstaviSe() + " { " + getIme() + ", zarada = " + getZarada() + " }";
    }
}
