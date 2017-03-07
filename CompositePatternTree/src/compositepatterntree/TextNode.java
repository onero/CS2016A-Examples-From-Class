/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author jeppjleemoritzled
 */
public class TextNode extends GraphicNode
{
    private String str;
    
    public TextNode(String str, GraphicsContext context, int x, int y)
    {
        super(context, x, y);
        this.str = str;
    }

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

    @Override
    public void drawNode()
    {
        super.getContext().fillText(str, 
                super.getX(), super.getY());
        
        for (GraphicNode graphicNode : super.getChildren())
        {
            graphicNode.drawNode();
        }
    }
}
