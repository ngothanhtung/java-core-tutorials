/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;

import java.io.IOException;

/**
 *
 * @author user
 */
public class Quiz {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {        
        /*
        for (int i = 1; i <= 5; i++) {
            Question q = new Question();
            q.enter(i);            
        }
        */
        
        int score = 0;
        for (int i = 1; i <= 8; i++) {
            Question q = new Question();
            q.readFromFile(i);
            boolean result = q.play();
            if (result == true) {
                score++;
            }
        }
        System.out.println("YOUR SCORE: " + score);
    }    
}
