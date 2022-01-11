package day01_02_Variables;

public class C03_SwapVariable {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		String sayi3="10";
		String sayi4="20";
		System.out.println(sayi1+sayi2);//30
		System.out.println(sayi3+sayi4);//1020
		
		// farklý data türleri ayný deðeri alabilir
		// burada önemli olan bu deðiþkenlerin deðiþken türüne göre iþlem yapabileceðidir
		
		@SuppressWarnings("unused")
		String harf="A";
		@SuppressWarnings("unused")
		char harf2='A';
		
		// yukarýdaki deðiþkenleri kullanarak 30A yazdýrýn
		System.out.println("sayi1+sayi2+harf1"); // 30A
		
		// char extra özelliði sebebi ile matematiksel iþlemlerde nümerik deðer alýr
		
	}

}
