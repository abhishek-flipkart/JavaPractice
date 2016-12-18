/*
* Topic : Instance control flow in parent-child(IS-A relationship)
* Whenever we execute a java program first static control flow takes place and as part of static
* control if we say new, then instance control flow takes place.
* Instance control flow is starts only when a new keyword is used to create object
*
*
* Instance Control Flow
* ------------------------
* 1. Identification of instance members from parent to child
*    Instance members : instance variable, instance method, instance  block, constructor.    
*    In identification phase, all the instance variables are given default values by the JVM.
*
*
* 2. Execution of instance variable assignments and instance blocks in parent .
*    In this phase a, b variables are given original values by the JVM.
*
* 3. Execution of parent constructor
*
* 4. Execution of instance variable assignments and instance blocks in child .
*
* 5. Execution of child constructor
*
*
*
* Note : Static control flow is one time activity(at .class file loading time) but instance control flow is repeated
* activity(on instance creation)
*
*/

class Parent {
    
    // Step 3,15
    int a = 10;
    
    
    // Step 4
    {
        //System.out.println(b); // CE : illegal forward reference
        m1(); // Step 16
        System.out.println("FIB"); // Step 18
    }
    
    
    // Step 5
    Parent () {
        System.out.println("Parent constructor"); // Step 21
    }
    
    
    // Step 6
    void m1() {
        System.out.println(b); // Step 17
    }
    
    // Step 7
    {
        System.out.println("SIB"); // Step 19
    }
    
    
    // Step 8,20
    int b = 20;
}

class Child extends Parent {
    
    // Step 9,22
    int x = 20;
    
    
    // Step 10
    {
        //System.out.println(b); // CE : illegal forward reference
        m2();   // Step 23
        System.out.println("CFIB"); // Step 25
    }
    
    
    // Step 11
    Child () {
        System.out.println("Child constructor");  // Step 28
    }
    
    // Step 12
    void m2() {
        System.out.println(y); // Step 24
    }
    
    
    
    // Note : main method without string array arguments won't run the java program, but doesn't give CE
    // Step 1
    public static void main(String[] args) {
        System.out.println("Here");
        
        Child c = new Child(); // Step 2
        Child c1 = new Child(); // Step 29 (Repeat the same sequence)
        
    }
    
    
    // Step 13
    {
        System.out.println("CSIB"); // Step 26
    }
    
    
    // Step 14, 27
    int y = 40;
    
}