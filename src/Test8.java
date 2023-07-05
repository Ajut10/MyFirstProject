public class Test8 implements Runnable {
    
    public static void main(String[] args) {
        Test8 obj = new Test8();
        Thread thread =new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");

    }
    public void run() {
        System.out.println("this code is runniing  in the thread");
    }
    
}
