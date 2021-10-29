package com.company.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Szamla> szamlaLista;
    private Scanner sc = new Scanner(System.in);

    public Bank() {
        System.out.println("Kérek egy maximális elemszámot: ");
        int elemszam = Integer.parseInt(sc.nextLine());
        szamlaLista = new ArrayList<>(elemszam);

    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelkeret) {
        if (hitelkeret >= ) {
            return new MegtakaritasiSzamla(tulajdonos, hitelkeret,)
        }

    }
}
