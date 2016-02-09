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
public class MultiplesOf3And5 {
    
        public static void multiplesOf3And5(){
    int limit = 1000;
    int sum = 0;
        
        for (int i = 0; i < limit; i++) {
        if(i % 3 == 0 || i % 5 == 0)
            sum = sum + i;
        }
        System.out.println("The defined limit: "+ limit);
        System.out.println("Sum Total: " + sum);
    
    }
}
