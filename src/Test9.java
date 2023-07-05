public class Test9 {
    public static void main(String[] args) {
        DisplayNumber dn =new DisplayNumber();
        Thread thread= new Thread(dn);
        thread.start();

        System.out.println("main thread is running");

        for (int i = 0; i <10; i++) {
            System.out.println("main"+ Thread.currentThread().getName()+ " " + i);
    }
    System.out.println("main thread ends here");

}
}
