package ikinciprogram;

public class bisiklet {
	Insan binmisInsan;
	
	
	public void bin(Insan GelenInsan)
	{
		if(binmisInsan==null)
		{
			binmisInsan=GelenInsan;
			System.out.println(binmisInsan.getIsim()+" ba�ar�yla bindi");
		}
		else
		{
			System.out.println("zaten"+binmisInsan.getIsim()+" binmi�");
		}
	}
	
}
