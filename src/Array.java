import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        int a[]= new int[5];
        Scanner array = new Scanner(System.in);
         
        for(int i=0;i<5;i++){
            System.out.println("value of "+ i +":" );
            a[i]=array.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" value of array is: " + a[i]);
        }
    }
}
