import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      //Check to see if the user entered in 2 arguments
      if(args.length == 2) {
         int num = 0;
         int denom = 0;
         double finalFraction = 0;
         try {
            num = Integer.parseInt(args[0]);
            denom = Integer.parseInt(args[1]);

         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac = new Fraction();

         // set the values
         frac.setNumerator(num);
         frac.setDenominator(denom);

         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

         } catch(Exception e) {
            System.out.println("Arguments: " + args[num] + ", " + args[denom] + " must be integers.");
            System.exit(1);
         }
         finalFraction =(double) num / denom;
         System.out.println(num + " / " + denom + " = " + finalFraction);
      }
      else {
         System.out.println("2 arguments should at least be provided.\n gradle runFrac --args='1 2'");
         }
      }
   }

