package day01_02_Variables;

public class Co2_Variables {

	public static void main(String[] args) {
	

		String okul="Y�ld�z Koleji";
	
		
		// ayn� isim ve de�i�ken ile ikinci defa variables olu�turulmaz
		// string okul="Mehmet Koleji";
		
		// farkl� data t�r� de olsa ayn� isim ile ikinci defa variables olu�turulmaz
		
		//int okul=20;
		
		// Varolan bir variablesa yeni de�er atayabiliriz
		
		okul="Mehmet Koleji";
		System.out.println(okul); // Mehmet Koleji
		
		// Yazd�rma i�leminde a��klama eklemek istersek
		// Mesela okul ad� : Mehmet Koleji yazd�ral�m
		
		System.out.println("okul ad� : "+okul);//okul ad� : Mehmet Koleji
		System.out.println("okul ad� :"+"okul");// okul ad� : okul
	}

}
