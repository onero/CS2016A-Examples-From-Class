/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016astrategypattern;

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
        String text = "all carneys are evil!";
        TextDecorationStrategy uc
                = new StrategyUpperCase();
        TextDecorationStrategy wide
                = new StrategyWideSpacing();
        TextDecorationStrategy altCaps
                = new StrategyAltCaps();

        TextDecorator decorator
                = new TextDecorator(
                        altCaps,
                        wide,
                        new StrategySomManSiger());

        System.out.println("Før: "
                + text);
        System.out.println("Efter: "
                + decorator.applyStrategies(text));

        // TODO code application logic here
    }
    
    private static class StrategySomManSiger implements TextDecorationStrategy
    {
        @Override
        public String decorateText(String input)
        {
            return input + ", som man siger!";
        }
        
    }

}
