/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample.BLL.Factory;

public class IDFactory {

    private static int ID = 0;

    public static int getNewID() {
        ID++;
        return ID;
    }

}
