//Topic type casting

/*
* A b = (C) d
*
* Rule 1 : Their must be some relationship between C and d , parent to child/ child to parent/ same.
* Rule 2 : C must be the same or derived class of A
* Rule 3 : The underlying object in d , must be same or derived class of C
*/


class A {
    
}
class B extends A {
    
}

class C extends B {
    
}

class Manager {
    
    public static void main(String[] args) {
        Object o = new Object();
        A a1 = new A();
        B b1 = new B();
        C c1 = new C();
        
        Object o1 = (A) c1;     
        
        //A a2 = (Object) b1; // Object can't be converted to A @ CE
        
        //A a3 = (B) a1;  // ClassCastException @ RE
        
    }
}