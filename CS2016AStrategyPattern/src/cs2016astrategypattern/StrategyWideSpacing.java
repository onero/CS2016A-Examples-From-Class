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
public class StrategyWideSpacing implements TextDecorationStrategy
{

    @Override
    public String decorateText(String input)
    {
        char[] charsinString = input.toCharArray();
        String decoratedString = "";
        for (char c : charsinString)
        {
            decoratedString += c + " ";
        }
        return decoratedString;
    }
    
}
