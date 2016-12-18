/*
* Topic : Instance control flow in two different class(HAS-A relationship)
*
*/

class Test {
    
    // Step 4,10
    int a = 10;
    
    
    // Step 5
    {
        m1();  // Step 11
        System.out.println("TFIB");  // Step 13
    }
    
    // Step 6
    Test () {
        System.out.println("Test constructor"); // Step 16 
    }
    
    // Step 7
    void m1() {
        System.out.println(b); // Step 12
    }
    
    
    // Step 8
    {
        System.out.println("TSIB"); // Step 14
    }
    
    // Step 9,15
    int b = 20;
}

class NewTest {
    
    // Step 19,25
    int x = 30;
    
    
    // Step 20
    {
        m2();  // Step 26
        System.out.println("NFIB");  // Step 28
    }
    
    
    // Step 21
    NewTest () {
        System.out.println("NewTest constructor"); // Step 31
    }
    
    // Step 1
    public static void main(String[] args) { 
        System.out.println("Ok"); // Step 2
        Test t = new Test(); // Step 3
        
        System.out.println("-----------------------------"); // Step 17
        
        NewTest nt = new NewTest(); // Step 18
    }
    
    // Step 22
    void m2() {
        System.out.println(y); // Step 27
    }
    
    // Step 23
    {
        System.out.println("TSIB"); // Step 29
    }
    
    // Step 24,30
    int y = 40;
    
}

/*
Output
======================
Ok
0
TFIB
TSIB
Test constructor
-----------------------------
0
NFIB
TSIB
NewTest constructor
NewTest constructor
*/