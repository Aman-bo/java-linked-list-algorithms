import java.io.*;
import java.util.*;

/**
 * Primes is a program that will compute prime numbers using the sieve of Eratosthenes.
 **/

public class Primes
{

    public static void main(String args[])
    {
        int max;
        System.out.println("Please enter the maximum value to test for primality");
        max = getInt("   It should be an integer value greater than or equal to 2.");
        
        // ADD CODE TO COMPLETE THE MAIN
        LList<Integer> candidates = new LList<>();
        for (int i = 2; i <= max; i++) {
            candidates.add(i);
        }

        System.out.println("Candidates: " + candidates);

        LList<Integer> primes = new LList<>();
        LList<Integer> composites = new LList<>();

        Integer prime = candidates.remove(1);  

        System.out.println("Discovered prime: " + prime);
        primes.add(prime);
        getComposites(candidates, composites, prime);
        
        System.out.println("Primes: " + primes);
        System.out.println("Composites: " + composites);
        System.out.println("Remaining candidates: " + candidates);
        
        candidates.reverse();
        primes.reverse();
        composites.reverse();

        System.out.println("After reversing:");
        System.out.println("Candidates: " + candidates);
        System.out.println("Primes: " + primes);
        System.out.println("Composites: " + composites);
        
        candidates.cycle();
        primes.cycle();
        composites.cycle();

        System.out.println("After cycling:");
        System.out.println("Candidates: " + candidates);
        System.out.println("Primes: " + primes);
        System.out.println("Composites: " + composites);
    }
          
    
   
    
    /**
     * getComposites - Remove the composite values from possibles list and
     * put them in the composites list.
     *
     * @param  candidates   A list of integers holding the possible values.
     * @param  composites   A list of integers holding the composite values.
     * @param  prime   An Integer that is prime.
     */
    public static void getComposites(ListInterface<Integer> candidates, ListInterface<Integer> composites, Integer prime)
    {
        // COMPLETE THIS METHOD   
    	 int index = 1;

         while (index <= candidates.getLength()) {
             Integer value = candidates.getEntry(index);

             if (value % prime == 0) {
                 candidates.remove(index);    
                 composites.add(value);  
               } 
             
              else{
            	  
                 index++;
             }
             
         }
         
    }
    
    /**
     * Get an integer value.
     *
     * @return     An integer. 
     */
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //Default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }        
        catch(Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;
                                    
    }    
    
}
