class A {
    
}

class B extends A {
    
}

class C extends B  {
    
}


class D extends B {
    
}


class E {
    public static void main(String[] args) {
        C c1 = new C();
        D d1 = new D();
        B b1 = new C();
        B b2 = new D();
        
        A a1 = new C();
        A a2 = new D();
    }
}