package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ekipa {
    private Ucesnik ucesnik;
    private List<Ucesnik> ekipa = new ArrayList<>();

    public void dodaj(Ucesnik ucesnik) {
        ekipa.add(ucesnik);
    }

    @Override
    public String toString() {
        String s = "";
        for(Ucesnik u : ekipa) {
            s += u.toString() + "\n";
        }
        return s;
    }
}
