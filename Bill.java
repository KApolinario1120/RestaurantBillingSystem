import java.util.ArrayList;

public class Bill {
    private ArrayList<String> orderedFood;
    private ArrayList<Integer> orderedQuantity;
    //Represents the food and quantity ordered
    private double totalCost;
    //Total cost of bill

    public Bill() {
        //ArrayLists created here
        orderedFood = new ArrayList<String>();
        orderedQuantity = new ArrayList<Integer>();
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    //Two arrays give meals ordered and the cost of each
    public void addOrder(String meal, int quantity, String[] dish, double[] cost) {
        orderedFood.add(meal);
        orderedQuantity.add(quantity); //Autoboxing done here
        for (int i = 0; i < dish.length; i++) {
            if (meal.equals(dish[i])) {
                //totalCost initialized to zero when Bill instance is created
                totalCost += quantity * cost[i];
            }
        }

    }
}
