package com.company;

import java.util.ArrayList;

public class Magazin {
    public String nume;
    public ArrayList<String> adresa;


    private ArrayList<Angajati> angajati;
    private ArrayList<Produs> produse;

    public Magazin(String nume, ArrayList<Angajati> angajati, ArrayList<Produs> produse, ArrayList<String> adresa) {
        this.nume = nume;
        this.angajati = angajati;
        this.produse = produse;
        this.adresa = adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
