package com.virtusa.Finally;

public class FinallyExample {
    static int number = 0;
    public static void main(String[] args) {

        System.out.println("Try Block returns: " + methodReturningValue());
        System.out.println("Value of i after method execution is " + number);
    }


    static int methodReturningValue()
        {


            try
            {
                number = 1;
                System.out.println("try block is about to return with an i value of: "+  number);
                return number;
            }
            catch (Exception e)
            {
                number = 2;
                return number;
            }
            finally
            {
                number = 3;
                System.out.println("Finally block: i has been changed to 3");
            }
        }
    
}
