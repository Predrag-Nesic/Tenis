package com.company;

public class Sudija extends Ucesnik {

    public Sudija(String ime, TeniskiTurnir turnir, int zarada) {
        super(ime, turnir, zarada);
    }

    @Override
    protected String predstaviSe() {
       return "Sudija ";
    }

    @Override
    public String toString() {
        return predstaviSe() + "{ " + super.getIme() + ", zarada = " + getZarada() + " }";
    }
}
