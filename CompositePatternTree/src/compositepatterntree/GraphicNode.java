/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class GraphicNode
{
    private GraphicsContext context;
    private int x,y;
    private List<GraphicNode> children = new ArrayList();

    public GraphicNode(GraphicsContext context, int x, int y)
    {
        this.context = context;
        this.x = x;
        this.y = y;
    }
    
    public void addChild(GraphicNode node)
    {
        children.add(node);
    }
    
    public void removeChild(GraphicNode node)
    {
        children.remove(node);
    }
    
    public List<GraphicNode> getChildren()
    {
        return children;
    }
    
    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Get the value of context
     *
     * @return the value of context
     */
    public GraphicsContext getContext()
    {
        return context;
    }

    /**
     * Set the value of context
     *
     * @param context new value of context
     */
    public void setContext(GraphicsContext context)
    {
        this.context = context;
    }
    
    public abstract void drawNode();

}
