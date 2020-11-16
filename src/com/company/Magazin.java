package com.company;

import java.util.ArrayList;

public class Magazin {
    public String nume;
    public String adresa;


    private ArrayList<Angajati> angajati;
    private ArrayList<Produs> produse;

    public Magazin(String nume, ArrayList<Angajati> angajati, ArrayList<Produs> produse, String adresa) {
        this.nume = nume;
        this.angajati = angajati;
        this.produse = produse;
        this.adresa = adresa;
    }
}
