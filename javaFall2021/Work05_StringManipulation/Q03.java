package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullan�c�dan alaca��n�z, 3 kelimeden olu�an ismi
        //�rn. Ahmet Emin Y�lmaz -> A.E.Y.  format�yla yazd�r�n�z.

    	Scanner scan=new Scanner(System.in);
    	System.out.println("ad�n�z� ve soyad�n�z� giriniz:");
    	String adSoyad=scan.nextLine();
    	
    	char ilkHarf=adSoyad.toUpperCase().charAt(0);
    	char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
    	char ���nc�Harf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1);
    	System.out.println("isminizin ba� harfleri : "+ilkHarf+"."+ikinciHarf+"."+���nc�Harf+".");
    	
    	scan.close();
    }       
}
