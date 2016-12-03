//Topic : Overloading

// Child class agrument type will get more priority than parent class argument type.
// Object
//  |--->Papa
//          |---> Son


class Test {
    void m1(Object o) {
        System.out.println("Object version");
    }
    
    void m1(Papa p) {
        System.out.println("Papa version");
    }
    
    public static void main(String[] args) {
        Son s = new Son();
        Test t = new Test();
        t.m1(s); // Papa version (here "Papa" class reference type get more priority then "Object" class refernce   
                 // type) 
    }
}

class Papa {
    
}
class Son extends Papa {
    
}