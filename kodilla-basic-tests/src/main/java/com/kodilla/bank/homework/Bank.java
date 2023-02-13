package com.kodilla.bank.homework;

public class Bank {

    private String[] cashMachine;
private int size;
    public Bank() {
       this.cashMachine = new String[0];

    }
    public void listOfCashMAchine(String bankomat) {
        this.size++;
        String[] newCashMachine = new String[this.size];
        System.arraycopy(cashMachine, 0, newCashMachine, 0, cashMachine.length);
        newCashMachine[this.size - 1] = bankomat;
        this.cashMachine = newCashMachine;
    }



    }
}