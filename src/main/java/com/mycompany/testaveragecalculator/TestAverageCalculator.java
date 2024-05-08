/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testaveragecalculator;
import javax.swing.JOptionPane;

/*This program takes 3 test scores from user and displays it's average. all inputs taken and output diplayed are done through 
Dialogue boxes*/

public class TestAverageCalculator {

    public static void main(String[] args) {
        double score1;
        double score2;
        double score3;
        double average;
        String input;
        
        input = JOptionPane.showInputDialog("Enter score for test 1: ");
        score1 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter score for test 2: ");
        score2 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter score for test 3: ");
        score3 = Double.parseDouble(input);
        
        average = (score1 + score2 + score3)/3;
        
        JOptionPane.showMessageDialog(null,"Average of your test scores is: " + average);
        
        if (average>95)
        {
        JOptionPane.showMessageDialog(null,"That's a great score");
        }
        System.exit(0);
           
    }
    
}