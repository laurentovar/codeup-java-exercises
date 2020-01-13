package practice.practice;

import java.util.Scanner;

//take the num parameter being passed and return the factorial of it.
//(4 * 3 * 2 * 1) = 24.
public class FirstFactorial {
    public static int Factorial (int num){
        if (num > 1){
            return num * Factorial(num-1);
        }
        else {
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(Factorial(scanner.nextInt()));
    }
}
