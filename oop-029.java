/*
* Topic : Instance control flow
* Whenever we execute a java program first static control flow takes place and as part of static
* control if we say new, then instance control flow takes place.
* Instance control flow is starts only when a new keyword is used to create object
*
*
* Instance Control Flow
* ------------------------
* 1. Identification of instance members from top to bottom
*    Instance members : instance variable, instance method, instance  block, constructor.    
*    In identification phase, all the instance variables are given default values by the JVM.
*
*
* 2. Execution of instance variable assignments and instance blocks from top to bottom .
*    In this phase a, b variables are given original values by the JVM.
*
* 3. Execution of constructor
*/



class Test
{
    // Step 2.1 : a = 0 (RIWO state)
    // Step 2.7 : a = 10 (RW state)
    int a = 10;
    
    
    // Step 2.2
    {
        m1(); // Step 2.8
        System.out.println("FIB"); // Step 3.0
    }
    
    
    // Step 2.3
    Test()
    {
        System.out.println("constructor"); // Step 3.3
    }
    
    // Step 2.4
    void m1()
    {
        System.out.println(b); // Step 2.9 : print b equal 0
    }
    
    // Step 1
    public static void main(String args[]) {
        
        // Step 2
        Test t = new Test();                // Started instance control flow since we create an instance
        
        
        System.out.println("main method");  // Step 4
    }
    
    // Step 2.5
    {
        System.out.println("SIB"); // Step 3.1
    }   
    
    // Step 2.6 : b = 0(RIWO state)
    // Step 3.2 : b = 20(RW state)
    int b = 20;
}

/*
Output
--------------
0
FIB
SIB
constructor
main method
*/