// Topic : Inheritance

/*
* Has-a relationship (Inheritance) 
* No basic keyword
* advantage : code reusablity
*/


class Animal {
    
    public void canTalk() {
        System.out.println("Can talk");
    }
    
}


class Human {
    public static void main(String[] args) {
        Animal h = new Animal(); // Has a relationship
        h.canTalk();
    }
}