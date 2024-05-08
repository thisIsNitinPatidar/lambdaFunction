
package com.mycompany.lambdaexpression;

import java.util.ArrayList;

public class lambdaFun 
{
     public static void main(String args[])
    {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(23);
        arr.add(26);
        arr.add(34);
        arr.add(41);

       
        arr.forEach(n -> System.out.println(n));

        
        arr.forEach(n -> {
            if (n % 2 == 0)
                System.out.println("Even Number: "+n);
            else
                System.out.println("Odd Number: "+n);
                
        });
    }
}
