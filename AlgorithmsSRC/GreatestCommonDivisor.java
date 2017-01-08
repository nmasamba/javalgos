
/***************************************************************************************************
* Author: Nyasha Masamba
* Adapted from Algorithms (4th ed) by Wayne, K and Sedgewick, R, Pearson Education, 2011

* To compile this program from the command line type: javac GreatestCommonDivisor.java
* To execute this program from the command line type: java GreatestCommonDivisor arg0 arg1

* Purpose: to calculate the greatest common divisor of two nonnegative integers, p and q

***************************************************************************************************/
import java.util.*;

public class GreatestCommonDivisor
{
    //We specify an API to separate the client from the implementation
    //Utilises Euclid's algorithm
    public static int gcd(int p, int q) 
    {
    if (q == 0) return p;
    int r = p % q;
    return gcd(q, r); 
    }
    
    //A development client in the main method
    //p and q can be changed to suit the problem
    public static void main(String[] args)
    {
        //Pass in integer values to test the gcd function
        int p = Integer.parseInt(args[0]); 
        int q = Integer.parseInt(args[1]);
 
        StdOut.println(gcd(p, q));   
    } 

}

