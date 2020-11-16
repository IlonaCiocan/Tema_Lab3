import java.util.ArrayList;
import java.util.Collections;

public class Angajati {

    String nume;
    String prenume;
    String nr_tel;
    int durata_contract;
    int salariu;


    public Angajati(String nume, String prenume, String nr_tel, int durata_contract, int salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.nr_tel = nr_tel;
        this.durata_contract = durata_contract;
        this.salariu = salariu;
    }

    public void changeSurname(String nume) {
        this.nume = nume;

    }

    public void changeFirstName(String prenume) {
        this.prenume = prenume;

    }

    


}
