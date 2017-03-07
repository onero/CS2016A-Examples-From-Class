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
public class StrategyAltCaps implements TextDecorationStrategy
{

    @Override
    public String decorateText(String input)
    {
        char[] charsinString = input.toCharArray();
        String decoratedString = "";
        int i = 0;
        for (char c : charsinString)
        {
            if(i%2==0)
            {
                decoratedString += c;
            }
            else
            {
                decoratedString += 
                        Character.toString(c).toUpperCase();
            }
            i++;
        }
        return decoratedString;
    }
    
}
