//Topic : Instance control flow

class Test {
    int a = 10;
    
    {
        //System.out.println(b); RIWO state
        m1();
    }
    
    int b = 20;
    
    void m1() {
         System.out.println(b);
    }
    
    public static void main(String[] args){
        
    }
}

class NewTest
{
    int a = 10;
    
    {
        m1();
        System.out.println("FIB");
    }
    
    NewTest()
    {
        System.out.println("constructor");
    }
    
    
    void m1()
    {
        System.out.println(b);
    }
    
    
    public static void main(String args[]) {
        System.out.println("main method");
    }
    
    
    {
        System.out.println("SIB");
    }   
    
    
    int b = 20;
}