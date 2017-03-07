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
public abstract class RobotObservable // Subject
{
    protected List<RobotObserver> observers;

    public RobotObservable()
    {
        observers = new ArrayList();
    }
    
    public void attachObserver(RobotObserver ro)
    {
        observers.add(ro);
    }
    
    public void detachObserver(RobotObserver ro)
    {
        observers.remove(ro);
    }
    
    public abstract void notifyObservers();
}
