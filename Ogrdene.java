package ikinciprogram;

public class Ogrdene {

	public static void main(String[] args) {
		//ogr o1= new ogr("ali,2");// abstract old. için doðrudan abje oluþturulama
        ogr o1=new matogr("ali",2);
        ogr o2= new fenogr("ayþer",4);
        
        o1.adSoyle();
        o2.adSoyle();
        
        ((matogr) o1).hesapla();//nesneleri ogr ye baðlý olarak tanýmladýðýmýz için böyle metod çaðýrdýk
        
        ((fenogr) o2).bil();
        
        o1.bolum();
        o2.bolum();
        
        ((matogr) o1).pcdeyaz();//interface metodlarýnýn çaðýrýmý
        ((matogr) o1).bilgi(5,3);
	
	}

}
