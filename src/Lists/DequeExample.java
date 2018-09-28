/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.LinkedList;
import java.util.Deque;

/**
 *
 * @author Cole
 */
public class DequeExample {

    public DequeExample() {
        Deque<Integer> deque = new LinkedList<>();
        boolean first = true;
        //fills queue with 100 to 0   
        System.out.println("Alternates between adding first and last");
        for (int i = 25; i > 0; i--) {
            if (first) {
                deque.addFirst(i);
                first = false;
            }
            else {
                deque.addLast(i);
                first = true;
            }
        }

        //shows deque
        for (Object item : deque) {
            System.out.print(item + " ");
        }

        first = true;
        System.out.println("\n\nAlternates between removing first and last");

        //outputs changed deque
        for (int i = 0; i < 25; i++) {
            for (Object item : deque) {
                System.out.print(item + " ");
            }
            if (first) {
                deque.removeFirst();
                first = false;
            }
            else {
                deque.removeLast();
                first = true;
            }
            System.out.println();
        }
    }

}
