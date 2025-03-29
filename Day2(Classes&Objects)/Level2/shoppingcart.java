import java.util.ArrayList;
class Item{
    String itemName;
    int price, quantity;

    Item(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
class Cart{
    
    ArrayList<Item> cart = new ArrayList<Item>();
    int total = 0;

  void addItem(String itemName, int price, int quantity){
    cart.add(new Item(itemName,price, quantity));
  }

  void removeItem(String itemName){
    for(int i=0; i<cart.size(); i++){
        if(cart.get(i).itemName== itemName){
            cart.remove(i);
        }
    }
  }
  void displayTotal(){
    total = 0;
    for(Item item: cart){
        total = total + (item.price * item.quantity);
    }
    System.out.println("Total is: "+ total);
  }
}

public class shoppingcart {
    public static void main(String[] args) {

       Cart cart = new Cart();
       cart.addItem("mouse", 500, 2);
       cart.addItem("Phone", 30000, 1);
       cart.addItem("laptop",100000,1);
       cart.displayTotal();
       cart.removeItem("mouse");
       cart.displayTotal();
    }
}