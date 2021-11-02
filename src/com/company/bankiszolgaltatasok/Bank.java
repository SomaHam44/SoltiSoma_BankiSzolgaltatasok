package com.company.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Szamla> szamlaLista;
    private Scanner sc = new Scanner(System.in);

    public Bank(int elemszam) {
        szamlaLista = new ArrayList<>(elemszam);

    }

    public List<Szamla> getSzamlaLista() {
        return szamlaLista;
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelkeret) {
        if (hitelkeret >= 0) {
            MegtakaritasiSzamla megtakaritasiszamla = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(megtakaritasiszamla);
            return megtakaritasiszamla;
        }
            HitelSzamla hitelszamla = new HitelSzamla(tulajdonos, hitelkeret);
            szamlaLista.add(hitelszamla);
            return hitelszamla;


    }

    public int getOsszEgyenleg(Tulajdonos tulajdonos) {
        int osszeg = 0;
        for (Szamla szamlak: szamlaLista) {
            if (szamlak.getTulajdonos() == tulajdonos) {
                osszeg += szamlak.getAktualisEgyenleg();

            }
        }
        return osszeg;

    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        int legnagyobb = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getTulajdonos() == tulajdonos) {
                if (szamlaLista.get(i).getAktualisEgyenleg() > szamlaLista.get(legnagyobb).getAktualisEgyenleg()) {
                    legnagyobb = i;
                }
            }

        }

        return szamlaLista.get(legnagyobb);


    }

    public long getOsszhitelkeret() {
        long osszesKeret = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i) instanceof HitelSzamla) {
                osszesKeret += ((HitelSzamla) szamlaLista.get(i)).getHitelKeret();
            }

        }
        return osszesKeret;

    }


}
