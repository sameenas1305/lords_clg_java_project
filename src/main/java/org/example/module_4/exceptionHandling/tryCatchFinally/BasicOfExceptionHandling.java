package org.example.module_4.exceptionHandling.tryCatchFinally;

public class BasicOfExceptionHandling {
    public static void main(String[] args) {
        System.out.println("program started");
        int res=0;
        System.out.println("Dividing 10 by 0");
        try{
            res=10/0;
        }
//        catch(ArithmeticException e){
//            System.out.println("Arithmetic Exception");
//        }
        catch(Exception e){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Program finished");
        }
        System.out.println(("completed"));
    }
}
