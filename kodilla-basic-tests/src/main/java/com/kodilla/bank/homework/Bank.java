package com.kodilla.bank.homework;

public class Bank {

    private int size;
    //private Bank[] listCashMashin;

    public Bank() {

        // this.listCashMashin = new Bank[0];
        Bank cashMachineJawor = new Bank();
        Bank cashMAshineLegnica = new Bank();
        Bank cashMAshineWroclaw = new Bank();

        Bank[] listCashMashin = {cashMachineJawor, cashMAshineLegnica, cashMAshineWroclaw};
    }

 }
