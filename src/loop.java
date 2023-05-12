// import java.util.Scanner;

import java.util.Scanner;

public class loop {
    public static void main(String args[]) {
        // //for loop 
        // int b=0;
        // for(;b<5;b++){
        //     System.out.println("hello");
        // }

        // //reverse of a num
        // int a, rev=0,r;
        // Scanner num= new Scanner(System.in);
        // System.out.println("enter a no:");
        // a= num.nextInt();
        // while(a!=0){
        //     r=a%10;
        //     rev= (rev*10)+r;
        //     a=a/10;
        // }
        // System.out.println("reverse num:" + rev);
        
        // //palindrome
        // int n,pali=0,p;
        // Scanner num = new Scanner(System.in);
        // System.out.println("enter a no");
        // n=num.nextInt();
        // int temp=n;
        // while(n!=0){
        //     p=n%10;
        //     pali=pali*10+p ;
        //     n=n/10;
        // }
        // if(pali==temp)
        // System.out.println( "palindrome" );
        // else
        // System.out.println("not palindrome");

        // prime no upto 100
        int i=1,j=0;
        for(;i<=100;i++){
            int count=0;
            for(j=i;j>=1;j--){
                if(i%j==0)
                count++;
            }
            if(count==2)
            System.out.println(+i);
        }

        // // fiboniccis series
        //     int a,i=0;
        //     int n1=0,n2=1,result=0;
        //     Scanner fibo =new Scanner(System.in);
        //     System.out.println("enter a no");
        //     a= fibo.nextInt();
        //     for(;i<=a;i++){
                
        //         System.out.println( + n1 );
        //         result=n1 + n2;
        //         n1=n2;
        //         n2=result;
        //     }

        // Factorial
        // int n,i=1;
        // int result=1;
        // Scanner num = new Scanner(System.in);
        // System.out.println("enter a num:");
        // n=num.nextInt();
        // for(;i<=n;i++){
        //     result=result*i; 
        // }
        // System.out.println( +result);

        
    }
}
