package day01_02_Variables;

public class Co2_Variables {

	public static void main(String[] args) {
	

		String okul="Yýldýz Koleji";
	
		
		// ayný isim ve deðiþken ile ikinci defa variables oluþturulmaz
		// string okul="Mehmet Koleji";
		
		// farklý data türü de olsa ayný isim ile ikinci defa variables oluþturulmaz
		
		//int okul=20;
		
		// Varolan bir variablesa yeni deðer atayabiliriz
		
		okul="Mehmet Koleji";
		System.out.println(okul); // Mehmet Koleji
		
		// Yazdýrma iþleminde açýklama eklemek istersek
		// Mesela okul adý : Mehmet Koleji yazdýralým
		
		System.out.println("okul adý : "+okul);//okul adý : Mehmet Koleji
		System.out.println("okul adý :"+"okul");// okul adý : okul
	}

}
