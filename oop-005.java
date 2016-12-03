//Topic : Method Overloading

/*
* Method Signature : Means method name + argument types
* Method Overloading : Two or more methods in a class have same name but different argument types
* Method resolution is taken care by compiler based on the argument reference type.
* 
*
* Case 1 : While resolving overloaded methods, if exact method match is not available, then compiler doesn’t raise 
* CE immediately, first compiler promotes the argument to the next level and checks whether matching method is 
* available or not, if available then that method will be executed otherwise compiler promotes the argument to the 
* next level once again, this process will be continued until all possible promotions are over.still if matching 
* method is not available then only it’s a CE, this process is called automatic promotion in overloading.
*
* Case 2 : In overloading exact method match gets high priority.
* 
* Case 3 : Child class agrument will get more priority than parent class argument type.
* 
* Case 4 : If two or more functions with same level of child classes argument
*/




class Test {
    
    void m1(float a) {
        System.out.println("Float arg");
    }
    
     void m1(long a) {
        System.out.println("long arg");
    }
    
    void m1(String a) {
        System.out.println("String arg");
    }
    
    void m1(Object b) {
        System.out.println("Object arg");
    }
    
    void m1(StringBuffer c){
        System.out.println("StringBuffer arg");
    }
    
    
    void add(int a, float b) {
        System.out.println("Int-float version");
    }
    
     void add(float a, int b) {
        System.out.println("Float-int version");
    }
    
    public static void main(String[] args){
        Test t = new Test();
        t.m1(10);
        t.m1("sai");
        t.m1(10.5f);
        t.m1('a');
        t.m1(10.5);
        //t.m1(null);  // Here, null can be promoted to Object, String, StringBuffer.
                     // Object (Parent)
                     //   |----->String (Child)
                     //   |----->StringBuffer (Child)
                     //
                     //  Child class agrument will get more priority than parent class argument type, but here
                     //  there are two functions with same level of child classes argument, so it will raise 
                     //  ambiguilty error.
        
        t.add(5,10.5f); //Exact match
        t.add(10.5f,5); //Exact match
        //t.add(10,10);   // Ambiguity since both add() are eligible
    }    
}