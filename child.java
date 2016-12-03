class Parent {
    
    static void m1() {
        System.out.println("parent Static m1 method");
    }
    
    public static void main(String[] args) {
        System.out.println("Parent main method");
        Parent.m1();
        Child.m1();
        Child c = new Child(); // has-a relaionship
        c.m3();
    }
}

class Child extends Parent {
    // Static method gets inherited
    static void m1() {
        System.out.println("child Static m1 method");
    }
    
    void m3() {
        System.out.println("Instance m3 method");
    }
}