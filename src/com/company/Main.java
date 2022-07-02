package com.company;

public class Main {
    public static void main(String[] args) {
        TeniskiTurnir turnir = new TeniskiTurnir();
        Ekipa ekipaNovak = new Ekipa();
        Ekipa ekipaNadal = new Ekipa();
        Osoba teniser1 = new Teniser("Novak Djokovic", turnir, 5000, 10000, 1, ekipaNovak);
        Osoba teniser2 = new Teniser("Rafael Nadal", turnir,5000, 9500, 2, ekipaNadal);

        Osoba trener1 = new Trener("Trenercina 1", turnir, 400, (Teniser)teniser1, ekipaNovak);
        Osoba trener2 = new Trener("Trenercina 2", turnir, 400, (Teniser)teniser2, ekipaNadal);
        Osoba maser1 = new Maser("Maser1", turnir, 100,(Teniser)teniser1, ekipaNovak);
        Osoba maser2 = new Maser("Maser1", turnir, 100,(Teniser)teniser2, ekipaNadal);

        Osoba sudija1 = new Sudija("Dzon Smit", turnir, 500);
        Osoba sponzor1 = new Sponzor("Sponzor 1", turnir, 2000000);

        Osoba posmatrac1 = new Posmatrac("Petar", turnir, (Teniser)teniser1);
        Osoba posmatrac2 = new Posmatrac("Dzon", turnir, (Teniser)teniser1);
        Osoba posmatrac3 = new Posmatrac("Mauricio", turnir, (Teniser)teniser1);
        Osoba posmatrac4 = new Posmatrac("Mario", turnir, (Teniser)teniser2);
        Osoba posmatrac5 = new Posmatrac("Jelena", turnir, (Teniser)teniser2);
        Osoba posmatrac6 = new Posmatrac("Marija", turnir, (Teniser)teniser2);


        System.out.println(turnir);

    }
}