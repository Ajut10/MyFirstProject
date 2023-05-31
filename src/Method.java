import java.util.Scanner;

public class Method {
    // public static void Add() {
    //     int a=10,b=20;
    //     System.out.println("Sum= "+(a+b));
    // }
    // public static void main(String[] args) {
    //     Method m=new Method();
    //     m.Disp();   
    //     Method.Add();
    //     Method.Add();
    //     Method.Add();
    //     Method.Add();
    // }
    // void Disp(){
    //     System.out.print("hello world\n");
    // }
    
    // //method return type
    // public static int square(int num) {
    //     return num*num;
        
    // }
    // public static void main(String[] args) {
    //     int n=2;
    //     Method s=new Method();
    //     int result=s.square(n);
    //     System.out.println("Sqaure of "+n+" = "+result);
    // }
    
    // add
    int a,b,add,sub,div,multi;
    public static void main(String[] args) {
        Method n=new Method();
        n.input();
        n.process();
        n.output();
        
    }
    void input(){
      Scanner num=new Scanner(System.in);
      System.out.println("enter two no:");
    a=num.nextInt();
      b=num.nextInt();
    }
    void process(){
       add=a+b;
       sub=a-b;
       multi=a*b;
       div=a/b;
    }
    void output(){
       System.out.println("add = "+ add);
       System.out.println("subtract = "+ sub);
       System.out.println("Product = "+ multi);
       System.out.println("Division = "+ div);
    }
    
    // //largest no
    // public static void larg(int x,int y) {
    //     if(x>y)
    //     System.out.println(x+ " is the greatest");
    //     else
    //     System.out.println(y+ " is the greatest");
        
    // }
    // public static void main(String[] args) {
    //     Scanner num =new Scanner(System.in);
    //     System.out.println("enter two no:");
    //     int n=num.nextInt();
    //     int m=num.nextInt();
    //     Method.larg(n, m);
    // }
    
    //oddEven
    // public static void main(String[] args) {
    //     Scanner num= new Scanner(System.in);
    //     System.out.println("enter a no");
    //     int n= num.nextInt();
    //     Method obj= new Method();
    //     obj.oddEven(n);
        
    // }
    // public static void oddEven(int m) {
    //     if(m%2==0)
    //     System.out.println("even");
    //     else
    //     System.out.println("odd");
    // }
    
}   
