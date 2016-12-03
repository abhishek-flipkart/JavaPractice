// Topic : Overloading

/*
*  Method resolution is taken care by compiler based on the argument reference type.
*
*/

class Test {
    void m1(Animal a) {
        System.out.println("Animal Version");
    }
    
    void m1(Tiger t) {
        System.out.println("Tiger Version");
    }
    
    public static void main(String[] args){
        Test t = new Test();
        Animal a1 = new Animal();
        Tiger tr = new Tiger();
        Animal a2 = new Tiger();
        t.m1(a1); // Animal version
        t.m1(tr); // Tiger version
        t.m1(a2); // Animal version (here argument reference type is Animal , so animal version is called)
    }
}


class Animal {
    
}

class Tiger extends Animal {
    
}