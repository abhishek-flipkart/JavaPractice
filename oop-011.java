//Topic : Method Overridding

class Parent {
    private void m1 () {
        System.out.println("parent method");
    }
}

class Child extends Parent {
    void m1 () {        // This isn't inherited method, its Child own method
        System.out.println("Child method");
    }
    
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
    }
}