class Animal {
    void eat() {
        System.out.println("generic eating, overridden method");
    }
}

class Tiger extends Animal{
    void eat() {
        System.out.println("tiger eats, overridding method");
    }
    
    void eat(Nonveg n) {
        System.out.println("tiger eats, nonveg only");
    }
    
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        
        Animal a2 = new Tiger();
        a2.eat();                   //Overridding 
        a2.eat(new Nonveg());       // CE: method eat in class Animal doesn't take arguments. 
                                    // This will not call to Tiger eat method.
    }
}


class Nonveg {
    
}