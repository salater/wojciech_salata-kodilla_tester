package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMAcineTestSuit {
    @Test
    public void checkAddTransaction() {
        CashMachine cashMachine = new CashMachine();

        CashMachine cashMachineLegnica = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-0);

        CashMachine cashMachineJawor = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-800);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(0);

     //   CashMachine[] bankomat = {cashMachineJawor, cashMachineLegnica};
        assertEquals(7, cashMachine.getNumberOfTransations());      // spradza ilosc transakcji
        assertEquals(4, cashMachine.getSizePayment());              // sprawdza ilosc wplat
        assertEquals(3, cashMachine.getSizePaycheck());             // sprawdza ilosc wyplat
        assertEquals(500, cashMachine.balance());                   // sprawdza saldo bankomatow
        assertEquals(71.0, cashMachine.HowAverage());               // sprawdza srednia transakcji

        System.out.println("number of transactions: " + cashMachine.getNumberOfTransations());
        System.out.println("number of transactions plus: " + cashMachine.getSizePayment());
        System.out.println("number of transactions minus: " + cashMachine.getSizePaycheck());
        System.out.println("Saldo: " + cashMachine.balance());
        System.out.println("Average: " + cashMachine.average);
    }

}
