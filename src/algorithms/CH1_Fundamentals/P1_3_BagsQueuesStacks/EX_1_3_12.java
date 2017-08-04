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
public class EX_1_3_12 {
    
    public static Stack<String> copy(Stack<String> stack) {
        Stack<String> newStack = new Stack<>();
        for (String s: stack) {
            newStack.push(s);
        }
        return newStack;
    }
    
    public static void main (String arg[]) {
        Stack<String> orig = new Stack<>();
        orig.push("I");
        orig.push("AM");
        orig.push("THE");
        orig.push("STACK");
        
        Stack<String> copy = copy(orig);
        
        StdOut.println(copy);
    }
    
}
