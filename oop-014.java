//Topic : Method Overridding

/*
* In overridding, the overridding method and the overridden method must have the same primitive return type.
* If the return type is primitive, then the overidding method must return the same primitive type.
* The return statement can return the same primitive or type that can be promoted to the primitive.
*
* If the return type is object(in parent), then the overridding method(in child) must return the same object 
* subclass of the object.
*/

class Parent {
    Object m1 () {
        System.out.println("parent method");
        return 10;
    }
}

class Child extends Parent {
    String m1 () {        // return type is child class object of return of overridden method not superclass
        System.out.println("Child method");
        return "c";     // return statement can return value that can be promoted to the return type of the method
    }
    
    public static void main(String[] args) {
        Parent p = new Child(); // Overridding
        p.m1();
    }
}