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
public abstract class Cargo implements TruckLoadable
{
    private int weight;
    private String name;

    public Cargo(String name, int weight)
    {
        this.weight = weight;
        this.name = name;
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


    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(int weight)
    {
        this.weight = weight;
    }

}
