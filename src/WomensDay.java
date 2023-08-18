import java.util.Scanner;

public class WomensDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        if (gender.equals("Woman")) {
            System.out.println("All the best for women's day, you get 20% discount in the contents of the basket");
            System.out.println("Enter name");
        }else{
            System.out.println("Basket contents");
        }String name = scanner.nextLine();
        if (name.equals("Beata")) {
            System.out.println("Beata all the best for a double occasion, you get 30% discount in the contents of the basket");
        }else{
            System.out.println("Basket contents");
        }
    }
}
