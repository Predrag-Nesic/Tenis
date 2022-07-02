package com.company;

public abstract class Ucesnik extends Osoba {
    protected int zarada;

    public Ucesnik(String ime, TeniskiTurnir turnir, int zarada) {
        super(ime, turnir);
        this.zarada = zarada;
    }

    public int getZarada() {
        return zarada;
    }

    public void setZarada(int zarada) {
        this.zarada = zarada;
    }

    @Override
    protected abstract String predstaviSe();
}
