class items{
    int itemcode;
    String itemname;
    int price;
    int num;

    items(int itemcode, String itemname, int price, int num){
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.price = price;
        this.num = num;
    }

    void calculatecost(){
        System.out.println("Itemcode: "+itemcode);
        System.out.println("Itemname: "+itemname);
        System.out.println("price: "+price);
        System.out.println("The price of "+num+" "+itemname+" is: "+(price*num));
    }
}
public class trackinventory {
    public static void main(String[] args) {
        items item = new items(001, "water", 50, 10);
        item.calculatecost();
    }
    
}