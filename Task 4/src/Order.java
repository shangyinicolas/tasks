import java.util.List;

public class Order {
    List<Meal> meals;
    Table table;

    public List<Meal> getMeals() {
        return meals;
    }

    public Table getTable() {
        return table;
    }

    public float getPrice(){
        return Meal.getPrice();
    }
}
