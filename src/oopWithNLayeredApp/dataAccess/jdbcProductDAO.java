package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDAO implements ProductDAO {
    public void add(Product product)
    {
        //veritabanına erişim kodları yazılır. SQL
        System.out.println("JDBC  ile veritabanına eklendi.");
    }
}
