package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class ifTesting {

	
	public static void main(String[] args) {
		
	      String riktig = showInputDialog("Skriv % riktig");
	      int testscore = parseInt ( riktig);
	        char no;

	        if (testscore >= 90) {
	            no = 'A';
	        } else if (testscore >= 80) {
	            no = 'B';
	        } else if (testscore >= 70) {
	            no = 'C';
	        } else if (testscore >= 60) {
	            no = 'D';
	        } else if (testscore >=1){
	            no = 'F';
	        } else if(testscore <0) {
	        	no = 'O';
	        }
	        
	       String ut= ("Du får: " + riktig);
	       showMessageDialog(null,ut); 
	
	        
	}
}   

	
