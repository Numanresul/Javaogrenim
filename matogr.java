package ikinciprogram;

public class matogr extends ogr implements bilg {

	public matogr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}
	
	public void hesapla()
	{
		System.out.println("hesapladým");
	}

	@Override
	public void bolum() {
		// TODO Auto-generated method stub
		System.out.println("bölümüm mat");
	
	}
	
	public void pcdeyaz()// implement edilen interfacenin boþ metodu
	{
		System.out.println("yaz yaaz");
	}
	
	public int bilgi(int a,int b)
	{
		return a+b;
	}

}
