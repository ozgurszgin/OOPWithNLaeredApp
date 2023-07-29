package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.ProductDAO;
import oopWithNLayeredApp.dataAccess.jdbcProductDAO;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    private ProductDAO productDAO;

    public ProductManager(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void add(Product product) throws Exception {
        //business rules, iş kuralları
        if(product.getUnitPrice()<10)
        {
            throw new Exception("ürün fiyatı 10'dan küçük olamaz");
        }
        productDAO.add(product);
    }
}
