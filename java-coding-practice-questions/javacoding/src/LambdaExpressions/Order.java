package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
    private double price;
    private String status;
    
    public Order(int id, double price, String status) {
        this.id = id;
        this.price = price;
        this.status = status;
    }
    
    public int getId() {
        return id;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getStatus() {
        return status;
    }
    
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, 25000.0, "PENDING"));
        orders.add(new Order(2, 105000.0, "ACCEPTED"));
        orders.add(new Order(3, 10000.0, "COMPLETED"));
        orders.add(new Order(4, 7000.0, "PENDING"));
        
        // Filter and print orders based on two criteria
        orders.stream()
              .filter(order -> order.getPrice() > 10000.0 && 
                               (order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED")))
              .forEach(order -> System.out.println("Order ID: " + order.getId() + ", Price: " + order.getPrice() + ", Status: " + order.getStatus()));
    }


}
