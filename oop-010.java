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
* In overridding scope of the access modifier can't be reduced, can be increased or same.
* Access modifiers : public > protected > <default> > private
*
* In overridding, the overridding method and the overridden method must have the same primitive return type.
* If the return type is primitive, then the overidding method must return the same primitive type.
* The return statement can return the same primitive or type that can be promoted to the primitive.
*
* If the return type is object(in parent), then the overridding method(in child) must return the same object 
* subclass of the object.
*
* There are 8 non-access modifiers :
* 1. static (methods with static can't be overridden)
* 2. final (methods with final can't be overridden) throw CE
* 3. abstract
* 4. native
* 5. strictfp
* 6. synchronized
*
* Only for variables
* 7. volatile
* 8. transient
*
*
*
* In overridding, if the overidden method throws an checked exception(compile-time), then the overidding method
* must throw either of these:
* 1. Same exception
* 2. Child class exception
* 3. No exception
*/

class Animal {
    
    void canFly() {     // Here access modifier is <default>
        System.out.println("Can Fly");
    }
}

class Human extends Animal {
    
    protected void canFly() {     // This can be either <default> or more than <default>. Not less than, if assgined 
                                  // less throws error "attempting to assign weaker access privileges"
        System.out.println("Cann't Fly");
    }
    
    public static void main(String[] args) {
        Human h = new Human();
        h.canFly();
    }
}