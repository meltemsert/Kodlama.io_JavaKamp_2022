package oopWithNLayeredApp.dataAccess;

/* Bir pakette çalışırken başka bir paketi kullanabilmek
için o paketi import etmemiz gerekli*/

import oopWithNLayeredApp.entities.Product;

// Veri tabanına erişim işlemlerimi yapıyorum Dao sınıfında

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
