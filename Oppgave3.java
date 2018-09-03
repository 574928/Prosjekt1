package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
 

public class Oppgave3 {

	public static void main(String[] args) {
		int n;
		boolean ikkeGyldig;
		
		do { 
			String tallTxt = showInputDialog("Tallverdi");
			n= parseInt(tallTxt);
			ikkeGyldig = (n<0);
			if ( ikkeGyldig ) 
				showMessageDialog (null, "Tallverdi må være større en 0"); 
			}while (ikkeGyldig);
			
			showMessageDialog ( null,n + "! =" + fakultet(n));
		}
		
		
		public static int fakultet( int maxtall) {
			int nFak=1; 
			for ( int tall = 1; tall<=maxtall; tall ++)
				nFak = nFak * tall;
			return nFak; 
		
		}
		
		
		

	}


