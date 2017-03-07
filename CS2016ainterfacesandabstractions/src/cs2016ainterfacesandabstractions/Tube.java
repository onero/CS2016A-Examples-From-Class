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
public class Tube extends Cargo
{
    private int radius;
    private int length;

    public Tube(int weight, int radius, int length, String name)
    {
        super(name, weight);
        this.radius = radius;
        this.length = length;
    }
    
    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public int getLength()
    {
        return length;
    }

    /**
     * Set the value of length
     *
     * @param length new value of length
     */
    public void setLength(int length)
    {
        this.length = length;
    }


    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public int getRadius()
    {
        return radius;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    public void setRadius(int radius)
    {
        this.radius = radius;
    }



    @Override
    public int getSpace()
    {
        return (int)(2*Math.PI*radius*length);
    }

}
