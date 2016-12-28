// Topic : Constructor
// Note : If class is public the file name must be same as public class name
// oop-034.java

class ParentTest {
    
    protected ParentTest() {
        System.out.println("No Arg PArent");
    }
    
    protected ParentTest(int a) {
        System.out.println("Int Arg PArent : "+ a);
    }
    
}

public class Test extends ParentTest{
    
    private Test() {
        super();
        System.out.println("Ok");
    }
    
    Test(int a) {
        super(a);
        System.out.println(a);
        
    }
    
    public static void main(String[] args) {
        Test t = new Test(5);
    }
}