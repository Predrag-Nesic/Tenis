package com.company;

public class Teniser extends Ucesnik {
    private int atpPoeni;
    private int atpPozicija;
    private Ekipa ekipa;

    public Teniser(String ime, TeniskiTurnir turnir, int zarada, int atpPoeni, int atpPozicija, Ekipa ekipa) {
        super(ime, turnir, zarada);
        this.atpPoeni = atpPoeni;
        this.atpPozicija = atpPozicija;
        this.ekipa = ekipa;
    }

    @Override
    protected String predstaviSe() {
        return "Teniser ";
    }

    @Override
    public String toString() {
        return predstaviSe() + "{ " + getIme() + ", atp poeni = " + atpPoeni + ", " +
                "atp pozicija = " + atpPozicija + ", zarada + " + getZarada() + ", ekipa: \n" + ekipa.toString() + " }";

    }
}
