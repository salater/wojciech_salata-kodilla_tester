package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMAcineTestSuit {
    @Test
    public void checkAddTransaction() {

        CashMachine cashMachineJ = new CashMachine("Jawor");
        cashMachineJ.addTransaction(200);
        cashMachineJ.addTransaction(500);
        cashMachineJ.addTransaction(-100);
        cashMachineJ.addTransaction(-0);

        CashMachine cashMachineL = new CashMachine("Lenica");
        cashMachineL.addTransaction(300);
        cashMachineL.addTransaction(500);
        cashMachineL.addTransaction(-800);
        cashMachineL.addTransaction(-100);
        cashMachineL.addTransaction(0);


        assertEquals(7, cashMachineJ.getNumberOfTransations() + cashMachineL.getNumberOfTransations());      // spradza ilosc transakcji
        assertEquals(4, cashMachineJ.getSizePayment() + cashMachineL.getSizePayment());              // sprawdza ilosc wplat
        assertEquals(3, cashMachineJ.getSizePaycheck() + cashMachineL.getSizePayment());             // sprawdza ilosc wyplat
        assertEquals(500, cashMachineJ.balance() + cashMachineL.balance());                   // sprawdza saldo bankomatow
        assertEquals(71.0, (cashMachineJ.balance() + cashMachineL.balance()) / (cashMachineJ.getNumberOfTransations() + cashMachineL.getNumberOfTransations()));               // sprawdza srednia transakcji

        System.out.println("number of transactions Jawor: " + (cashMachineJ.getNumberOfTransations() + cashMachineL.getNumberOfTransations()));
        System.out.println("number of transactions plus Jawor: " + (cashMachineJ.getSizePayment() + cashMachineL.getSizePayment()));
        System.out.println("number of transactions minus Jawor : " + (cashMachineJ.getSizePaycheck() + cashMachineL.getSizePaycheck()));
        System.out.println("Balance: " + (cashMachineJ.balance() + cashMachineL.balance()));
        System.out.println("Average: " + (cashMachineJ.balance() + cashMachineL.balance()) / (cashMachineJ.getNumberOfTransations() + cashMachineL.getNumberOfTransations()));               // sprawdza srednia transakcji

    }

}
