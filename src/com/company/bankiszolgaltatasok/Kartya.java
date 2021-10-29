package com.company.bankiszolgaltatasok;

public class Kartya extends BankiSzolgaltatas{
    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas (int osszeg) {
        if (this.szamla.getAktualisEgyenleg() > 0) {
            int egyenleg = this.szamla.getAktualisEgyenleg();
            egyenleg -= osszeg;
            return true;
        }
        return false;
    }
}
