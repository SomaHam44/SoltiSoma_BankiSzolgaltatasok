package com.company.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private static double kamat;
    public double alapKamat() {
        return this.kamat;
    }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);

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
        int egyenleg  = this.getAktualisEgyenleg();
        double kamatjovairtOsszeg = this.getAktualisEgyenleg() + this.kamat;


    }
}
