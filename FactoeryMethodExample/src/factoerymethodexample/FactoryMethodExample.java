/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample;

import factoerymethodexample.BE.AProduct;
import static factoerymethodexample.BE.EProductType.*;
import factoerymethodexample.BLL.Factory.IProductFactory;
import factoerymethodexample.BLL.Factory.NewProductFactory;
import factoerymethodexample.BLL.Factory.OldSheitProductFactory;
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
        IProductFactory newfactory = new NewProductFactory();
        IProductFactory oldfactory = new OldSheitProductFactory();

        List<AProduct> products = new ArrayList<>();

        AProduct newBike
                = newfactory.createProduct(BIKE);
        products.add(newBike);
        AProduct oldBike
                = oldfactory.createProduct(BIKE);
        products.add(oldBike);

        AProduct oldToyota
                = oldfactory.createProduct(CAR);
        products.add(oldToyota);

        AProduct tesla
                = newfactory.createProduct(CAR);
        products.add(tesla);

        for (AProduct product : products) {
            System.out.println(product.getProductInfo());
        }

    }

}
