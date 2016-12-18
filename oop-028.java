/*
* Topic : Instance control flow
* Whenever we execute a java program first static control flow takes place and as part of static
* control if we say new, then instance control flow takes place.
* Instance control flow is starts only when a new keyword is used to create object
*/

class Test
{
    int a = 10;
    
    {
        m1();
        System.out.println("FIB");
    }
    
    Test()
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

//Output
//main method