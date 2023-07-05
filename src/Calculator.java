class Calculator implements MathOperation, Mathop2 {
    public void add(int a,int b) {
        System.out.println("add"+(a+b));
        
    }
    public void subtract(int a,int b) {
        System.out.println("subtract"+(a-b));
    }
    public void multi(int a,int b) {
        System.out.println("multi"+(a*b));
    }
    public void divison(int a,int b) {
        System.out.println("divison"+(a/b));
        
    }
}