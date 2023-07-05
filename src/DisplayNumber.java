public class DisplayNumber implements Runnable {
    @Override
    public void run() {
        System.out.println("Child thread is running");
        for (int i = 0; i <10;  i++) {
            System.out.println("child "  + " "+ i);
        }
        System.out.println(">>>>>>>>>>>>>>>>");
}
}
