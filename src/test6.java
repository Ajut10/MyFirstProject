public class test6  extends Thread{
    public static void main(String[] args) {
        test6 t = new test6();
        t.run();
    }
    public void run(){
        System.out.println("running in a thread");
    }
}
