class circle{
    float radius;

    circle(float radius){
        this.radius = radius;
    }

    void getarea(){
        double area = Math.PI *radius*radius;
        double circumference = 2* Math.PI*radius;
        System.out.printf("circumference is %.2f \n",circumference);
        System.out.printf("Area is %.2f",area);
    }
}

public class areaofcircle {
    public static void main(String[] args) {
        circle rad = new circle(3);
        rad.getarea();
    }   
}