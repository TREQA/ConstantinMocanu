/*Trebuie creată clasa Calculator (de buzunar) care are trei proprietăţi:
operand1, operand2 şi operator. Clasa posedă metoda calculate() care,
pe baza operatorului, execută operaţia de calcul adecvată asupra operanzilor şi
returnează un rezultat. Sunt suficiente cele 4 operaţii de bază
(+, -, *, / - adunarea, scăderea, înmulţirea şi împărţirea).
Toate valorile sunt de tip double.  */

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Calculator calculate = new Calculator();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an operand");
        String text = keyboard.nextLine();
        System.out.println("enter first number");
        double first_number = keyboard.nextDouble();
        System.out.println("enter second number");
        double second_number = keyboard.nextDouble();

        switch (text)
        {
            case "+":
                System.out.println(calculate.add(first_number, second_number));
                break;
            case "-":
                System.out.println(calculate.substract(first_number,second_number));
                break;
            case "*":
                System.out.println(calculate.multiply(first_number, second_number));
                break;
            case "/":
                System.out.println(calculate.divide(first_number, second_number));
                break;
            default:
                System.out.println("Operation not available");
                break;
        }
    }
    public double add (double a, double b)
    {
        return a+b;
    }
    public double substract (double a, double b)
    {
        return a-b;
    }
    public double multiply (double a, double b)
    {
        return a*b;
    }
    public double divide (double a, double b)
    {
        return a/b;
    }
}
