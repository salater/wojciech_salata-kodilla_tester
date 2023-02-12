package com.kodilla.inheritance.basic_assertion;

public class PrimeChecker {
    int a = 0;
private int count;
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            a = number % i;
            if (a == 0) {
                return false;
            }
        }
            return true;
        }
        public int getCount() {
        return count;
        }
        public void incrementCount(){
        this.count++;
        }

    }

