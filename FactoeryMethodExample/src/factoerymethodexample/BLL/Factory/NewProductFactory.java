/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample.BLL.Factory;

import factoerymethodexample.BE.AProduct;
import factoerymethodexample.BE.Bike;
import factoerymethodexample.BE.Car;
import factoerymethodexample.BE.EProductType;

/**
 *
 * @author jeppjleemoritzled
 */
public class NewProductFactory implements INewProductFactory {

    @Override
    public AProduct createNewProduct(EProductType type) {
        switch (type) {
            case CAR:
                return new Car(IDFactory.getNewID(), "Tesla", 700_000);
            case BIKE:
                return new Bike(IDFactory.getNewID(), "Awesome bike", 5000);
            default:
                System.out.println("Sheit");
        }
        return null;
    }

}
