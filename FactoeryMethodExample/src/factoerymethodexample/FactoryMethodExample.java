/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample;

import factoerymethodexample.BE.Product;
import static factoerymethodexample.ProductType.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class FactoryMethodExample
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        IProductFactory factory = new ProductFactory();
        Product nyCykel = 
                factory.createProduct(CYKEL, "standard");
        Product gammelCykel = 
                factory.createProduct(CYKEL, "standard");
        
        Product gammelToyota = 
                factory.createProduct(BIL, "lort");
        
    }
    
}
