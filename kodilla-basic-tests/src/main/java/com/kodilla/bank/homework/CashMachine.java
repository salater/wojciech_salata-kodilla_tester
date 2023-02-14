package com.kodilla.bank.homework;

import java.util.stream.IntStream;

public class CashMachine {

    private int[] transactionsPaycheck;
    private int[] transactionsPayment;
    private int numberOfTransations = 0;
    //private int size;
    int balanceCach;
    private int sizePayment;
    private int sizePaycheck;
    double average;
    String city;

    public CashMachine(String city) {
        this.city = city;
        this.transactionsPayment = new int[0]; // zerowa tablica
        this.transactionsPaycheck = new int[0]; // zerowa tablica

    }
    public void addTransaction(int cash) {  // dodadanie wplaty/wyplaty z bankomatu
        if (cash == 0) {
            return;
        }
        this.numberOfTransations++;         // licznik Transactions - wplaty / ywplaty
        if (cash > 0) {
            addTransactionsPayment(cash);
        }
        if (cash < 0) {
            addTransactionPaycheck(cash);
        }
    }

    public void addTransactionsPayment(int cash) {
                            //dodanie wpalaty do bankomatu - metoda dodaje elemetn tablicy z liczbą < 0
        this.sizePayment++;
        int[] newTransation = new int[this.sizePayment];
        System.arraycopy(transactionsPayment, 0, newTransation, 0, transactionsPayment.length);
        newTransation[this.sizePayment - 1] = cash;
        this.transactionsPayment = newTransation;
    }

    public void addTransactionPaycheck(int cash) {
                            //dodanie wypalaty z bankomatu - metoda dodaje elemetn tablicy z liczb <0
        this.sizePaycheck++;
        int[] newTransation = new int[this.sizePaycheck];
        System.arraycopy(transactionsPaycheck, 0, newTransation, 0, transactionsPaycheck.length);
        newTransation[this.sizePaycheck - 1] = cash;
        this.transactionsPaycheck = newTransation;

    }

    public int balance() {     // zwroc saldo po wszytskich transakcjach czyli suma elelmentow tablicy
        int balanceCach = IntStream.of(transactionsPaycheck).sum() + IntStream.of(transactionsPayment).sum();
            return balanceCach;
    }

    public int getNumberOfTransations() {             //zwraca licznik wszystkic transakcji
        return numberOfTransations;
    }

    public int getSizePayment() {                    // ilosc wpłat
        return sizePayment;
    }
    public int getSizePaycheck() {                   // ilosc wyplat
        return sizePaycheck;
    }
    public double HowAverage(){                     // srednia watosci wplat
        average = balance() / numberOfTransations;
        return average;
    }

    public int[] getTransactionsPayment() {
        return transactionsPayment;
    }

    public int[] getTransactionsPaycheck() {
        return transactionsPaycheck;
    }
}
