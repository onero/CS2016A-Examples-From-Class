/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample;

import factoerymethodexample.BE.AProduct;
import factoerymethodexample.BE.EProductCategory;
import static factoerymethodexample.BE.EProductType.*;
import factoerymethodexample.BLL.Factory.IProductFactory;
import factoerymethodexample.BLL.Factory.ProductFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class FactoryMethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProductFactory factory = new ProductFactory();
        List<AProduct> products = new ArrayList<>();

        AProduct newBike
                = factory.createProduct(EProductCategory.NEW, BIKE);
        products.add(newBike);
        AProduct oldBike
                = factory.createProduct(EProductCategory.OLD_SHEIT, BIKE);
        products.add(oldBike);

        AProduct oldToyota
                = factory.createProduct(EProductCategory.OLD_SHEIT, CAR);
        products.add(oldToyota);

        AProduct tesla
                = factory.createProduct(EProductCategory.NEW, CAR);
        products.add(tesla);

        for (AProduct product : products) {
            System.out.println(product.getProductInfo());
        }

    }

}
