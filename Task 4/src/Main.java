import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Whats your order");
        Scanner myObj = new Scanner(System.in);  // Get username
        String orders = myObj.nextLine();
        System.out.println("Whats your table number");
        String tables = myObj.nextLine();
        if (Objects.equals(orders, "“pepperoni pizza")){
            System.out.print(Meal.getAd()+Restaurant.checkout(orders,tables));
        } else if (Objects.equals(orders, "“burger”"))
            System.out.print(Meal.getAd()+Restaurant.checkout(orders,tables));
    }
}