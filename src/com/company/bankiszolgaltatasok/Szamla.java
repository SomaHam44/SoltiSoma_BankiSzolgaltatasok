package com.company.bankiszolgaltatasok;

public abstract class Szamla extends BankiSzolgaltatas  {
    private int aktualisEgyenleg;


    public Szamla(Tulajdonos tulajdonos, int aktualisEgyenleg) {
        super(tulajdonos);
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    private void setAktualisEgyenleg(int aktualisEgyenleg) {
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public void befizet(int osszeg) {
        this.aktualisEgyenleg += osszeg;
    }

    public abstract boolean kivesz(int osszeg);
}
