/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessgame;

import javax.swing.UIManager;

/**
 *
 * @author nmarks3
 */
public class NumberGuessStart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // do nothing, this can safely be ignored because
            // it will fall back to the basic metal L&F if something
            // goes wrong. This is also a rare example of a scenario
            // where the catch clause could be safely eliminated.
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NumberGuessGUI().setVisible(true);
               
            }
        }); 
        
    }
    }


