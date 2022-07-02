package com.company;

public abstract class Osoba {
    protected String ime;
    protected TeniskiTurnir turnir;

    public Osoba(String ime, TeniskiTurnir turnir) {
        this.ime = ime;
        turnir.dodaj(this);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    protected abstract String predstaviSe();

    @Override
    public String toString() {
        return ime;
    }
}
