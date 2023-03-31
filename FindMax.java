package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMax<T extends Comparable<T>> {
    T a;
    T b;
    T c;
    public FindMax(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T maxOfThree(T a, T b, T c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
        else if(b.compareTo(c)>0)
            return b;
        else
            return c;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 Integers: ");
        Integer a =input.nextInt();
        Integer b = input.nextInt();
        Integer c = input.nextInt();
        FindMax<Integer> findmax = new FindMax(a,b,c);
        Integer max= findmax.maxOfThree(a,b,c);
        System.out.println("max of: "+a+","+b+","+c+","+"is "+max);
        System.out.println();

        System.out.println("Enter 3 Flaot Numbers: ");
        float m =input.nextFloat();
        float n = input.nextFloat();
        float o = input.nextFloat();
        FindMax<Float> findmax1 = new FindMax(m,n,o);
        float max1= findmax1.maxOfThree(m,n,o);
        System.out.println("max of: "+m+","+n+","+o+","+"is "+max1);
        System.out.println();

        System.out.println("Enter 3 Strings: ");
        String x =input.next();
        String y = input.next();
        String z = input.next();
        FindMax<String> findmax2 = new FindMax(x,y,z);
        String max2= findmax2.maxOfThree(x,y,z);
        System.out.println("max of: "+x+","+z+","+c+","+"is "+max2);

    }
}
