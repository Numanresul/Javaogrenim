package ikinciprogram;

public class Insan {
	private int yas;
	private String isim; 
	
	public Insan()// constructer tan�mlad�k(yani s�n�f�m�zdan 
	//t�retilen nesnelerdeki de�i�kenlere default de�eri verdik
    // biz nesneye isim atamas� yapmazsak isim de�i�keni otomatik
	//olarak isimsiz olacak. 
	{
		setYas(20);
		setIsim("isimsiz");
		
}//ikinci bir constructer olu�turduk ve ilk de�eri mainden
 //nesne parantezinin i�inden verebilcez
	public Insan(int alinanYas,String alinan�sim)
	{
		setYas(alinanYas);
		setIsim(alinan�sim);
		
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
			System.out.println("yanl�� aral�k girdiniz");
		
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
