package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMax {
    public float maxOfThree(Float a, Float b, Float c){
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
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float max= findmax.maxOfThree(a,b,c);
        System.out.println("max of: "+a+","+b+","+c+","+"is "+max);

    }
}
