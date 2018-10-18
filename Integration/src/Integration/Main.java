package Integration;

import java.util.Random;
import java.util.Scanner;

//Christian McCann
//This project is a collection of all the knowledge learned this semester
//in java.
/*byte - an 8-bit signed two's complement integer. It has a minimum value of 
 * -128 and a maximum value of 127 (inclusive)
 *short -  16-bit signed two's complement integer. It has a minimum value of 
 *-32,768 and a maximum value of 32,767 (inclusive)
 *int - a 32-bit signed two's complement integer, which has a minimum value of 
 *-231 and a maximum value of 231-1.
 *long - a 64-bit two's complement integer. The signed long has a minimum value
 * of -263 and a maximum value of 263-1
 *float - a single-precision 32-bit IEEE 754 floating point. Has a wide range 
 *of values
 *double - a double-precision 64-bit IEEE 754 floating point. Has a wide range
 * of values
 * boolean - has only two possible values: true and false
 * char - a single 16-bit Unicode character. It has a minimum value of '\u0000'
 *  (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 * String - not a data type. a collection of characters.
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my Integration Project");
		
		int a = 42;
		
		double b = 42.5;
		
		boolean c = false;
		
		String d = "42 is a number";
		
		final int fin = 4;
		//the final keyword makes it so that the value of the variable can not be 
		//changed.
		
		int e = d.length();
		//the length() method looks at the string and returns an integer that is 
		//the length of the string
		char f = d.charAt(9);
		//the charAt() method looks at the string and takes a character from a 
		//certain index, in this case the index is 9
		String g = d.substring(2,8);
		// the substring() method looks at a string and creates another string 
		//using the index numbers that you provide.
		
		System.out.println("When using strings, \\ can be used to format the "
		        + "string. it is called and escape sequence. \\\" is used to place"
		        + " a double quote in a String literal");
		
		int h = (int)b;
		//the (int) here is doing something called casting. The b variable is a 
		//double, and in order to assign its value to the int h, it has to be 
		//"cast" as an integer.
		
		double bsquared = square(b);
		//the square(b) is a method call. when invoked it calls the square method
		//I created below. the variable b is the argument I am passing through the 
		//method. this particular method will return a value of b^2
		
		Random rand = new Random();
		int randnum = rand.nextInt(200);
		if(randnum >100){
			System.out.println("The following number is a random number generated "
			        + "that is greater than 100: "+randnum);
		}else System.out.println("The following number is a random number generated"
		        + " that is 100 or less: "+randnum);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please choose a Skittle type. Type 1 for plain "
		        + "Skittles, 2 for Sour Skittles, or 3 for Tropical Skittles.");
		int skit = scan.nextInt();
		scan.close();
	    
		String skitString;
	    switch (skit) {
	        case 1:  skitString = "You chose plain Skittles!";
	                 break;
	        case 2:  skitString = "You chose Sour Skittles!";
	                 break;
	        case 3:  skitString = "You chose Tropical Skittles!";
	                 break;
	        default: skitString = "You did not enter a 1, 2, or 3. You fail.";
	                 break;
	    }
	    System.out.println(skitString);
	    
	    String i = "dude";
	    String j = "dude";
	    boolean l = i.equals(j);
	    if(i==j)System.out.println("true");else System.out.println("false");
	    //the == is an operator where compareTo() and equals() are methods, as 
	    //an operator you can use it to compare objects and data tpes, but with 
	    //the equals method you can override it to more acurately compare 
	    //objects, by default it acts in a similar fashion.
	    
	    System.out.println("The equals method compares character sequences of "
	            + "objects and returns true if they are the same and false if "
	            + "not. The result of the previous use of this method is: "+l);
	    int k = i.compareTo(j);
	    System.out.println(k==0 ? "The character sequence of this String object "
	            + "is lexicographically equal to the character sequence of the "
	            + "argument string. " : 
	    	"The character sequence of this String object is not lexicographically"
	    	+ " equal to the character sequence of the argument string");
		
	    int m = 4;
		m = m + 3;//this adds 3 to the variable m
		m = m - 3;//this subtracts 3 from m
		m = m * 3;//this multiplies m by 3
		m = m / 3;//this divides m by 3
		m = m % 3;
		//this divides m by 3 and assigns the remainder of that division to m
		m--;//this subtracts 1 from m
		m++;//this adds 1 to m
		m += 3;//this adds 3 to m.
		//operator Precedence is when java chooses what operators to use first if 
		//multiple operators are in one statement
		int n = 10;
		boolean p = false;
		while(n<16) {
		    System.out.println(n);
		    if(p) {
		        n++;
		        continue;
		        //when the program reaches this continue statement, it ends the 
		        //iteration of the look and restarts the loop in another iteration.
		        //because of the way I set this up, if the variable p is true, then
		        //n will only increment once, otherwise it will increment by 2.
		    }
		    n+=2;
		}
		
		do {
		    System.out.println(n);
		    n++;
		    break;
		    //this break statement ends the loop and moves on to the next section
		    //of code, it does not give the loop a chance to check its condition.
		}while(n<21);
		
		for(int o=1;o<=5;o++) {
		    System.out.println(o);
		}
		
	    
	}
	
	public static double square(double dub){//this is the header, it tells us 
	    //what the return type of the method is, and the variable type that we
	    //want to pass through it. in this case it is a double.
		double squared = Math.pow(dub, 2);
		return squared;
	}

}
