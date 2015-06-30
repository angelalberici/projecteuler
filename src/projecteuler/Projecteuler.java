package projecteuler;

/** I will be solving the exercises from the ProjectEuler in this Java Project
 *
 * @author Angel Alberici
 */
public class Projecteuler {
    public static void main(String[] args) {
        int n = 2;
        switch(n){
                case 1: multiplesOf3And5();
                    break;
                case 2: evenFibonacciNumbers();
                    break;
        }
        
    }
    
    
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
