package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Osoba> osoby = new ArrayList<>();

        String imieOs3 = "";
        int wiekOs3 = 0;
        int nrTelOs3=0;
        String zwierzeOs3="";

        Osoba os1=new Osoba("Szymon",22,123456789,"Kot");
        Osoba os2=new Osoba("Wiesiek",63,123456789,"Pies");


        Scanner scanner =new Scanner(System.in);


        System.out.println("Podaj swoje imie");
        imieOs3=scanner.nextLine();
        System.out.println("Podaj wiek");
        wiekOs3=scanner.nextInt();
        System.out.println("Podaj nr Tel");
        nrTelOs3=scanner.nextInt();
        System.out.println("Jakie masz zwierze");
        zwierzeOs3=scanner.next();

        Osoba os3=new Osoba(imieOs3,wiekOs3,nrTelOs3,zwierzeOs3);

        osoby.add(os1);
        osoby.add(os2);
        osoby.add(os3);



        if (osoby != null) {

            for(int i=0;i< osoby.size();i++){
                var os= osoby.get(i);
                System.out.println(os.PrzedstawSie());
            }
        }



    }
}