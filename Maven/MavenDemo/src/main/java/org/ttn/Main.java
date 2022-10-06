package org.ttn;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        factorial(5);

    }
    public static int factorial(int a){
        int result = 1;
        for(int i = a; i>0; i--){
            result = result*i;
        }
        System.out.println(result);
        return result;
    }
}