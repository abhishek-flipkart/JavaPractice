//Topic : Static control flow in two different class(HAS-A relationship)
/* When java program is runned, first the “.class” file is loaded into memory and while loading ,
* the following sequence of steps take place.
* 
* Note : .class file is loaded into memory whenever we use new,extends and implements 
* keywords and whenever .class file is loaded into memory static blocks, variables gets executed.
*
* 1. Identification of static members in the complied class.
*    Static members : static variable, static method, static  block.
*    In identification phase, all the static variables are given default values by the JVM.
*
* 2. Execution of static variable assignments and static blocks from parent to child 
*    In this phase variables are given original values by the JVM
*    
* 3. Execution of child main method
*
*/

class Parent {
    
    static int a = 10; // Step 2.8.1.1, 2.8.2.1
    
    static {           // Step 2.8.1.2
        m1();          // Step 2.8.2.2
        System.out.println("PFSB"); // Step 2.8.2.4
    }
    
    static void m1() {  // Step 2.8.1.3
        System.out.println(b); // Step 2.8.2.3
    }
    
    
    public static void main(String[] args) {    // Step 2.8.1.4
        m1();
        System.out.println("main method");
    }
    
    static {        // Step 2.8.1.5
        System.out.println("PSSB"); // Step 2.8.2.5
    }
    
    static int b = 20; // Step 2.8.1.6, 2.8.2.6
}

class Child {
    
    static int x = 30; // Step 1.1, 2.1
 
    static {           // Step 1.2
        m2();          // Step 2.2
        System.out.println("CFSB"); // Step 2.4
    }
    
    static void m2() { // Step 1.3
        System.out.println(y); // Step 2.3,3.0
    }
    
    public static void main(String[] args) {  // Step 1.4
        
        Parent p1 = new Parent();  // Step 2.7 This loads Parent .class file into memory so all                              // static blocks, variables get excuted(static control flow)
        
        
        
        Parent p2 = new Parent();  //Ignore this step since no more Parent .class file loading
                                   // since static control flow only once at the time of class 
                                   // loading.
        
        m2();                      // Step 2.9
        
        System.out.println("child main method"); // Step 3.1
    }
    
    static {    // Step 1.5
        System.out.println("CSSB"); // Step 2.5
    }
    
    static int y = 40;  // Step 1.6, 2.6
}


/*
Output
------------
0
CFSB
CSSB
0
PFSB
PSSB
40
child main method
*/
