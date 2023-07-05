// import javax.lang.model.util.ElementScanner14;

public class Testthrow1 {
    static void validate(int age){
     try{
         
         if(age<18)
            throw new ArithmeticException("not valid age");
        else
        System.out.println("welcome to vote");
    }  catch(Exception e){
        System.out.println("exception");
    }
    finally{
        System.out.println("always executed");
    }
}
    public static void main(String args[]) {
        

            validate(13);
            System.out.println("rest of the code..");
        
    }
}

