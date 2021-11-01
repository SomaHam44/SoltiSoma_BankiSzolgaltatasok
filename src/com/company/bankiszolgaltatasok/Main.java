package com.company.bankiszolgaltatasok;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t1 = new Tulajdonos("Ő");
        Tulajdonos t2 = new Tulajdonos("Te");
        Bank b1 = new Bank();
        List<Szamla> szamlaLista = b1.getSzamlaLista();
        for (Szamla szamla: szamlaLista) {
            int egyenleg = szamla.getAktualisEgyenleg();
            egyenleg += 126000;
        }
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t1, 200000);
        b1.szamlaNyitas(t2, 200040);
        System.out.println(b1.getOsszEgyenleg(t1));
        b1.getLegnagyobbEgyenleguSzamla(t1);
        b1.getOsszhitelkeret();





    }
}
