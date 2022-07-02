package com.company;

public class Posmatrac extends Osoba {
    private Teniser omiljeni;

    public Posmatrac(String ime, TeniskiTurnir turnir, Teniser omiljeni) {
        super(ime, turnir);
        this.omiljeni = omiljeni;
    }

    @Override
    protected String predstaviSe() {
        return "Posmatrac ";
    }

    @Override
    public String toString() {
        return predstaviSe() + "{ " + super.toString() + ", omiljeni teniser = " + omiljeni.getIme() + " }";
    }
}
