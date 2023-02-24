package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {
    @Test
    void shoudReturnSumAllTransations() {
        // given
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(800);
        cashMachine.addTransaction(-700);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-400);
        cashMachine.addTransaction(350);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
        // when
        double sum = bank.sumOfCashFromMachines();
        // then
        Assertions.assertEquals(50, sum);
    }
    @Test
    void shoudReturnSumAllPayment() {
        // given
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(800);
        cashMachine.addTransaction(-700);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-400);
        cashMachine.addTransaction(350);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
        // when
        double sum = bank.sumOfCashFromMachines();
        // then
        Assertions.assertEquals(50, sum);
    }

@Test
    void ShoudReturnAllNumebrOfTransations() {
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(400);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-200);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
    System.out.println("ilosc transakcji: " + cashMachine.getNumberOfTransations());
        int allTransations = bank.allNumberTransations();
        Assertions.assertEquals(2, allTransations);
    }
@Test
    void shoudReturnAllAverage() {
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(400);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-200);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
        double average = bank.allAverage();
        System.out.println("srednia z bankomatow !!!!  " + bank.allAverage());
        // then

        Assertions.assertEquals(300, average);
    }
}



