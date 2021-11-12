package Calculater;/*  addition; сложение
subtraction; вычитание
Multiplication; умножение
Division; деление */

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Chisla chisla1 = new Chisla(0, 0);
        //int result = 0;

        double operand1;
        double operand2;
        char operation;
        char exitprogramm = 'c';
        double result = 0;
        do {
            if (exitprogramm == 'c') {
                System.out.println("enter operand1");
                //chisla1.setOperand1(scanner.nextInt());
                operand1 = scanner.nextDouble();
                System.out.println("enter operation number");
                operation = scanner.next().charAt(0);

            } else {
                System.out.println("Введите операцию");
                operand1 = result;// появляется на второй итерации
                operation = exitprogramm; // когда просит ввести операцию
            }


            System.out.println("enter operand2");
            // chisla1.setOperand2(scanner.nextInt());
            operand2 = scanner.nextDouble();
            result = counting(operand1, operand2, operation);
            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
            System.out.println("If you wont exit press s or press c for clear result");
            exitprogramm = scanner.next().charAt(0);
        } while (exitprogramm != 's');

        /*switch (operation) {
            case '+':
                result = chisla1.getOperand1() + chisla1.getOperand2();
                break;
            case '-':
                result = chisla1.getOperand1() - chisla1.getOperand2();
                break;
            case '/':
                result = chisla1.getOperand1() / chisla1.getOperand2();
                break;
            case '*':
                result = chisla1.getOperand1() * chisla1.getOperand2();
                break;
            default:
                System.out.println("something get wrong");

        }*/
        // System.out.println(result);
    }

    public static double counting(double operand1, double operand2, char operation) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("You asshole");
                yield 0;
            }
        };
    }

    // static class Chisla {
    // Scanner scanner = new Scanner(System.in);

    // private int operand1; /*= scanner.nextInt();*/
    // private char operation ; /*= scanner.next().charAt(0);*/
    //  private int operand2; /*= scanner.nextInt();*/

    //  Chisla(int operand1, int operand2) {
    //   this.operand1 = operand1;
    // this.operation = operation;
    //     this.operand2 = operand2;

    //  }


    //  public void setOperand1(int operand1) {
    //    this.operand1 = operand1;
    //  }

    //   public int getOperand1() {
    //       return this.operand1;
    //   }


    //   public void setOperand2(int operand2) {
    //     this.operand2 = operand2;
    //  }

    //  public int getOperand2() {
    //      return this.operand2;
    //   }

    //  }


}
