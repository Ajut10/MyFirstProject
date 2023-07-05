public class StringExample {
    public static void main(String[] args) {
        String s1="java";
        char[] ch = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s3 = new String(ch);
        String s4 = new String("example");
        System.out.println(s1 +" " + s3 +" "+ s4);
        System.out.println(s1.length());
        
    }
}
