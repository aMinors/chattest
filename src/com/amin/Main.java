package com.amin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

    String name;
    //jautajums 1
    System.out.println("What Does JAVA Name Stand For?");
     name = Scanner.nextLine();
     if(name.equals("type of coffee")){
         System.out.println("Yeahh");
     }else{
         System.out.println("no , please google it");

     }
//jautajums 2
        System.out.println("Father of Java?");
        name = Scanner.nextLine();
        if(name.equals("James Gosling")){
            System.out.println("Yeahh");
        }else{
            System.out.println("no , please google it");

        }
        //jautajums 3

        System.out.println("Coolest Future Junior Programmer?");
        name = Scanner.nextLine();
        if(name.equals("Programmer Andris.M")){
            System.out.println("Yeahh woooop (lots of fireworks) ");
        }else{
            System.out.println("no , please google it");

        }
    }

}
