package ikinciprogram;

import java.util.Scanner;

public class sorgular {
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		/*
		int secenek;
		int a,b;
		System.out.println("ilk sayiyi giriniz giriniz.");
		a=scan.nextInt();
		System.out.println("ikinci sayiyi giriniz.");
		b=scan.nextInt();
		System.out.println("secene�i giriniz.");
		secenek=scan.nextInt();
		
		
		if(secenek==0)
		{
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(secenek==1)
		{
			System.out.println("a-b="+(a-b));
		}
		else if(secenek==2)
		{
			System.out.println("a*b="+(a*b));
		}
		else 
		{
			System.out.println("a/b="+(a/b));
		}
			
		String isim;
		int yil;
		System.out.print("ad�n�z� yaz�n�z:");
		isim=scan.nextLine();
		System.out.print("du�um y�l�n�z� giriniz");
		yil=scan.nextInt();
		System.out.println("Ho�beldiniz say�n "+isim+" Bey;");
		System.out.println("Ya��n�z: "+(2017-yil));
	
		if (isim.equals("Numan"))
			System.out.print("naber lan");
			
		String isim,soyad;
		System.out.println("isminizi giriniz: ");
		isim= scan.nextLine();
		System.out.println("sayadinizi giriniz: ");
		soyad= scan.nextLine();
		fonk(isim, soyad);*/
		//topla(3,4);
		//int sonuc=toplad(3,4);
		//System.out.println("d�nen sonu�: "+sonuc);
		
	
	
	/*public static void fonk(String x, String y)
	{
		
		System.out.println("hey!"+ x+" "+ y);
	}
	public static void topla(int a, int b)
	{
		int c=a+b;
		System.out.println("Sonuc "+c);
	}
	public static int toplad(int a, int b)
	{
		int c=a+b;
		System.out.println("Sonuc "+c);
		return c;
	}
*/
	//Insan s�n�f� olu�turduk ve i1 isimli
	//insan nesnesini mainde olu�turduk
		/*Insan i1=new Insan();		
		i1.setIsim("ali");
		i1.setYas(23);
		System.out.println("isim: "+ i1.getIsim()+ "ya�: "+ i1.getYas());
	
		Insan i2=new Insan();
		
	
		//i2.isim="ayse";
		i2.setYas(18);
		System.out.println("isim: "+ i2.getIsim()+ "ya�: "+ i2.getYas());
		
		//2. constructur'� kullan�m �ekli
		Insan i3= new Insan(34,"veli");
		System.out.println("isim: "+ i3.getIsim()+ "ya�: "+ i3.getYas());
 
		i1.selamla();//insan class�na yazd���m�z metodu �al��t�rma �ekli
	    bisiklet b1=new bisiklet();
	    b1.bin(i3);*/
		
		/*
		 //while kullan�lan method �a��r�mlar�
		Insan i3=new Insan();
		int a,b;
		System.out.println("ilk sayiyi giriniz");
		a=scan.nextInt();
		System.out.println("son sayiyi giriniz");
		b=scan.nextInt();
		i3.sayiSay(a,b);
		*/
		men�Goster();
	
	} 
	
	public static void men�Goster()
	{
		Scanner sc=new Scanner(System.in);
		int x=0;
		
		while(x!=4)
		{
		System.out.println("1.Ara");
		System.out.println("2.Kaydet");
		System.out.println("3.Y�kle");
		System.out.println("4.��k��");
		System.out.println("Se�enek:");
		x=sc.nextInt();
		if(x==1)
			System.out.println("aramam i�lemi yap�ld�");
		else if(x==2)
			System.out.println("kaydetme i�lemi");
		else if(x==3)
			System.out.println("y�kleme i�lemi");
		else if(x==4)
			System.out.println("��k�yorsunuz");
		else
			System.out.println("yanl�� se�enek");
	}
		
		}
		
		
	
}





