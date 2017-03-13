/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatternexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class MoveForwardCommand implements RobotCommand
{
    private final Robot r; 
    private final int distance; 
    private final Direction direction;
    
    public MoveForwardCommand(Robot r, int distance, Direction direction)
    {
        this.r = r;
        this.distance=distance;
        this.direction=direction;
    }

    @Override
    public void execute()
    {
        r.move(direction, distance);
    }
    
}
