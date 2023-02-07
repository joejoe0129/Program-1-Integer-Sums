// Jordan Joseph
// 1/13/23
// The program reads numbers from the user and prints out the sum of the numbers. The program stops accepting numbers when the user enters ¬ 0, or after reading 10 numbers, whichever comes first.
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
  Scanner scan = new Scanner(System.in);

    int sum = 0;    // the veirables 
    int sumnum = 0;
    int adder = 1;

    while((sumnum != 10) && (adder != 0)){ // the rules
      System.out.print("Please enter a number:");
      adder = scan.nextInt();
      sum = sum + adder; // the math
      sumnum++;
       }
    
 System.out.println("The sum of the numbers is " + sum); // end of loop

  }
}