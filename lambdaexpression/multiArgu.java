
package com.mycompany.lambdaexpression;


public class multiArgu 
{
    interface FuncInter1 
    {
        int operation(int a, int b);
    }

   
    interface FuncInter2 
    {
        void sayMessage(String message);
    }

    public static void main(String args[])
    {
    
      
         FuncInter1 add = (int x, int y) -> x + y;

        FuncInter1 multiply = (int x, int y) -> x * y;
        
    
        FuncInter2 obj = message
            -> System.out.println("Hello everyone " + message);
        obj.sayMessage("how are you?");
    }
}
