/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboard;


import java.awt.*;
import java.applet.Applet;
/**
 *
 * @author Ebenezer
 */
public class Checkboard extends Applet {
static int N = 15;
    /**
     * @param args the command line arguments
     */
 
    /**
     *
     */
   
      public void paint(Graphics g) {
        int x, y;
        for (int row = 0; row < N; row++) {

            for (int col = 0; col < N; col++) {

                x = col * 20;

                y = row * 20;

                if ((col % 2 == 0) != (row % 2 == 0)) {
                } else {
                    g.drawString("*", x, y);
                }
            }
        }
      }
}

