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
public class EX_1_3_9 {

    public static void main(String args[]) {
        StdOut.print("Input expression: ");
        String expression = " 1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        //Create array without spaces
        String[] input = expression.split(" ");
        Stack<String> ops = new Stack<>();
        Stack<String> exp = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            String c = input[i];
            if (c.equals("+") || c.equals("-") || c.equals("*")
                    || c.equals("/")) {
                ops.push(c);
            } else if (c.equals(")")) {
                String op = ops.pop();
                String exp1 = exp.pop();
                String exp2 = exp.pop();
                String temp = new StringBuilder("(").append(exp2).append(op)
                        .append(exp1).append(")").toString();
                exp.push(temp);
            } else {
                exp.push(c);
            }
        }
        StdOut.println(exp);
        System.out.println(input[1]);
    }
}
