//Topic : Overridding and access modifiers

class Parent {
    int age = 80;
    int health = 35;
    void getAge() {
        System.out.println("Call from parent. Age is "+this.age);
    }
    
}

class Child extends Parent {
    private int age = 20;
    
    void getAge() {
        System.out.println("Call from child. Age is "+this.age);
    } 
    
    void getHealth() {
        System.out.println("Call from child. Health is "+this.health);
    }
    
}

class Test {
    
    public static void main(String[] args) {
        
        Parent p1 = new Parent();
        p1.getAge();
        System.out.println("Parent----"+p1.age);
        
        Child c1 = new Child();
        c1.getAge();                // Shadowing occurs here
        c1.getHealth();             // inherited
       // System.out.println("Child----"+c1.age); //direct access not allowed since it is private.
                                                // Private members can't be accessed outside the class directly
        
        Parent p2 = new Child();
        p2.getAge();                //Overidding parent method
        System.out.println("Parent----"+p2.age);    // Direct acess parent variable and instance variable can't be
                                                    // overidden
        
    }
}