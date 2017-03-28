/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample.BLL.Factory;

import factoerymethodexample.BE.AProduct;
import factoerymethodexample.BE.EProductType;

/**
 *
 * @author jeppjleemoritzled
 */
public interface IProductFactory {

    public AProduct createProduct(EProductType type);
}
