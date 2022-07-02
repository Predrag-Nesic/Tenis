package com.company;

import java.util.ArrayList;
import java.util.List;

public class TeniskiTurnir {
    private Osoba osoba;
    private List<Osoba> turnir = new ArrayList<>();

    public void dodaj(Osoba osoba) {
        turnir.add(osoba);
    }

    @Override
    public String toString() {
        String s = "";
        for(Osoba o : turnir) {
            s += o.toString() + "\n";
        }
        return s;
    }
}
