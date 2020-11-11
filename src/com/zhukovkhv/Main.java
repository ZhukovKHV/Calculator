package com.zhukovkhv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Data in = new Data();


        if (in.convertArabDataA() >= 1 && in.convertArabDataB() >= 1) {
            System.out.println(in.convertOper());
        }
        if (in.convertRimDataA() >= 1 && in.convertRimDataB() >= 1) {
            System.out.println(in.convertRimOper());
        }
        if (in.convertArabDataA() >= 1 && in.convertArabDataB() == 0 || in.convertArabDataA() == 0 && in.convertArabDataB() >= 1) {
            System.out.println("Введите только арабские или только римские числа от 1(I) до 10(X)");
        }
    }
}

class Data {

    String[] arabarray = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] rimarray = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    Scanner enter = new Scanner(System.in);
    String equation = enter.nextLine();
    String[] array = equation.split(" ");

    int a, rimA, b, rimB, oper;
    String rimoper;

    public int convertArabDataA(){
        try {
        for (int i = 0; i <= arabarray.length; i++) {
                if (array[0].equals(arabarray[i])) {
                    a = i + 1;
                    return a;
                }
        }}
        catch (ArrayIndexOutOfBoundsException ex){
            a = 0;
        }
    return a;
    }

    public int convertArabDataB(){
        try{
            for (int i = 0; i <= arabarray.length; i++) {
                if (array[2].equals(arabarray[i])) {
                    b = i + 1;
                    return b;
                }
            }}
        catch (ArrayIndexOutOfBoundsException ex){
            b = 0;
        }
    return b;
    }

    public int convertRimDataA(){
        try {
            for (int i = 0; i <= rimarray.length; i++) {
                if (array[0].equals(rimarray[i])) {
                    rimA = i + 1;
                    return rimA;
                }
            }}
        catch (ArrayIndexOutOfBoundsException ex){
            rimA = 0;
        }
    return rimA;
    }

    public int convertRimDataB(){
        try{
            for (int i = 0; i <= rimarray.length; i++) {
                if (array[2].equals(rimarray[i])) {
                   rimB = i + 1;
                   return rimB;
                }
            }}
        catch (ArrayIndexOutOfBoundsException ex){
            rimB = 0;
        }
    return rimB;
    }

    public int convertOper(){
        if(a >= 1 && b >= 1){
        switch (array[1]) {
            case "+" -> oper = a + b;
            case "-" -> oper = a - b;
            case "*" -> oper = a * b;
            case "/" -> oper = a / b;
            default -> System.out.println("Недопустимое выражение");
        }} else
        if(rimA >= 1 && rimB >= 1){
        switch (array[1]) {
            case "+" -> oper = rimA + rimB;
            case "-" -> oper = rimA - rimB;
            case "*" -> oper = rimA * rimB;
            case "/" -> oper = rimA / rimB;
            default -> System.out.println("Недопустимое выражение");
            }
        }
    return oper;
    }

    public String convertRimOper(){
        int out = convertOper();
        String operstr = String.valueOf(out);
        int remains = out % 10;
        String remainsstr = String.valueOf(remains);

       if (out >= 1 && out <= 10){
            for(int j = 0; j <= rimarray.length; j++){
                if(operstr.equals(arabarray[j])){
                    rimoper = rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 10 && out < 20){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "X" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 20 && out < 30){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "XX" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 30 && out < 40){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "XXX" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 40 && out < 50){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "XL" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 50 && out < 60){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "L" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 60 && out < 70){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "LX" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 70 && out < 80){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "LXX" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 80 && out < 90){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "LXXX" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if (out > 90 && out < 100){
            for(int j = 0; j <= rimarray.length; j++){
                if(remainsstr.equals(arabarray[j])){
                    rimoper = "XC" + rimarray[j];
                    return rimoper;
                }
            }
        } else
        if(operstr.equals("20")){
            rimoper = "XX";
            return rimoper;
        } else
        if(operstr.equals("30")){
            rimoper = "XXX";
            return rimoper;
        }
        switch (operstr) {
            case "40" -> {
                rimoper = "XL";
                return rimoper;
            }
            case "50" -> {
                rimoper = "L";
                return rimoper;
            }
            case "60" -> {
                rimoper = "LX";
                return rimoper;
            }
            case "70" -> {
                rimoper = "LXX";
                return rimoper;
            }
            case "80" -> {
                rimoper = "LXXX";
                return rimoper;
            }
            case "90" -> {
                rimoper = "XC";
                return rimoper;
            }
            case "100" -> {
                rimoper = "C";
                return rimoper;
            }
        }
    return rimoper;
    }
}

