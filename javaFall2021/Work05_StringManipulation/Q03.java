package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanýcýdan alacaðýnýz, 3 kelimeden oluþan ismi
        //örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.

    	Scanner scan=new Scanner(System.in);
    	System.out.println("adýnýzý ve soyadýnýzý giriniz:");
    	String adSoyad=scan.nextLine();
    	
    	char ilkHarf=adSoyad.toUpperCase().charAt(0);
    	char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
    	char üçüncüHarf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1);
    	System.out.println("isminizin baþ harfleri : "+ilkHarf+"."+ikinciHarf+"."+üçüncüHarf+".");
    	
    	scan.close();
    }       
}
