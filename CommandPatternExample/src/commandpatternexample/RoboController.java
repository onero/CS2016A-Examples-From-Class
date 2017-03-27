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
class RoboController
{
    private RobotCommand command;

    public RoboController(RobotCommand command)
    {
        this.command = command;
    }

    public void executeCommand()
    {
        command.execute();
    }
    
    public RobotCommand getCommand()
    {
        return command;
    }

    public void setCommand(RobotCommand command)
    {
        this.command = command;
    }
    
    
    
    
}
