package com.company;

import java.util.Date;
import java.util.Random;

public class Account {
    private double AMD;
    private double USD;
    private String owner;

    private Account(double amd, double usd, String owner){
        this.AMD = amd;
        this.USD = usd;
        this.owner = owner;
    }
    private static int getUsdRate(){
        return new Random().nextInt(101) + 400;
    }

    public double getAMD() {
        return AMD;
    }

    public double getUSD(){
        return USD;
    }

    public static Account createAmdAccount(double amd, String owner){
        return new Account(amd, amd / getUsdRate(),owner);
    }

    public static Account createUsdAccount(double usd, String owner){
        return new Account(usd * getUsdRate(), usd,owner);
    }



}
