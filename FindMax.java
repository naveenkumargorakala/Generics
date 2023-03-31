package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMax {
    public Integer maxOfThree(Integer a,Integer b,Integer c){
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
        System.out.println("Enter 3 Numbers: ");
        Integer a = input.nextInt();
        Integer b = input.nextInt();
        Integer c = input.nextInt();
        Integer max=findmax.maxOfThree(a,b,c);
        System.out.println("max of"+a+","+b+","+c+","+": "+max);

    }
}
