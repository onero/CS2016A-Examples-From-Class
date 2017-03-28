/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample.BLL.Factory;

import factoerymethodexample.BE.AProduct;
import factoerymethodexample.BE.EProductCategory;
import factoerymethodexample.BE.EProductType;

public class ProductFactory implements IProductFactory {

    private final INewProductFactory newFactory = new NewProductFactory();
    private final IOldProductFactory oldFactory = new OldSheitProductFactory();

    @Override
    public AProduct createProduct(EProductCategory category, EProductType type) {
        switch (category) {
            case NEW:
                return newFactory.createNewProduct(type);
            case OLD_SHEIT:
                return oldFactory.createOldProduct(type);
            default:
                System.out.println("Sheit");
        }
        return null;
    }

}
