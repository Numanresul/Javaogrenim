package ikinciprogram;

public class matogr extends ogr implements bilg {

	public matogr(String isim, int no) {
		super(isim, no);
		// TODO Auto-generated constructor stub
	}
	
	public void hesapla()
	{
		System.out.println("hesaplad�m");
	}

	@Override
	public void bolum() {
		// TODO Auto-generated method stub
		System.out.println("b�l�m�m mat");
	
	}
	
	public void pcdeyaz()// implement edilen interfacenin bo� metodu
	{
		System.out.println("yaz yaaz");
	}
	
	public int bilgi(int a,int b)
	{
		return a+b;
	}

}
