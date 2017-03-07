/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author jeppjleemoritzled
 */
public class ImageNode extends GraphicNode
{
    private Image img;

    public ImageNode(Image img, GraphicsContext context, int x, int y)
    {
        super(context, x, y);
        this.img = img;
    }
    
    @Override
    public void drawNode()
    {
        super.getContext().drawImage(img, 
                super.getX(), super.getY());
        
        for (GraphicNode graphicNode : super.getChildren())
        {
            graphicNode.drawNode();
        }
    }
}
