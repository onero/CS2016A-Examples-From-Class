/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample;

import factoerymethodexample.BE.Bil;
import factoerymethodexample.BE.Cykel;
import factoerymethodexample.BE.Product;

/**
 *
 * @author jeppjleemoritzled
 */
public class ProductFactory implements IProductFactory
{
    int idGen = 0;
    @Override
    public Product createProduct(ProductType type, String kategori)
    {
        switch (type)
        {
            case CYKEL:
                if(kategori.equalsIgnoreCase("STANDARD"))
                {
                    Product c = new Cykel(idGen++, "std " + "random", 34034);
                    return c;
                }
                else if(kategori.equalsIgnoreCase("lort"))
                {
                    Product c = new Cykel(idGen++, "MBK", 34);
                    return c;
                }
            case BIL:
                if(kategori.equalsIgnoreCase("STANDARD"))
                {
                    Product b = new Bil(idGen++, "Carina e", 30333);
                return b;
                }
                else if(kategori.equalsIgnoreCase("lort"))
                {
                    Product b = new Bil(idGen++, "Multipla", 25);
                    return b;
                }
            default:
                throw new AssertionError();
        } 
    }

    
    
}
