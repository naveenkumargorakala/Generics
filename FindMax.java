package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMax {
    public String maxOfThree(String a, String b, String c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if(b.compareTo(c)>0)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        FindMax findmax = new FindMax();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Strings: ");
        String a = input.next();
        String b = input.next();
        String c = input.next();
        String max= findmax.maxOfThree(a,b,c);
        System.out.println("max of: "+a+","+b+","+c+","+"is "+max);

    }
}
