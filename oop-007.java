//Topic : Overloading

// Two/more functions with same level of child classes argument, will raise ambiguity error  
// Object
//  |--->Animal
//          |---> Tiger
//          |---> Lion


class Test {
    void m1(Object o) {
        System.out.println("Object version");
    }
    
    void m1(Tiger t) {
        System.out.println("Tiger version");
    }
    void m1(Lion l) {
        System.out.println("Lion version");
    }
    
    public static void main(String[] args) {
        Tiger tr = new Tiger();
        Lion l = new Lion();
        Animal a = new Animal();
        
        Test t = new Test();
        t.m1(tr);           // tiger version
        t.m1(l);            // lion version
        t.m1(a);            // object version (Parent reference i.e.Animal can't be stored by child i.e. Lion/Tiger)
                            // Parent refernce can only be stored by itself and it's parent, here in this case
                            // Animal's parent is Object, so it calls Object version
        
        
        t.m1(null);         // Both Tiger and Lion can hold null reference so ambiguity error(which to call) raise. 
                            // So when Tiger == Lion / a value that suits both child class (Tiger and Lion) causes
                            // ambiguity error.
    }
}

class Animal {
    
}
class Tiger extends Animal {
    
}

class Lion extends Animal {
    
}