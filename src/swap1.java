public interface swap1 {
    public static void main(String[] args) {
    //    int a=10; int b=20; int c;
    //    c=a; 
    //    a=b; 
    //    b=c;
    //     System.out.println(a +" " +b);
    int a=10, b=20;
        a=b+a; //10 =20+ 10=30
        b=a-b; //20=30-20=10
        a=a-b; //30=30-10=20
        System.out.println(a +" " +b);
    }
}
