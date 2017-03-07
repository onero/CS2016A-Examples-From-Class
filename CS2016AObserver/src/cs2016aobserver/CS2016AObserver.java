/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016aobserver;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import static cs2016aobserver.RobotVoiceType.*;
import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class CS2016AObserver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Robot robo1 = new Robot(new Point(10,10), BOB);
        Robot roboPeter = 
                new Robot (new Point(25,25), PETER);
        
        Robot roboJeppe = 
                new Robot(new Point(15,15), RYAN);
        
        GameMap gm = new GameMap();
        
        gm.addRobot(robo1);
        gm.addRobot(roboPeter);
        gm.addRobot(roboJeppe);
        
        gm.killRobot(roboPeter);
        // TODO code application logic here
    }
    
}
