public class Factorial {
   
    public static void main(String[] args) {
        int f,n=10;
       Factorial fa = new Factorial();
        f=fa.fact(n);
        System.out.println("factorial "+ f);
    }
    public int fact(int n) {
        if(n==0 ||n==1)
	return 1;
	else
	return(n*fact(n-1));
        
    }
    
}
