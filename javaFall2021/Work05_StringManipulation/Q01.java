package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        
    	Scanner scan=new Scanner (System.in);
    	System.out.println("bir string giriniz:");

    	String str=scan.nextLine();
    	
    	boolean varM�=str.contains(" ");
    	System.out.println("girilen stringde bo�luk var m�? :"+varM�);
    	
        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
      
    	System.out.println("girilen string bo� mu?:"+str.isEmpty());
       scan.close();
    }
}

