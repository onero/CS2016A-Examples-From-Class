/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class IteratorExample
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        RobotArmy ra = new RobotArmy();
        
        for(Iterator iter = ra.getIterator();iter.hasNext();)
        {
            Robot r = (Robot)iter.next();
            r.talk("Rhello!", 0);
        }
        
        Iterator iter = ra.getIterator();
        while(iter.hasNext())
        {
            Robot r = (Robot)iter.next();
            r.talk("Rhello!", 0);
        }
        
    }
    
}
