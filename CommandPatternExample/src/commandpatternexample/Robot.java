/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternexample;

import java.awt.Point;

/**
 *
 * @author jeppjleemoritzled
 */
public class Robot
{
    private Point point;
    private RobotVoiceType voiceType;
    
    public Robot(Point point, RobotVoiceType robotVoiceType)
    {
        this.point = point;
        this.voiceType = robotVoiceType;
    }

    public void move(Direction direction, int distance)
    {
        switch(direction)
        {
            case UP:
                point.y-=distance;
                break;
            case DOWN:
                point.y+=distance;
                break;
            case LEFT:
                point.x-=distance;
                break;
            case RIGHT:
                point.x+=distance;
                break;
            default:
                throw new RuntimeException("YOU CAN'T GO IN THAT DIRECTION");
        }
        
        System.out.println("Moving " + distance + 
                " in direction " + direction.name());
        System.out.println("New location: " +
                point.x + "," + point.y);
    }
    
}
