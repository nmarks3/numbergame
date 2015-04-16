/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessgame;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nmarks3
 */
public class NumberGuessService {
    private int answer;
    private String guide;
    
    public NumberGuessService() {
       
    }  
    
    public void checkGuess(String guess1) throws NumberFormatException{
        int guess = Integer.parseInt(guess1);
        try {
        if (guess == answer) {
            guide = "Correct!";
        } else if (guess > answer) {
            guide = "Too High";
        } else if (guess < answer) {
            guide = "Too Low";
        } } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "Please enter a number");
        }               
    }
    
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }



    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }
    
    
}
