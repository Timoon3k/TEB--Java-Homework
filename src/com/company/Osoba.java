package com.company;

public class Osoba implements Zwierze {
    public String
            imie,
            zwierze,
            przedstawSieValue;
    public int
            wiek,
            nrTel;


    public Osoba(String imie,int wiek,int nrTel,String zwierze){
        this.imie=imie;
        this.wiek=wiek;
        this.nrTel=nrTel;
        this.zwierze=zwierze;
        DajGlos();
    }

    public String PrzedstawSie(){
        return "Nazywam sie" +imie+" a "+przedstawSieValue;
    }

    @Override
    public String DajGlos() {
        przedstawSieValue="Moje zwierze to "+zwierze+" I robi "+JakieZwierze();
        return przedstawSieValue;
    }

    public String JakieZwierze(){
        switch (zwierze.toLowerCase()){
            case "pies":
                return "Hau!";
            case "kot":
                return "Miau";
            default:
                return "Błąd";

        }
    }
}