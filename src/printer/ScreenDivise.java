/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author muhamedkakembo
 */
public class ScreenDivise {

    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        for (int i = 0; i < screenDevices.length; i++) {
            System.out.println(screenDevices[i]);
        }
        System.exit(0);
    }
}
