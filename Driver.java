import java.util.ArrayList;

public class Driver {
        public static void main(String[] args) {
            //Dish and cost are in same order
            String[] dish =  {"Sandwich", "Coffee", "French Fries", "Salad"};;
            double[] cost =  {6.5, 3.2, 4.0, 3.5};
            Bill myBill = new Bill();
            //Pass copies of array references
            myBill.addOrder("Sandwich", 2, dish, cost);
            myBill.addOrder("Coffee", 2, dish, cost);
            myBill.addOrder("French Fries", 1, dish, cost);
            myBill.addOrder("Salad", 1, dish, cost);
            myBill.getOrder();
            System.out.println(myBill.getTotalCost());
        }

}
