package com.kodilla.calculator;

public class Calculator {
    private int n1;
    private int n2;
    public Calculator(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    private int nPlus;
    public int getnPlus(){
        return n1+n2;
    }
    public int getnMin(){
        return n1-n2;
    }
    public int nMin=n1-n2;
    public static void main(String args[]){
        Calculator calculator=new Calculator(50,55);
        System.out.println("Wynik dodawania: "+calculator.getnPlus());
        System.out.println("Wynik odejmowania: "+calculator.getnMin());

    }
}
