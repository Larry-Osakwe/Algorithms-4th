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
public class EX_1_3_10 {

    public static String infixToPostfix(String s) {

        StringBuilder postfix = new StringBuilder();
        String[] input = s.split(" ");
        Stack<String> ops = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            String c = input[i];
            if (c.equals("+")) ops.push(c);
            else if (c.equals("*")) ops.push(c);
            else if (c.equals(")")) postfix.append(ops.pop()).append(" ");
            else if (c.equals("(")) postfix.append("");
            else postfix.append(c).append(" ");
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String input = "( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )";
        StdOut.println(infixToPostfix(input));

    }

}
