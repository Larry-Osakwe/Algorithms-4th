/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.CH1_Fundamentals.P1_3_BagsQueuesStacks;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author Larry Osakwe
 */
public class EX1_3_11 {

    public static String EvaluatePostFix(String s) {

        Stack<Double> vals = new Stack<>();
        String[] input = s.split(" ");
        for (int i = 0; i < input.length; i++) {
            String c = input[i];
            if (c.equals("+")) {
                vals.push(vals.pop() + vals.pop());
            } else if (c.equals("*")) {
                vals.push(vals.pop() * vals.pop());
            } else {
                vals.push(Double.parseDouble(c));
            }
        }
        return vals.toString();
    }
    
    public static void main(String args[]) {
        String input = "2 3 4 + 5 6 * * +";
        StdOut.println(EvaluatePostFix(input));
    }
    
}

