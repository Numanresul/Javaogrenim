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
	System.out.println("y�r�d�m");
}

public void yas()
{
	System.out.println("ya��m"+yas);
}

public void sesC�kar()
{
	System.out.println("ben bir hayvan�m");
}

}
