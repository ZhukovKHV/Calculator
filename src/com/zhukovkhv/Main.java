package com.zhukovkhv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Data in = new Data();
        System.out.println(in.converOper());
    }
}

class Data {

    String arabarray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String rimarray[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    Scanner enter = new Scanner(System.in);
    String equation = enter.nextLine();
    String array[] = equation.split(" ");

    int a;
    public int convertDataA(){
            for (int i = 0; i <= arabarray.length; i++) {
                if (array[0].equals(arabarray[i])) {
                    a = i + 1;
                    return a;
                } else
                if (array[0].equals(rimarray[i])) {
                    a = i + 1;
                    return a;
                }
            }
    return a;
    }

    int b;
    public int convertDataB(){
        for (int i = 0; i <= arabarray.length; i++) {
            if (array[2].equals(arabarray[i])) {
                b = i + 1;
                return b;
            } else
            if (array[2].equals(rimarray[i])) {
                b = i + 1;
                return b;
            }
        }
    return b;
    }

    int oper;
    public int converOper(){
        a = convertDataA();
        b = convertDataB();
        switch (array[1]){
            case "+": oper = a + b; break;
            case "-": oper = a - b; break;
            case "*": oper = a * b; break;
            case "/": oper = a / b; break;

            default:
                System.out.println("Недопустимое выражение");
        return oper;
        }
    return oper;
    }
}