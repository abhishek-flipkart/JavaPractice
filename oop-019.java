//Topic : Overridding and exception
/*
* If parent method throws checked exception then child class method can throw:
* 1. Same exception
* 2. Subclass of the parent thow exception
* 3. No exception
*
* But it can't throw a checked exception or a boarder exception
*
*
* No restictions on unchecked exception
*/

import java.io.*;

class Parent {
    public void m1() throws Exception {
        
    }
}

class Child extends Parent {
//    public void m1() throws Exception {   //Same exception as parent
//        
//    }
    
//    public void m1() throws IOException { //This exceptions is subclass of parent
//        
//    }
    
//    public void m1() {      // Can also thows no exception
//        
//    } 
    
    public void m1() throws Throwable {     // CE : can't throw super class or different/sibling of parent 
                                            // exception class. It should throw same/subclass/no exception.
        
    }
}