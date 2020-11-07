package com.zhukovkhv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Data in = new Data();
        int out = in.converOper();
        System.out.println(out);
        }

    }

class Data {

    String[] arabarray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] rimarray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    Scanner enter = new Scanner(System.in);
    String equation = enter.nextLine();
    String[] array = equation.split(" ");

    int a, b , oper;

    public int convertDataA(){
        try {
        for (int i = 0; i <= arabarray.length; i++) {
                if (array[0].equals(arabarray[i])) {
                    a = i + 1;
                    return a;
                } else
                if (array[0].equals(rimarray[i])) {
                    a = i + 1;
                    return a;
                }
        }}
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Введите первое число от 1(I) до 10(X)");
        }
    return a;
    }

    public int convertDataB(){
        try{
        for (int i = 0; i <= arabarray.length; i++) {
            if (array[2].equals(arabarray[i])) {
                b = i + 1;
                return b;
            } else
            if (array[2].equals(rimarray[i])) {
                b = i + 1;
                return b;
            }
        }}
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Введите второе число от 1(I) до 10(X)");
        }
    return b;
    }

    public int converOper(){
        a = convertDataA();
        b = convertDataB();
        switch (array[1]) {
            case "+" -> oper = a + b;
            case "-" -> oper = a - b;
            case "*" -> oper = a * b;
            case "/" -> oper = a / b;
            default -> System.out.println("Недопустимое выражение");
        }
    return oper;
    }
}

class convertArab {

}