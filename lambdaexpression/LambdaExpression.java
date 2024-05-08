
package com.mycompany.lambdaexpression;

interface lambdaFunction
{
    void print(int x);

    
    default void normalFun()
    {
       System.out.println("this is Normal Function");
    }
}

public class LambdaExpression 
{

    public static void main(String[] args) 
    {
         lambdaFunction l = (int x)->System.out.println(4*x);

        
        l.print(5);
        l.normalFun();
    }
}
