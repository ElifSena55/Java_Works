package _05_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*
				StringMethods:
				kullanýcýdan cift uzunlukta bir stringin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
    	Scanner scan=new Scanner (System.in);
    	System.out.println("bir string  giriniz:");

    	String str=scan.nextLine();
    	
    	if (str.length()%2==0) {
			System.out.println("girilen stringin ilk yarýsý :"+str.substring(0,str.length()/2));
		} else {
            System.out.println("tek uzunlukta string girmiþ");
		}
    	
    	scan.close();
    }
}
