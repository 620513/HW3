package com.company;
public class Main {
    public static void main (String args[])
    {
        Triple <String,String,String> T = new Triple<>("left", "middle","right");
        Triple <String,Double,Integer>  K= new Triple<>("left",7.0,8);
        System.out.println(T);
        System.out.println(K);
    }
}

