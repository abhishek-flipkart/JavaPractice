// Method Overridding

/*
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
*/


class Parent {
    static void m1(){
        System.out.println("Parent class: m1 : static");
    }
    
    void m2() {
        System.out.println("Parent class: m2 : non-static");
    }
    
    final void m3(){
        System.out.println("Parent class: m3 : final");
    }
    
    final void m3(int a){
        System.out.println("Parent class: m3 with arg: final");
    }
}

class Child extends Parent {
        
    static void m1(){       // Didn't Overridding since its static
        System.out.println("Child class: m1 : static");
    }
    
    void m2() {             // Overridding since its non static
        System.out.println("Child class: m2 : non-static");
    }
    
    final void m3(){        // CE : final method can't be overidden
        System.out.println("Child class: m3 : final");
    }
    
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        c.m2();
        c.m3();
        c.m3(5);
        System.out.println("----------------Overidding--------------");
        Parent p = new Child();
        p.m1();
        p.m2();
        p.m3();
    }
}