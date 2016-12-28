class Test {
    Test() {
        System.out.println("No arg");
    }
    
    Test(int a) {
        this();
        System.out.println("Ok");
    }
    
    public static void main(String[] args) {
        Test t = new Test(5);
    }
}