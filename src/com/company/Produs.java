package com.company;

import java.util.ArrayList;

public class Produs {
    String nume;
    String nume_vechi; // pentru produsele cu nume schimbat
    int pret;
    ArrayList<String> caracteristiciSpeciale;

    public Produs(String nume, int pret, ArrayList<String> caracteristiciSpeciale) {
        this.nume = nume;
        this.pret = pret;
        this.caracteristiciSpeciale = caracteristiciSpeciale;
    }

    public Produs(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
        caracteristiciSpeciale = new ArrayList<>();
    }

    public Produs() {
        pret = -1;
        caracteristiciSpeciale = new ArrayList<>();
    }

    public void setNume_vechi(String nume_vechi) {
        this.nume_vechi = nume_vechi;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public ArrayList<String> getCaracteristiciSpeciale() {
        return caracteristiciSpeciale;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
