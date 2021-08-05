package com.codegym;

import java.util.Scanner;

public class Main {

    public static String docMotChuSo(int number){
        String str = "";
        switch (number){
            case 0:
                str = "zero";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }

    public static String docHaiChuSo(int number){
        String str = "";
        switch (number){
            case 10:
                str = "ten";
                break;
            case 20:
                str = "twenty";
                break;
            case 30:
                str = "thirty";
                break;
            case 40:
                str = "forty";
                break;
            case 50:
                str = "fifty";
                break;
            case 60:
                str = "sixty";
                break;
            case 70:
                str = "seventy";
                break;
            case 80:
                str = "eighty";
                break;
            case 90:
                str = "ninety";
                break;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        int number = scanner.nextInt();

        if(number >= 0 && number <10){
            System.out.println(docMotChuSo(number));
        }else if(number >= 10 && number < 20){
            switch (number){
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                default:
                    int ten = number % 10;
                    System.out.println(docMotChuSo(ten) + "teen");
            }
        }else if (number >= 20 && number < 100) {
            int ten = number / 10;
            int donVi = number % 10;
            System.out.println(docHaiChuSo(ten)+docMotChuSo(donVi));

        } else if(number >= 100 && number < 1000){
            int hundred = number / 100;
            int ten = (number % 100) / 10;
            int donVi = (number % 100) % 10;

            if(number % 100 == 0){
                System.out.println(docMotChuSo(hundred) + " hundred");
            }
            else if(number <= 119){
                System.out.println(docMotChuSo(hundred) + " hundred and " + docMotChuSo(donVi)+ "teen");
            }
            else{
                System.out.println(docMotChuSo(hundred) + " hundred and " + docHaiChuSo(ten) +" "+ docMotChuSo(donVi));
            }
        }
        else {
            System.out.println(" Out of ability ");
        }
    }
}
