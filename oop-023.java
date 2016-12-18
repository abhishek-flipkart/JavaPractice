//Topic : Static control flow
/* When java program is runned, first the “.class” file is loaded into memory and while loading ,
* the following sequence of steps take place.
*
* 1. Identification of static members from top to bottom
*    Static members : static variable, static method, static  block.
*    In identification phase, all the static variables are given default values by the JVM.
*    In this phase, a=0 and b=0.
*
* 2. Execution of static variable assignments and static blocks from top to bottom 
*    In this phase a, b variables are given original values by the JVM
*    a=10, b=20
*    
* 3. Execution of main method(13 to 15).
*
*/

class Test {
    
    // Step 1 : (Indentification and default value assignment) int a = 0
    // Step 7 : a = 10
    static int a = 10;
    
    // Step 2 : (Indentification)
    static {
        // Step 8 : Method call 
        m1();
        
        // Step 10 : print PFSB
        System.out.println("PFSB");
        
        //System.out.println(b);      //CE : RIWO(direct access) illegal forward refernce
    }
    
    // Step 3 : (Indentification)
    static void m1() {
        
        // Step 9 : print b equal to 0
        // Step 14 : print b equal to 20
        System.out.println(b);
    }
    
    // Step 4 : (Indentification)
    public static void main(String[] args) {
        
        // Step 13 : call to m1()
        m1();
        
        // Step 15 : print main method
        System.out.println("main method");
    }
    
    // Step 5 : (Indentification)
    static {
        // Step 11 : print PSSB
        System.out.println("PSSB");
    }
    
    // Step 6 : (Indentification and default value assignment) int b =0
    // Step 12 : b =20
    static int b = 20;
}

/*
Output
-------------
0
PFSB
PSSB
20
main method
*/

