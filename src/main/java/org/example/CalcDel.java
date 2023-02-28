package org.example;
//В калькулятор добавьте возможность отменить последнюю операцию.

import java.awt.*;
import java.util.Scanner;
import java.util.Stack;

public class CalcDel {



    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        String str = "";
        Scanner iScanner = new Scanner(System.in);
        int result;


        while (stack.size() < 4) {
            if (stack.size() < 1) {
                System.out.println("Введите первое число: ");
            } else {
                if (stack.size() < 2) {
                    System.out.println("Введите второе число или del для отмены: ");
                } else {
                    if (stack.size() < 3) {
                        System.out.println("Введите операцию * или / или + или -  или del для отмены: ");
                    } else {
                        if (stack.size() == 3) {
                            System.out.println("Введите start для начала или del для отмены : ");
                        }
                    }
                }
            }
            str = iScanner.nextLine();

            if (str.equals("del")) {
                stack.remove(stack.size() - 1);
            } else {
                stack.push(str);
            }
        }
        if (str.equals("start")) {
            stack.pop();
            System.out.print("Ваш пример: ");
            System.out.println(stack);
        }
        if (isDigit(stack.lastElement())) {
            System.out.println("Ошибка ввода данных");
        } else {
            switch (stack.pop()) {
                case "+":
                    result = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    System.out.println("сумма " + result);
                    break;

                case "-":
                    result = -Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    System.out.println("разность " + result);
                    break;

                case "/":
                    Integer temp = Integer.parseInt(stack.pop());
                    result = Integer.parseInt(stack.pop()) / temp;
                    System.out.println("частное " + result);
                    break;


                case "*":
                    result = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                    ;
                    System.out.println("произведение " + result);
                    break;
                default:
                    System.out.println("The operator you have selected is invalid");
                    break;
            }
        }
    }
    private static boolean isDigit(String s) throws NullPointerException {
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}

