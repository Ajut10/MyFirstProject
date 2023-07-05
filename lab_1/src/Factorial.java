import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i=1,f=1,n;
        System.out.println("enter a number");
        n = num.nextInt();
        for(;i<=n;i++) {
            f=f*i;
    }
    System.out.println("factorial= "+f);
}
}
