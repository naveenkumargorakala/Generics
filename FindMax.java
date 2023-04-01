package com.bridgelabz.generics;

import java.util.Arrays;

public class FindMax<T extends Comparable<T>> {

    T a;
    T b;
    T c;
//    public FindMax(T a, T b, T c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
    public T testMax(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array[array.length - 1];
    }
    public static void main(String[] args) {
        FindMax<Integer> findmax = new FindMax();
        Integer[] arr=new Integer[]{12,34,565,76};
        Integer max= findmax.testMax(arr);
        System.out.println("max of array is "+max);
        System.out.println();

        FindMax<Float> findmax1 = new FindMax();
        Float[] arr1=new Float[]{23.f,4.f,5.f,43.f};
        float max1= findmax1.testMax(arr1);
        System.out.println("max of array is "+max1);
        System.out.println();

        FindMax<String> findmax2 = new FindMax();
        String[] str= new String[]{"dffd","fd","Ff"};
        String max2= findmax2.testMax(str);
        System.out.println("max of array is "+max2);
    }

}