/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterntree;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainViewController implements Initializable
{
    
    @FXML
    private Canvas myCanvas;
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        GraphicsContext context = myCanvas.getGraphicsContext2D();
        GraphicNode top = new TextNode(
                "Hej, vi tegner tekst *GK*", context, 100, 100);
        
        GraphicNode subNode = new TextNode(
                "Ses vi? *SK*", context, 200, 150);
        
        GraphicNode subImgNode = new ImageNode(
                new Image(
                        getClass().getResourceAsStream(
                                "justin-bieber-avatar.png")), 
                context, 250, 250);
        
        top.addChild(subNode);
        top.addChild(subImgNode);
        
        subNode.drawNode();

//context.fillText("Hej, vi tegner tekst *GK*", 150, 150);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
