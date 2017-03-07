/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016aobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class GameMap extends RobotObservable
{
    private List<Robot> robots = new ArrayList();
    
    public void addRobot(Robot robot)
    {
        robots.add(robot);
        super.attachObserver(robot);
    }
    
    public void killRobot(Robot robot)
    {
        robots.remove(robot);
        robot.talk("I'm dying, i'm soooo pathetic");
        super.observers.remove(robot);
        notifyObservers();
    }
    
    @Override
    public void notifyObservers()
    {
        for (RobotObserver observer : observers)
        {
            observer.update();
        }
    }
    
}
