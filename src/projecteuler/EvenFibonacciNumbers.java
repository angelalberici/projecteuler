/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author angelalberici
 */
public class EvenFibonacciNumbers {
    
    public static void  evenFibonacciNumbers(){
        Integer limit = 4000000; // 4000000
        int first = 1;
        int second = 2;
        
        int nextNumber = 0;
        int valueA = first;
        int valueB = second;
        int sum = 2; //It starts with 1,2; we have a first even number (TWO)
        
        while(nextNumber<limit){
            nextNumber = valueA + valueB;
            valueA= valueB;
            valueB = nextNumber;
            
            if( nextNumber % 2 == 0)
                sum = sum + nextNumber;
        }
        System.out.println("The defined limit: "+ limit);
        System.out.println("Sum Total: " + sum);
        
    }
    
    
}
