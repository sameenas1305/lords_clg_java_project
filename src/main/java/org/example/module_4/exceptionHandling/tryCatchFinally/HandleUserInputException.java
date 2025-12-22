package org.example.module_4.exceptionHandling.tryCatchFinally;

import java.util.Scanner;

public class HandleUserInputException {
    public static void main(String[] args) {
        System.out.println("program started");
        Scanner sc=new Scanner(System.in);
        String[] name={"alice","bob","charlie"};
        boolean run=true;
        do{
            System.out.println("Enter an index to acces the name array[0-2]:");
            int index=sc.nextInt();
            try{
                System.out.println("name at index"+index+" is "+name[index]);
            }
            catch(Exception e){
                System.out.println("Invalid index");
            }
            System.out.println("Do you want to continue?(true/false):");
            run=sc.nextBoolean();
        }while(run);
        sc.close();
        System.out.println("Program ended");
    }
}
