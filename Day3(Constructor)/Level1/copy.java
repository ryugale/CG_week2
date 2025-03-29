class person{
    String name;
    
    person(String name){
        this.name = name;
    }
    person(person karun){
        this.name = karun.name;
    }
    public String getname(){
        System.out.println("Name: "+name);
        return name;
    }
}
public class copy {
    public static void main(String[] args) {
        person karun1 = new person("Jawa");
        karun1.getname();
        person karun2 = new person(karun1);
        karun2.getname();
    }
}