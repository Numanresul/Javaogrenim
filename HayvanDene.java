package ikinciprogram;

public class HayvanDene {

	public static void main(String[] args) {
	
		
		hayvan h=new hayvan("hayvan",5);
		h.yas();
		kedi k= new kedi("tekir",3,"pismama");
		k.yas();
		
		
		kopek t=new kopek("�omar",6);
		
		t.yas();
		
		k.sesC�kar();
		t.sesC�kar();
		System.out.println(k.islemYap(5, 4));
		System.out.println(t.islemYap(5, 4));
		
	}

}
