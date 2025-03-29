class circles{
    int radius;

    circles(){
        System.out.println("Radius= 35");
    }
    circles(int radius){
        this();
        System.out.println("Radius= "+radius);
    }
}
public class circle {
    public static void main(String[] args) {
        new circles(20);
    }
}