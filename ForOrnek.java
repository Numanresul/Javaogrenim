package ikinciprogram;

public class ForOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=0;i<24;i++)
		{
			for(int j=4;j<i+5;j++) {
			System.out.print(" ");
			}
			System.out.println("*NUMAN*");
		}*/
		
		/*
	int[] a= new int[15];//temel dizi tan�mlamas�	
	for(int i=0;i<15;i++)
	{
		a[i]=i;
	}
	int j=0;int sonu�=0;
	while(j<15)
	{
		
		
		sonu�=sonu�+a[j];
		j++;
	    System.out.println(sonu�);
	}
	*/
		
		PazarListesi liste= new PazarListesi(5);
		liste.listeyeEkle("ekmek");
		liste.listeyeEkle("su");
		liste.listeyeEkle("et");
		liste.listeyeEkle("gofret");
		liste.listeyeEkle("sucuk");
		
		liste.yaz();
		
		System.out.println(liste.max());
		System.out.println(liste.min());
	}  
		

}
