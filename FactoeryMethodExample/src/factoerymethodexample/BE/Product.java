/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample.BE;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class Product
{
    
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price)
    {
        this.price = price;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    

}
