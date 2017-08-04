/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.CH1_Fundamentals.P1_3_BagsQueuesStacks;

import java.util.NoSuchElementException;

/**
 *
 * @author Larry Osakwe
 */
public class ResizingArrayQueueOfStrings {

    private String[] q;
    private int N;
    private int first;
    private int last;

    public ResizingArrayQueueOfStrings() {
        q = new String[2];
        N = 0;
        first = 0;
        last = 0;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private void resize(int capacity) {
        String[] temp = new String[capacity];
        for (int i = 0; i < N; i++) {
            temp[i] = q[(first + 1) % q.length];
        }
        q = temp;
        first = 0;
        last = N;
    }
    
    public void enqueue(String s) {
        if (q.length == N) {
            resize(2*q.length);
        }
        q[last++] = s;
        if (last == q.length) {
            last = 0;
        }
        N++;
    }
    
    public String dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        String string = q[first];
        q[first] = null;
        N--;
        first++;
        if (first == q.length) {
            first = 0;
        }
        if (N>0 && N == q.length/4) {
            resize (q.length/2);
        }
        return string;
    }

}
