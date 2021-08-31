package com.company;

import java.util.Scanner;


public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Операции над double/float");
            System.out.println("1. Сравнить\n" +
                    "2. Округлить\n" +
                    "3. Отбросить дробную часть\n"+
                    "4. Заввершить программу ");

            int input = scanner.nextInt();
            if (input == 4) break;

            switch (input){
                case 1 : {
                    System.out.println("Введите первое число");
                    double value1 = scanner.nextDouble();
                    System.out.println("Введите второе число");
                    double value2 = scanner.nextDouble();

                    System.out.println("Результат:\n" + " >> " + compareValues(value1,value2));
                    break;
                }
                case 2:{
                    System.out.println("Введите число");
                    double value = scanner.nextDouble();
                    System.out.println("Результат округление");
                    System.out.println(">>" + Math.round(value));
                    break;
                }
                case 3: {
                    System.out.println("Введите дробное число");
                    double value = scanner.nextDouble();
                    System.out.println("результат");
                    int newValue = (int) value;
                    System.out.println(">>" + newValue);
                    break;
                }

            }
        }
        System.out.println("Спасибо что воспользовались услугой Мехмана :)");
    }
    public static String compareValues (double value1 , double value2){
        if (Math.abs((value1-value2)) < 0.0000000001) {
            return "Числа равны";
        }else if (value1>value2){
            return "Первое число больше";
        }else {
            return "Второе число больше ";
        }
    }
}