package day01;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		
		// kullanýcýdan 2 tam sayý alýp bu 2 tam sayýnýn dört iþlem sonucunu yazdýrýnýz
		
		Scanner scan =new Scanner(System.in);
		System.out.print("1. sayýyý giriniz :");  // kullanýcýdan 1. sayý girmesinin bildirimini yazdýrdýk
		 int sayý1=scan.nextInt();
		 
		 System.out.print("2. sayýyý giriniz :"); // kullanýcýdan 2. sayý girmesinin bildirimini yazdýrdýk
		 
		 int sayý2=scan.nextInt();
		 
		 System.out.println("girilen sayýlarýn toplamý :"+(sayý1+sayý2));
		 System.out.println("girilen sayýlarýn farký :"+(sayý1-sayý2));
		 System.out.println("girilen sayýlarýn çarpýmý :"+(sayý1*sayý2));
		 System.out.println("girilen sayýlarýn bölümü"+(sayý1/sayý2));
		 
		 
scan.close();
	}

}
