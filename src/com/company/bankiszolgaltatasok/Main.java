package com.company.bankiszolgaltatasok;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java - Banki szolgáltatások projekt\n");

        System.out.println("Tulajdonos osztály függvényeinek tesztelése: ");

        Tulajdonos t1 = new Tulajdonos("Felhasználó");
        Tulajdonos t2 = new Tulajdonos("Játékos");
        Tulajdonos t3 = new Tulajdonos("Harmadik");
        Tulajdonos t4 = new Tulajdonos("Valaki");
        Tulajdonos t5 = new Tulajdonos("Talán");

        System.out.println("Első tulajdonos példány neve: " + t1.getNev());
        t1.setNev("Mangó");
        System.out.println("Első tulajdonos példány neve módosítás után: " + t1.getNev());
        System.out.println("Második tulajdonos példány neve : " + t2.getNev() + "\n");

        System.out.println("Hitelszámla osztály tesztelése :");

        HitelSzamla h1 = new HitelSzamla(t1,250000);
        HitelSzamla h2 = new HitelSzamla(t2,250000);
        HitelSzamla h3 = new HitelSzamla(t1,250000);

        System.out.println("Első hitel számla hitelkerete : " + h1.getHitelKeret());
        h1.befizet(2300);
        System.out.println("Első hitel számlának aktuális egyenlege: " + h1.getAktualisEgyenleg());
        System.out.println("Első hitel számlának kivesz metódusának visszatérési értéke : " + h1.kivesz(240));
        System.out.println("Első hitel számlának aktuális egyenlege: " + h1.getAktualisEgyenleg());

        h2.befizet(240000);
        System.out.println("Második hitel számlának aktuális egyenlege: " + h2.getAktualisEgyenleg());
        System.out.println("Második hitel számlának kivesz metódusának visszatérési értéke : " + h2.kivesz(2500000) + "\n");

         System.out.println("Megtakaritási számla osztály tesztelése :");

        MegtakaritasiSzamla m1 = new MegtakaritasiSzamla(t2);
        MegtakaritasiSzamla m2 = new MegtakaritasiSzamla(t1);
        MegtakaritasiSzamla m3 = new MegtakaritasiSzamla(t3);

        System.out.println("Második megtakaritási számlának alap kamata: " + m2.alapKamat());
        m1.befizet(400);
        m1.kamatJovaIras();
        System.out.println("Első megtakaritási számlának kamata a módosítás előtt:  " + m1.getKamat());
        m1.setKamat(430);
        System.out.println("Első megtakaritási számlának kamata a mődosítás után: " + m1.getKamat());

        Bank b1 = new Bank(6);

        List<Szamla> szamlaLista = b1.getSzamlaLista();

        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t2, 200040);
        b1.szamlaNyitas(t3, 200540);
        b1.szamlaNyitas(t2, 200540);
        b1.szamlaNyitas(t4, 200540);




        for (Szamla szamla: szamlaLista) {
            szamla.befizet(500);
            System.out.println("Kivesz:  " + szamla.kivesz(290));
        }


        szamlaLista.add(h1);
        szamlaLista.add(h2);
        szamlaLista.add(h3);



        szamlaLista.add(m1);
        szamlaLista.add(m2);

        System.out.println(b1.getOsszhitelkeret());

        Kartya k1 = new Kartya(t1,h1,"11111");
        Kartya k2 = new Kartya(t1,h1,"2367");
        Kartya k3 = new Kartya(t2,h1,"234567");
        Kartya k4 = new Kartya(t1,h3,"1111");
        Kartya k5 = new Kartya(t2,m1,"6789");

        k5.vasarlas(255);
        k1.vasarlas(200000);

        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t2, 200040);
        System.out.println(b1.getOsszEgyenleg(t1));
        b1.getLegnagyobbEgyenleguSzamla(t1);
        b1.getOsszhitelkeret();





    }
}
