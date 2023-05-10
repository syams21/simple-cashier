import java.util.Scanner;

public class SimpleCashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the price of the item: ");
        long price = sc.nextLong();

        System.out.print("enter the number of items: ");
        int number = sc.nextInt();

        long total = price * number;

        System.out.println("total price: " + total);

        System.out.print("enter the amount paid: ");
        long pay = sc.nextLong();

        if (pay >= total) {280
            long change = pay - total;
            
            System.out.println("total change: " + change);
        } else {
            System.out.println("you've entered it wrong!");
        }

    }
}