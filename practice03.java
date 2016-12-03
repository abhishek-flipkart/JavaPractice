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
        c1.m1();            // function hiding
        c1.m3();
        
        Parent p1 = new Child();
        p1.m1();            // function hiding, overridding doesn't work in static 
        p1.m4();
    }
    
}