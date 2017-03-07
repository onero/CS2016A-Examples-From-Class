/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016ainterfacesandabstractions;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class CS2016ainterfacesandabstractions
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Truck t = new Truck("Big ol' pickup truck", 160_000, 4000);
        TruckLoadable box = new CardBoardBox(
                "30 pairs of underpants", 47, 35, 25, 15);
        
        
        if(t.load(box))
            System.out.println("Det lykkedes at putte på lastbilen");
        else
            System.out.println("Det lykkedes ikke :(´");
        
        TruckLoadable tube = new Tube(50, 10, 50, "Snake");
        
        ArrayList<TruckLoadable> allCargo = new ArrayList<>();
        allCargo.add(box);
        allCargo.add(tube);
        
        
        if(t.load(tube))
            System.out.println("Det lykkedes at putte på lastbilen");
        else
            System.out.println("Det lykkedes ikke :(´");
        
        
    }
    
}
