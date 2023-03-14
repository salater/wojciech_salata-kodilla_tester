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
        this.transactionsPayment = new int[0];
        this.transactionsPaycheck = new int[0];

    }
    public void addTransaction(int cash) {  // dodadanie wplaty/wyplaty z bankomatu
        if (cash == 0) {
            return;
        }
        this.numberOfTransations++;
        if (cash > 0) {
            addTransactionsPayment(cash);
        }
        if (cash < 0) {
            addTransactionPaycheck(cash);
        }
    }

    public void addTransactionsPayment(int cash) {

        this.sizePayment++;
        int[] newTransation = new int[this.sizePayment];
        System.arraycopy(transactionsPayment, 0, newTransation, 0, transactionsPayment.length);
        newTransation[this.sizePayment - 1] = cash;
        this.transactionsPayment = newTransation;
    }

    public void addTransactionPaycheck(int cash) {

        this.sizePaycheck++;
        int[] newTransation = new int[this.sizePaycheck];
        System.arraycopy(transactionsPaycheck, 0, newTransation, 0, transactionsPaycheck.length);
        newTransation[this.sizePaycheck - 1] = cash;
        this.transactionsPaycheck = newTransation;

    }

    public int balance() {                  //  saldo bankomatu
        balanceCach = IntStream.of(transactionsPaycheck).sum() + IntStream.of(transactionsPayment).sum();
            return balanceCach;
    }
    public int getNumberOfTransations() {   // ilość transakcji

        return numberOfTransations;
    }

    public double HowAverage(){             //średnia kwota transakcji
        average = balance() / getNumberOfTransations();
        return average;
    }


    public int getSizePayment() {           // ilosc wpłat bankomatu

        return sizePayment;
    }
    public int getSizePaycheck() {          // ilość wypłat bankomatu

        return sizePaycheck;
    }
public int getBalancePaychack() {
    balanceCach = IntStream.of(transactionsPaycheck).sum();
    return balanceCach;
}

    public int getBalancePayment() {
        return IntStream.of(transactionsPayment).sum();
    }
}
