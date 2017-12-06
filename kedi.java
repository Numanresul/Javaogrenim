package ikinciprogram;

public class kedi extends hayvan{
	
	String mamaturu;
	public kedi(String isim,int yas,String mamaturu)
	{
		super(isim,yas);//hayvan�n constructur� n� �a��rd�k
	    this.mamaturu=mamaturu;//hayvanda olmayan bu de�er atamas�n�n superden �nce 
	}
	
	public int islemYap(int a,int b)//override metod(hayvandaki ile ayno formatta olmal�)
	{
		int sonuc=super.islemYap(a, b);//hayvan class�ndaki islemyap metodu kullan�m�
		return sonuc*a+b;
	}
	
	public void sesC�kar()//hayvan class�nda tan�mlanan metodu kedi i�in
	//farkl�la�t�rd�k yani bu metodu
	// OVERR�DE etmi� olduk
	{
		System.out.println("miyav");
	}

}
