package com.company.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private  int hitelKeret;
    public HitelSzamla(Tulajdonos tulajdonos, int aktualisEgyenleg, int hitelKeret) {
        super(tulajdonos, aktualisEgyenleg);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    private void setHitelKeret(int hitelKeret) {
        this.hitelKeret = hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.hitelKeret >= osszeg) {
            return true;
        }
        return false;
    }
}
