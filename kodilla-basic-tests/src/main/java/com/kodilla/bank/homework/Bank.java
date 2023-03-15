package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] listCashMashin;                           //tablica bankomatow

    public Bank(CashMachine[] cashMachines) {
        listCashMashin = cashMachines;

    }

    public double sumOfCashFromMachines() {                      // całkowite saldo z bankomatow
        int numberOfMAchine = listCashMashin.length;
        int sum = 0;
        for (int i = 0; i < numberOfMAchine; i++) {
            CashMachine cashMachines = listCashMashin[i];
            int balance = cashMachines.balance();
            sum += balance;
        }
        return sum;
    }

    public int sumAllTransPayment() {                           // ilosc wszytskich wpłat
        int numberOfMAchine = listCashMashin.length;
        int sum = 0;
        for (int i = 0; i < numberOfMAchine; i++) {
            CashMachine cashMachines = listCashMashin[i];
            int numberPayment = cashMachines.getSizePayment();
            sum += numberPayment;
        }

        return sum;

    }

    public int sumAllTransPaychack() {                           // ilosc wszytskich wypłat
        int numberOfMAchine = listCashMashin.length;
        int sum = 0;
        for (int i = 0; i < numberOfMAchine; i++) {
            CashMachine cashMachines = listCashMashin[i];
            int numberPaychack = cashMachines.getSizePaycheck();
            sum += numberPaychack;
        }
        return sum;
    }

    public double allAveragePaychack() {                // średnia wartość wyplat transakcji ze wszystkich
        int length = listCashMashin.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            CashMachine cashMachines = listCashMashin[i];
            double sumPaychack = cashMachines.getBalancePaychack();
            sum += sumPaychack;
        }
        return sum / sumAllTransPaychack();
    }

    public double allAveragePayment() {              // średnia wartość wplat transakcji ze wszystkich

        int length = listCashMashin.length;
        double sum = 0;
        for (int i = 0; i < length; i++) {
            CashMachine cashMachines = listCashMashin[i];
            double sumPayment = cashMachines.getBalancePayment();
            sum += sumPayment;
        }
        return sum / sumAllTransPayment();
    }
}






