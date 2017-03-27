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
        
        RobotCommand mfc =
                new MoveCommand(r, 2, Direction.UP);
        
        //mfc.execute();
        
        RobotCommand tc =
                new TalkCommand(r, "I'm returded", PETER);
        
        //tc.execute();
        
        RoboController contr =
                new RoboController(mfc);
        
        contr.executeCommand();
        
        
        // TODO code application logic here
    }
    
}
