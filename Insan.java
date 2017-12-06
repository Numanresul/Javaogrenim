package ikinciprogram;

public class Insan {
	private int yas;
	private String isim; 
	
	public Insan()// constructer tanımladık(yani sınıfımızdan 
	//türetilen nesnelerdeki değişkenlere default değeri verdik
    // biz nesneye isim ataması yapmazsak isim değişkeni otomatik
	//olarak isimsiz olacak. 
	{
		setYas(20);
		setIsim("isimsiz");
		
}//ikinci bir constructer oluşturduk ve ilk değeri mainden
 //nesne parantezinin içinden verebilcez
	public Insan(int alinanYas,String alinanİsim)
	{
		setYas(alinanYas);
		setIsim(alinanİsim);
		
	}
	
	public void selamla()
	{
		System.out.println("merhaba benim adim"+ isim);
	}
	
	
	public void sayiSay(int bas, int son)
	{
		if(bas<son)
	{
		int i=bas,j=son;
		while(i<=j)
		{
		  System.out.println(i);
		  i++;
		}
	}
		else
			System.out.println("yanlış aralık girdiniz");
		
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}

}
