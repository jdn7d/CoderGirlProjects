import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList{
    public static void main(String [] args)

    {
        Scanner keyboard = new Scanner(System.in);
        String item1;
        out.print("What is item 1?");
        item1 = keyboard.next();

        String item2;
        out.print("What is item2?");
        item2 = keyboard.next();

        String item3;
        out.print("What is item3?");
        item3 = keyboard.next();

        int item1quantity;
        out.print("What is the quantity of " + item1  + "?" );
        item1quantity = keyboard.nextInt();

        int item2quantity;
        out.print("What is the quantity of " + item2 + "?");
        item2quantity = keyboard.nextInt();

        int item3quantity;
        out.print("What is the quantity of " + item3 + "?");
        item3quantity = keyboard.nextInt();

        float item1price;
        out.print("What is the price of " + item1 + "?");
        item1price = keyboard.nextFloat();

        float item2price;
        out.print("What is the price of " + item2 + "?");
        item2price = keyboard.nextFloat();

        float item3price;
        out.print("What is the price of " + item3 + "?");
        item3price = keyboard.nextFloat();

        float totalprice;

        out.print ("The total price of your grocery bill is " +(item1price*item1quantity) + (item2price*item2quantity) + (item3price*item3quantity));






        float totalpriceitem1 = item1quantity;
        out.print("The order price of" + totalpriceitem1);




    }
}
