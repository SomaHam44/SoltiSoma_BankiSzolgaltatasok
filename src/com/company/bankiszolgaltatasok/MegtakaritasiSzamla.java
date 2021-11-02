package com.company.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamat;

    public static double alapKamat() {
        double kamat = 10;
        return kamat;
    }

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat();

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
        double kamatjovairtOsszeg = this.getAktualisEgyenleg() + this.getKamat();
        System.out.println("A kamat jováírt összeg: " + kamatjovairtOsszeg);



    }
}
