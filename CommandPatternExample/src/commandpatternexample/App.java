/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternexample;

import apple.laf.JRSUIConstants;
import static commandpatternexample.RobotVoiceType.*;
import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Robot r = new Robot(new Point(0,0), PETER);
        
        MoveForwardCommand mfc =
                new MoveForwardCommand(r, 2, Direction.UP);
        
        mfc.execute();
        
        // TODO code application logic here
    }
    
}
