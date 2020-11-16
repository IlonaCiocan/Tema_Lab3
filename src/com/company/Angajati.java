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

      public void changePhone(String nr_tel) {
        this.nr_tel=nr_tel;
    }
    public void changeContract(int durata_contract) {
        this.durata_contract=durata_contract;

    }
    public void changeSalary(int salariu) {
        this.salariu=salariu;
    }

  public String getInfo() {
        return "Angajatul " + this.nume +" "+  this.prenume + "are un salariu de " + this.salariu +
                "lei si o durata a contractului de " + this.durata_contract + " ani si poate fi contactat la numarul de telefon:" +
                this.nr_tel + ".";
    }

}
