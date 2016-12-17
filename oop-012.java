//Topic : Method Overridding

/*
* In overridding, the overridding method and the overridden method must have the same primitive return type.
* If the return type is primitive, then the overidding method must return the same primitive type.
* The return statement can return the same primitive or type that can be promoted to the primitive.
*
*
* If the return type is object(in parent), then the overridding method(in child) must return the same object 
* subclass of the object.
*/

class Parent {
    int m1 () {
        System.out.println("parent method");
        return 10;
    }
}

class Child extends Parent {
    void m1 () {        // return type must be same
        System.out.println("Child method");
    }
    
    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
    }
}