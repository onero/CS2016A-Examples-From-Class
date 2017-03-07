/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016ainterfacesandabstractions;

/**
 *
 * @author jeppjleemoritzled
 */
public class Truck
{
    
    private String name;
    private int availableStorageSpace;
    private int availableStorageWeight;
    

    public Truck(String name, int availableStorageSpace, int availableStorageWeight)
    {
        this.name = name;
        this.availableStorageSpace = availableStorageSpace;
        this.availableStorageWeight = availableStorageWeight;
    }
    
    public boolean load(TruckLoadable cargo)
    {
        if(availableStorageWeight>cargo.getWeight() &&
           availableStorageSpace>cargo.getSpace())
        {
            availableStorageSpace-=cargo.getSpace();
            availableStorageWeight-=cargo.getWeight();
            return true;
        }
        
        return false;
    }
    
    /**
     * Get the value of availableStorageWeight
     *
     * @return the value of availableStorageWeight
     */
    public int getAvailableStorageWeight()
    {
        return availableStorageWeight;
    }

    /**
     * Set the value of availableStorageWeight
     *
     * @param availableStorageWeight new value of availableStorageWeight
     */
    public void setAvailableStorageWeight(int availableStorageWeight)
    {
        this.availableStorageWeight = availableStorageWeight;
    }


    /**
     * Get the value of availableStorageSpace
     *
     * @return the value of availableStorageSpace
     */
    public int getAvailableStorageSpace()
    {
        return availableStorageSpace;
    }

    /**
     * Set the value of availableStorageSpace
     *
     * @param availableStorageSpace new value of availableStorageSpace
     */
    public void setAvailableStorageSpace(int availableStorageSpace)
    {
        this.availableStorageSpace = availableStorageSpace;
    }


    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
