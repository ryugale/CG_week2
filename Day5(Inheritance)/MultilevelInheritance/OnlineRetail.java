class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    void getOrderStatus() {
        System.out.println("Order Placed!");
    }
}
class ShippedOrder extends Order {
    int trackingNumber;
    ShippedOrder(int trackingNumber, int orderId, String orderDate) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    void getOrderStatus() {
        System.out.println("Your Order is Shipped!");
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int trackingNumber, int orderId, String orderDate, String deliveryDate) {
        super(trackingNumber, orderId, orderDate);
        this.deliveryDate = deliveryDate;
    }
    void getOrderStatus() {
        System.out.println("Your Order is Delivered!");
    }
}
public class OnlineRetail {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-3-01");
        ShippedOrder shippedOrder = new ShippedOrder(12345,
                102, "2023-10-02");
        DeliveredOrder deliveredOrder = new DeliveredOrder(67890, 103, "2023-10-03", "2025-3-05");
        order.getOrderStatus();
        shippedOrder.getOrderStatus();
        deliveredOrder.getOrderStatus();
    }
}