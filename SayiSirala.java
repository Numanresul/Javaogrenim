package ikinciprogram;

public class SayiSirala {

	public static void main(String[] args) {
		
		SayiListesi liste= new SayiListesi(10);
		liste.arayaekle(4, 0);
		liste.arayaekle(7, 0);
		liste.arayaekle(8, 0);
		liste.arayaekle(5, 0);
		liste.arayaekle(6, 0);
		liste.arayaekle(9, 0);
		liste.arayaekle(11, 0);
		liste.arayaekle(65, 0);
		liste.arayaekle(54, 0);
		liste.arayaekle(78, 0);
		liste.yaz();
		System.out.println("  ");
		liste.SelectionSort();
		liste.yaz();
		System.out.println("  ");
		liste.BubbleSort();
		liste.yaz();
		
		
	}

}
