package day01_02_Variables;

public class C03_SwapVariable {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		String sayi3="10";
		String sayi4="20";
		System.out.println(sayi1+sayi2);//30
		System.out.println(sayi3+sayi4);//1020
		
		// farkl� data t�rleri ayn� de�eri alabilir
		// burada �nemli olan bu de�i�kenlerin de�i�ken t�r�ne g�re i�lem yapabilece�idir
		
		@SuppressWarnings("unused")
		String harf="A";
		@SuppressWarnings("unused")
		char harf2='A';
		
		// yukar�daki de�i�kenleri kullanarak 30A yazd�r�n
		System.out.println("sayi1+sayi2+harf1"); // 30A
		
		// char extra �zelli�i sebebi ile matematiksel i�lemlerde n�merik de�er al�r
		
	}

}
