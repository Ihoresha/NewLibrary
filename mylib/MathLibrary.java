package com.ihor.mylib;




public class MathLibrary {



    private MathLibrary() {

    }



    public static double pow(double number, double power) {

        return Math.pow(number, power);
    }



    public static int factorial(int number) {

        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;

    }



    public static double log(double number, double base) {

        return Math.log(number) / Math.log(base);

    }

}