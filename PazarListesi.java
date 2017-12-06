package ikinciprogram;

public class PazarListesi {
	
	String[] liste;
	int elemansayisi;
	int sinir;
	// construcur'a kaç elemanlý liste olcaðýný yolluyoz
	public PazarListesi (int elemanKapasitesi) {
		
		liste= new String[elemanKapasitesi];
		elemansayisi=0;
		sinir=elemanKapasitesi;
	}
	
	public void listeyeEkle(String eklenecekOlan) {
		if(elemansayisi<sinir) 
		{
	liste[elemansayisi]= eklenecekOlan;
	elemansayisi++;
		}
		else
			System.out.println("liste dolu!!");
	}
	public void yaz()
	{
		for(int i=0;i< elemansayisi;i++)
		{
			System.out.println(liste[i]);
		}
	}

	public void sondansil() {
		if(elemansayisi>0) {
		elemansayisi--;
		liste[elemansayisi]="";
		}
		else
			System.out.println("liste boþ!!");
	}
	public void bastansil() {
		for(int i=0;i< elemansayisi-1;i++)
		{
			liste[i]=liste[i+1];
		}
		elemansayisi--;
		
	}
	public void arayaekle(String eklenecek,int konum)
	{
		   
			
			
		for(int i =elemansayisi-1;i>=konum;i--)
		{
			liste[i+1]=liste[i];
			
		}
		liste[konum]=eklenecek;
		elemansayisi++;
	}
	public void aradanSil(int konum)
	{
		for(int i=konum-1;i<elemansayisi;i++)
		{
			liste[i]=liste[i+1];
		}
		elemansayisi--;
	}
	
	public String max()	
	{
		String enBuyuk=liste[0];
		
		for(int i=0;i<elemansayisi;i++)
		{
			if(liste[i].compareToIgnoreCase(enBuyuk)>0)
			{
			 enBuyuk=liste[i];	
			}
		}
		return enBuyuk;
	}
	
	public String min()	
	{
		String enKucuk=liste[0];
		
		for(int i=0;i<elemansayisi;i++)
		{
			if(liste[i].compareToIgnoreCase(enKucuk)<0)
			{
			 enKucuk=liste[i];	
			}
		}
		return enKucuk;
	}
	
	public void swap(int i1, int i2)//dizi elemanlarýnda yer deðiþtirme
	{
		String tmp=liste[i1];
		liste[i1]=liste[i2];
		liste[i2]=tmp;
		
	}
	
	
}
