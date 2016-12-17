//Topic : Method Overridding

class Parent 
{
    static void m1 () 
    {
        System.out.println("M1 Parent static methods");
    }
    static void m3 () 
    {
        System.out.println("M3 Parent static methods");
    }
    
    void m4(){
        System.out.println("M4 Parent instance method");
    }
    
    final void m5() {
         System.out.println("M5 Parent instance method");
    }
}

class Child extends Parent 
{
    
    static void m1 ()
    {
         System.out.println("M1 Child static methods");
    }
    
    void m4(){
        System.out.println("M4 Child instance method");
    }
    
    
    public static void main(String[] args) 
    {
        Child c1 = new Child();
        c1.m1();            // function hidding hides the parent m1 method(call child)
        c1.m3();            // Inherited static method(call parent)
        c1.m4();            // function hidding hides the parent m4 method(call child)
        c1.m5();            // Inherited the final m5 method(call parent)
        
        Parent p1 = new Child();
        p1.m1();            // Static methods can't be overwritten , will call parent method(call parent)
        p1.m3();            // parent method call (call parent)
        p1.m4();            // Overide the parent method since it's a instance method(call child)
        p1.m5();            // Call to parent final method(call parent)
    }
    
}