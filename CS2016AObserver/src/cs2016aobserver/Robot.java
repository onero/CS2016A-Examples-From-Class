/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016aobserver;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class Robot implements RobotObserver
{
    private Point pLocation;
    private RobotVoiceType roboVoice;

    public Robot(Point pLocation, RobotVoiceType roboVoice)
    {
        this.pLocation = pLocation;
        this.roboVoice = roboVoice;
    }
    
    // move
    public void move(Direction d, int distance)
    {
        switch(d)
        {
            case UP:
                pLocation.y -= distance;
                break;
            case DOWN:
                pLocation.y += distance;
                break;
            case LEFT:
                pLocation.x -= distance;
                break;
            case RIGHT:
                pLocation.x += distance;
                break;
        }
    }
    
    // talk
    public void talk(String somethingToSay)
    {
        System.out.println("[In " + roboVoice.name() + 
                "'s voice saying] "+ somethingToSay);
    }

    @Override
    public void update()
    {
        talk("The GameMap updated");
    }
    
}
