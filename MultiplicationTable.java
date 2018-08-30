import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Tables.\n");
        System.out.println("How large would you like to see them? (The max is 20.)");
        int size = keyboard.nextInt();
        for(int left = 0; left <= size; left++) {
            for(int right = 0; right <= size; right++ ){
                System.out.println(left + " * " + right + " = " + (left * right));
            }
        }
        }}




