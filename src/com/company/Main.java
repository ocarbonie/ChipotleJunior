package com.company;

import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.print("\nBurrito " + (i+1) + ": ");
            burritoMaker();
        }

    }

    public static void burritoMaker(){
        //variables
        ArrayList<String>burritoAssembler = new ArrayList<>();
        Random rnd = new Random();

        //Let's get the rice option
        burritoAssembler.add(riceOptions());

        //Let's get the meat option
        burritoAssembler.add(meatOptions());

        //Let's get the beans option
        burritoAssembler.add(beansOptions());

        //Let's get the Salsa option
        burritoAssembler.add(salsaOptions());

        //Let's get the Veggies option
        burritoAssembler.add(veggiesOptions());

        //for visual purposes
        for(String m : burritoAssembler){
            System.out.print(m + ", ");
        }

    }
    public static String riceOptions(){
        String [] riceArr = {"white rice", "brown rice", "no rice"};
        Random rnd = new Random();

        //Random number selector
        int riceNum =  rnd.nextInt(3);

        //Random rice option selector
        return riceArr[riceNum];

        }

    public static String meatOptions(){
        String [] meatArr = {"chicken meat","steak meat","carnidas meat","chorizo meat","sofritas meat","veggies"};
        Random rnd = new Random();

        //Random number selector
        int meatNum =  rnd.nextInt(6);

        //Random meat option selector
        return meatArr[meatNum];
    }

    public static String beansOptions(){
        String [] beansArr = {"pinto beans", "black beans", "no beans"};
        Random rnd = new Random();

        //Random number selector
        int beansNum =  rnd.nextInt(3);

        //Random beans option selector
        return beansArr[beansNum];
    }

    public static String salsaOptions() {
        String[] salsaArr = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
        Random rnd = new Random();

        //Random number selector
        int salsaNum =  rnd.nextInt(4);

        //Random salsa option selector
        return salsaArr[salsaNum];
    }

    public static String veggiesOptions() {
        String[] veggiesArr = {"lettuce", "fajita", "veggies", "no veggies"};
        Random rnd = new Random();

        //Random number selector
        int veggiesNum =  rnd.nextInt(4);

        //Random veggies option selector
        return veggiesArr[veggiesNum];
    }


}


