package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class hibernateProductDAO implements ProductDAO {
    public void add(Product product)
    {
        //veritabanına erişim kodları yazılır. SQL
        System.out.println("Hibernate  ile veritabanına eklendi.");
    }


}
