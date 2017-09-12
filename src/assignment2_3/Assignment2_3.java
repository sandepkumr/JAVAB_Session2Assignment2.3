/**
 * 
 */
package assignment2_3;

/**
 * This class will print the below pattern using loops 
 * 			*___*
 * 			_*_* 
 *			__*  
 *			_*_* 
 *			*___*
 *
 */
public class Assignment2_3 {

	public static void main(String[] args) {// main method starts
		
		int lines=5; 						// Initializing odd number of lines for X pattern to print
		int patternSplit=(lines/2)+1;		// Split number of lines at center of pattern and assign it a variable
		
		//Printing upper split of the pattern
	    for (int row = 1; row <=patternSplit; row++) { 				
	        for (int column = 1; column <=lines+1-row; column++) { 	// Inner loops 5 times for every outer loop
	            if (row == column || column == (lines+1-row)) { 	
	                System.out.print("*");							// Printing * at row position equals column / row position equals total rows minus column 
	            }
	            else {
	            	System.out.print("_");							// Print _ for rest of the positions
	            }
	        }
	        System.out.println();									//print new line after each iteration
	    }
	    
	    //Printing lower split of the pattern
	    for (int row = patternSplit+1; row <=lines; row++) { 				
	        for (int column = 1; column <=row; column++) { 	
	            if (row == column || column == (lines+1-row)) { 	
	                System.out.print("*");							// Printing * at row position equals column / row position equals total rows minus column 
	            }
	            else {
	            	System.out.print("_");							// Print _ for rest of the positions to complete pattern
	            }
	        }
	        System.out.println();									// print new line after each iteration
	    }
		 
	}

}// Class closed
