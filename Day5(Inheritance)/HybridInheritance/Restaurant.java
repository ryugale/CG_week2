interface Worker {
    void performDuties();
}
class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Chef extends Person implements Worker {
    Chef(int id, String name) {
        super(id, name);
    }
    @Override
    public void performDuties() {
        System.out.println("Cooking");
    }
}

class Waiter extends Person implements Worker {
    Waiter(int id, String name) {
        super(id, name);
    }
    @Override
    public void performDuties() {
        System.out.println("Taking Order");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef(1, "John");
        chef.performDuties();
        Waiter waiter = new Waiter(2, "Alice");
        waiter.performDuties();
    }
}