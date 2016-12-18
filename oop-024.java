//Topic : Static control flow in parent-child(IS-A relationship)
/* When java program is runned, first the “.class” file is loaded into memory and while loading ,
* the following sequence of steps take place.(parent .class file is also loaded into memory when * child class is excuted)
* 
* Note : parent .class file is loaded into memory whenever we use new,extends and implements 
* keywords
*
* 1. Identification of static members from parent to child
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
    //Step 1,13
    static int a = 10;
    
    //Step 2
    static {
        m1(); //Step 14
        System.out.println("PFSB"); //Step 16
    }
    
    //Step 3
    static void m1() {
        System.out.println(b); // Step 15
    }
    
    //Step 4
    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }
    
    //Step 5
    static {
        System.out.println("PSSB"); // Step 17
    }
    
    //Step 6,18
    static int b = 20;
}

class Child extends Parent {
    
    //Step 7,19
    static int x = 30;
 
    //Step 8
    static {
        m2(); // Step 20
        System.out.println("CFSB"); //Step 22
    }
    
    //Step 9
    static void m2() {
        System.out.println(y); // Step 21,26
    }
    
    //Step 10
    public static void main(String[] args) {
        m2();   //Step 25
        System.out.println("child main method"); //Step 27
    }
    
    //Step 11
    static {
        System.out.println("CSSB"); //Step 23
    }
    
    
    //Step 12, 24
    static int y = 40;
}


/*
Output
------------
0
PFSB
PSSB
0
CFSB
CSSB
40
child main method
*/
