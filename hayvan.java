package ikinciprogram;

public class hayvan {
	int yas;
	String isim;
	
	public hayvan(String isim, int yas)
	{
		this.isim=isim;
		this.yas=yas;
	}
	
	public int islemYap(int a,int b)
	{
		return a/b+7;
	}
	
public void yuru()
{
	System.out.println("yürüdüm");
}

public void yas()
{
	System.out.println("yaşım"+yas);
}

public void sesCıkar()
{
	System.out.println("ben bir hayvanım");
}

}
