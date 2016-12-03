//Topic : Method Signature

/*
* Method Signature : Means method name + argument types(tries to promote to different type if type mismatch)
* A class can't have more than one same signature method.
*
*/


class Test {
    void m1(int a){
        System.out.println("Int type");
    }
    
    int m2(float b){
        System.out.println("Float type");
        return 0;
    }
    
    String m3(Object o) {
        System.out.println("Object type");
        return "a";
    }
    
    
    public static void main(String[] args){
        Test t = new Test();
        t.m1(10);         // Exact match
        t.m1('t');        // char ---- converted/promoted -----> int
        t.m3("Hello");    // String ---- promoted -----> Object
        t.m2(10.5f);      // Exact match
        t.m2(10);         // int --- promoted----> float
        //t.m2(10.5);     //CE : m2(float) <---- given ------ double
    } 
}