//Topic : Method Overridding

/*
* Overridding : Parent class method are by default inherited to the child, but if the child class is not satisfied
* with the inherited method then child class can rewrite the method. 
*
* In overloading method resolution is taken care by compiler based on the argument reference type.
* In overridding method resolution is taken care by JVM based on the runtime object(actual object).
*
* In overloading method name must be same 
* In overridding method signature must be same
*
* In overridding scope of the access modifier can't be reduced.
* Access modifiers : public > protected > <default> > private
*/


class Parent {
    void m1 (int a) {
        System.out.println("Parent version");
    }
    void m2 (int a) {
        System.out.println("Parent m2 version");
    }
}

class Child extends Parent {
    void m1 (int a) {
        System.out.println("Child version");
    }
    public static void main(String[] args) {
        Parent p1 = new Parent(); 
        p1.m1(10); // Parent version

        Child c1 = new Child();
        c1.m1(20);  // Child version  // Here parent method is overridden by child method
        c1.m2(20);  // Parent m2 version // since it is inherited and their is no child method to override
        
        
        Parent p2 = new Child();    // parent refence can hold child object
        p2.m1(20);  // Child version // Since child method(m1) will overide the parent method(m1)
        p2.m2(39);  // Parent m2 version 
    }
    
}