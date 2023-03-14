package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTestSuite {
    @Test
    void shoudReturnSumAllCash() {          //sprawdz ile bylo wszytskich pieniedzy
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
        System.out.println("---------------------------------");
        System.out.println("sum cash from all cashmachines: " + sum);
        System.out.println("---------------------------------");
    }

    @Test
    void shoudReturnSumAlltransPayment() {
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
        int sum = bank.sumAllTransPayment();
        // then
        Assertions.assertEquals(2, sum);
        System.out.println("---------------------------------");
        System.out.println("number of transaction payment: " + sum);
        System.out.println("---------------------------------");
    }

    @Test
    void shoudReturnSumAllTransPaycheck() {
        // given
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(800);
        cashMachine.addTransaction(-700);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-400);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(350);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
        // when
        int sum = bank.sumAllTransPaychack();
        // then
        Assertions.assertEquals(3, sum);
        System.out.println("---------------------------------");
        System.out.println("number transactions paychack: " + sum);
        System.out.println("---------------------------------");
    }

    @Test
    void shoudReturnAllAveragePaychack() {                             // srednia wartosc wyplat
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-200);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
        double average = bank.allAveragePaychack();

        // then

        Assertions.assertEquals(-200, average);
        System.out.println("---------------------------------");
        System.out.println("average paychack  !!!!  " + average);
        System.out.println("---------------------------------");
    }
    @Test
    void shoudReturnAllAveragePayment() {                             // srednia wartosc wplat
        CashMachine cashMachine = new CashMachine("Jaw");
        cashMachine.addTransaction(1000);
        cashMachine.addTransaction(-200);
        CashMachine cashMachine2 = new CashMachine("Leg");
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        CashMachine[] listMachines = {cashMachine, cashMachine2};
        Bank bank = new Bank(listMachines);
        double average = bank.allAveragePayment();

        // then

        Assertions.assertEquals(550, average);
        System.out.println("---------------------------------");
        System.out.println("average payment from cashmachines !!!!  " + average);
        System.out.println("---------------------------------");
    }
}



