// Topic : Inheritance

/*
* Is-a relationship (Inheritance) 
* Using : extends "keyword"
* advantage : code reusablity
* Object class is the root class in Java. Every class is by default child class of Object class
* No multiple ineritance, only multilevel inheritance
* 
* Expect private data memebers/member functions everything(functions,variables,blocks) gets inherited
*
*/


class Engine {
    
    {
         System.out.println("Engine instance block");
    }
    
    static {
        System.out.println("Engine static block");
    }
    
    protected Engine () {
        System.out.println("Engine Constructor");
    }
    
    void startEngine () {
        System.out.println("Engine started");
    }
}

class Bike extends Engine {
    void bikeColor() {
        System.out.println("Bike color is red");
    }
    
    public static void main(String[] args) {
        Bike honda = new Bike();
        honda.startEngine();
        honda.bikeColor();
    }
}

class Car extends Engine {
    void carColor () {
        System.out.println("Car Color is white");
    }
    
    public static void main(String[] args) {
        Car honda = new Car();
        honda.startEngine();
        //honda.bikeColor();          // CE : This method is not available neither in Car/Engine class
    }
}



class Aeroplane extends Engine {
    void fly () {
        System.out.println("Started flying");
    }
    
    public static void main (String[] args) {
        
        Engine e = new Aeroplane(); // Parent class refence can hold child class object but not vice versa.
                                    // Aeroplane a = new Engine(); 
        e.startEngine();
        //e.fly();                    // CE : Since e is a reference of type "engine class" and fly is not
                                    // available in engine class
        
        
    }
}