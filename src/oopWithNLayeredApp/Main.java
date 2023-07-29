package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.hibernateProductDAO;
import oopWithNLayeredApp.dataAccess.jdbcProductDAO;
import oopWithNLayeredApp.entities.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Product product1=new Product(1,"ozgur",10);
        ProductManager productManager=new ProductManager(new jdbcProductDAO());
        productManager.add(product1);
        }
}
