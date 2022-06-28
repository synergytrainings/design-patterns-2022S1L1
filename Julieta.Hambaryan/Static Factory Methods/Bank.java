package com.company;

import java.util.Date;
import java.util.Random;

public class Bank {
    public static void main(String[] args) {

        Account account1 = Account.createAmdAccount(5000,"account1");
        Account account2 = Account.createUsdAccount(20,"account2");
        System.out.println(account1.getUSD());
        System.out.println(account2.getAMD());
    }
}
