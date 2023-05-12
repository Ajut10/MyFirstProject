import java.util.Scanner;

public class Decision_making {
    public static void main(String[] args) {
        Scanner choice= new Scanner(System.in);
        System.out.println("choose an operator: +,-,*,/");
        char ch=choice.next().charAt(0);
        System.out.println("enter two values:");
        int a=choice.nextInt();
        int b=choice.nextInt();
        int result;
        switch (ch) {
            case '+':
            result=a+b;
                System.out.println("sum= " + result );
                break;
            case '-':
            result=a-b;
            System.out.println("diff= " +result);
            break;
            
            case '*':
            result=a*b;
            System.out.println("product= " +result);
            break;
            
            case '/':
            result=a-b;
            System.out.println("divide= " +result);
            break;
        
            default:
            System.out.println("wrong choice");
                break;
        }
        
    }
}
