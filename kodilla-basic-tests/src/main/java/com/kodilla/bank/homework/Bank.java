package com.kodilla.bank.homework;

public class Bank {
    private int size;
    private CashMachine[] listCashMashin;

    public Bank(CashMachine[] cashMachines) {
        listCashMashin = cashMachines;
        CashMachine[] averageOfAll = cashMachines;

    }

    public double sumOfCashFromMachines() {                      // całkowit wartosc wpłat
        int numberOfMAchine = listCashMashin.length;
        int sum = 0;
        for (int i = 0; i < numberOfMAchine; i++) {
            CashMachine cashMachines = listCashMashin[i];
            int balance = cashMachines.balance();
            sum += balance;
        }
        return sum;

    }

    public double allAverage() {                            // średnia wartość transakcji

        int length = listCashMashin.length;
        double howAverageAll = 0;
        for (int i = 0; i < length; i++) {
            CashMachine averageAll = new CashMachine("all");
            double howAverage = averageAll.HowAverage();
            howAverageAll = +howAverage;
        }
        return howAverageAll / listCashMashin.length;
    }

    public int allNumberTransations() {
        CashMachine cashMAchineQuantiti = new CashMachine("Quantitit");
        int allQuantiti = cashMAchineQuantiti.getNumberOfTransations();
        return allQuantiti;


        /*
        int length = listCashMashin.length;
        int allTransations = 0;
        for (int i = 0; i < length; i++) {
            CashMachine cashMachineTransations = listCashMashin[i];
           int sumTransations = cashMachineTransations.getNumberOfTransations();
           allTransations =+ sumTransations;
        }
        return allTransations;
    }  */

    }
}

