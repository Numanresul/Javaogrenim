package ikinciprogram;

public class Ogrdene {

	public static void main(String[] args) {
		//ogr o1= new ogr("ali,2");// abstract old. i�in do�rudan abje olu�turulama
        ogr o1=new matogr("ali",2);
        ogr o2= new fenogr("ay�er",4);
        
        o1.adSoyle();
        o2.adSoyle();
        
        ((matogr) o1).hesapla();//nesneleri ogr ye ba�l� olarak tan�mlad���m�z i�in b�yle metod �a��rd�k
        
        ((fenogr) o2).bil();
        
        o1.bolum();
        o2.bolum();
        
        ((matogr) o1).pcdeyaz();//interface metodlar�n�n �a��r�m�
        ((matogr) o1).bilgi(5,3);
	
	}

}
