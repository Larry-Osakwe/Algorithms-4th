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
public class EX_1_3_04 {
    private static final char LEFT_BRACKET = '[';
    private static final char LEFT_PARENTHESES = '(';
    private static final char LEFT_CURLYBRACKET = '{';
    private static final char RIGHT_BRACKET = ']';
    private static final char RIGHT_PARENTHESES = ')';
    private static final char RIGHT_CURLYBRACKET = '}';
    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //if left variant, push to stack
            if (s.charAt(i) == LEFT_BRACKET) stack.push(LEFT_BRACKET);
            if (s.charAt(i) == LEFT_PARENTHESES) stack.push(LEFT_PARENTHESES);
            if (s.charAt(i) == LEFT_CURLYBRACKET) stack.push(LEFT_CURLYBRACKET);
            
            //if right variant, check that there is a corresponding left variant
            if (s.charAt(i) == RIGHT_BRACKET)
                if (stack.isEmpty()) return false;
                else if (stack.pop() != LEFT_BRACKET) {
                    return false;
                }
            if (s.charAt(i) == RIGHT_PARENTHESES)
                if (stack.isEmpty()) return false;
                else if (stack.pop() != LEFT_PARENTHESES) {
                    return false;
                }
            if (s.charAt(i) == RIGHT_CURLYBRACKET)
                if (stack.isEmpty()) return false;
                else if (stack.pop() != LEFT_CURLYBRACKET) {
                    return false;
                }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        //returns true
        String f = "{([][])}()()";
        StdOut.println(isBalanced(f));
        //returns false
        String k = "}(){";
        StdOut.println(isBalanced(k));
    }
    
    
    
    
}
