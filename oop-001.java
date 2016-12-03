/*
* Data Hidding
* Using access modifiers
* Public > Protected > <default> > Private
* Advantage data security
*/


/*
* Abstraction
* Hiding implementation details
* Advantage: extensibity/enchancement(implementation can be changed without affecting 
* the abstract layer)
* Can be achieved using interfaces
*/


/*
* Encapsulation
* Binding methods and variables together.
* Advantage : Modularity and code maintainability
*/

class Account {
    int balance = 10000;        // Here the access modifier is <default>
    private int interest = 238;
}

class User {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println("Balance :"+ a1.balance);
        
        
        //Error interset has private access modidifer so it can be accessed outside
        //it's class
        System.out.println("Balance :"+ a1.interest);
    }
}