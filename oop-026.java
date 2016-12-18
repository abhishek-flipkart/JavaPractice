//Topic : Static control flow
// RIWO state : Read Indirect Write Only
// RW : Read Write state
/*
* Note :
*--------------------------
* 1. A variable is said to be accessed directly when it is called from within the block
*    and indirectly when is called from with the method.
*
* 2. RIWO state is when a complier assigns default value. RW state is when actual value has been
*    assigned to the variable.
*
* 3. RIWO state variables can't be accessed directly from the block throws CE
*    RW state variables can be accessed form anywhere.
*/





class Test {
    
    //Step 1 : a = 0 (RIWO state)
    //Step 6 : a = 10 (RW state)
    static int a = 10;
    
    
    //Step 2
    static {
        
        //Step 7 : print 10 (a in RW state)
        System.out.println(a);
        
        
        
        // Step 8
        m1();
        
        
        
        
        //System.out.println(b); // (direct read)
                                 // CE :illegal forward reference
                                 // Here b is in RIWO state so it gets CE
    }
    
    
    
    //Step 3
    static void m1(){
        
        //Step 9 : print 0 (b in RIWO state)
        System.out.println(b);   // (indirect read)
    
    }
    
    
    //Step 4
    public static void main(String[] args){
        
    }
    
    
    //Step 5 : b = 0 (RIWO state)
    //Step 10 : b = 20 (RW state)
    static int b = 20;
}