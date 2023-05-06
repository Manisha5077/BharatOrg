package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hi Team..");

        System.out.println("Hi Gaurav..");

        largestOutOfThree(8, 7, 4);

        lowest(55, 7, 2);
    }



    public static void largestOutOfThree(int a, int b , int c){

        int temp;
        int largest;
        temp= a>b?a:b;
        largest= temp>c?temp:c;
        System.out.println(largest);

    }

    public static void lowest(int a, int b, int c){
        int temp;
        int largest;
        temp= a<b?a:b;
        largest= temp<c?temp:c;
        System.out.println(largest);

    }

}