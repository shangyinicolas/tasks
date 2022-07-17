import java.util.List;
import java.util.Map;

public class Restaurant {
    List<Meal> menu;
    List<Table>tables;
    Map<Table,List<Order>>orders;



    public List<Meal> displayMenu() {
        return menu;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void takeOrder(Order o){

    }
    public void checkout(Order o){

    }


}
