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

public class OldSheitProductFactory implements IOldProductFactory {

    @Override
    public AProduct createOldProduct(EProductType type) {
        switch (type) {
            case CAR:
                return new Car(IDFactory.getNewID(), "Toyota", 25_000);
            case BIKE:
                return new Bike(IDFactory.getNewID(), "Ye old bike", 500);
            default:
                System.out.println("Sheit");
        }
        return null;
    }

}
