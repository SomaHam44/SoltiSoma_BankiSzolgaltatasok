package com.company.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private static double kamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, int aktualisEgyenleg, double kamat) {
        super(tulajdonos, aktualisEgyenleg);
        this.kamat = kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.getAktualisEgyenleg() >= 0) {
            return true;
        }
        return false;
    }

    public void kamatJovaIras() {

    }
}
