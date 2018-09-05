package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Karakter {

	
	public static void main(String[] args) {
		
	   
	       char kar = 0 ;	  
	       int count = 1;
	      
	       do {
	    	   String riktig = showInputDialog("Skriv % riktig");
	   	    int score  = parseInt ( riktig);
	        if (score >= 90) {
	            kar = 'A';
	        } else if (score >= 80) {
	            kar = 'B';
	        } else if (score >= 70) {
	            kar = 'C';
	        } else if (score >= 60) {
	            kar = 'D';
	        } else if (score >=1){
	            kar = 'F';
	        } else if(score <0) {
	        	kar = 'O';
	        }
	        
	       String ut= ("Du får: " + kar);
	       showMessageDialog(null,ut); 
	       count = count +1; 
	 }	while  (count <=10);
	        
	
}   
}