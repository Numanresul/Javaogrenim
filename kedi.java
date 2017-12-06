package ikinciprogram;

public class kedi extends hayvan{
	
	String mamaturu;
	public kedi(String isim,int yas,String mamaturu)
	{
		super(isim,yas);//hayvanýn constructurý ný çaðýrdýk
	    this.mamaturu=mamaturu;//hayvanda olmayan bu deðer atamasýnýn superden önce 
	}
	
	public int islemYap(int a,int b)//override metod(hayvandaki ile ayno formatta olmalý)
	{
		int sonuc=super.islemYap(a, b);//hayvan classýndaki islemyap metodu kullanýmý
		return sonuc*a+b;
	}
	
	public void sesCýkar()//hayvan classýnda tanýmlanan metodu kedi için
	//farklýlaþtýrdýk yani bu metodu
	// OVERRÝDE etmiþ olduk
	{
		System.out.println("miyav");
	}

}
