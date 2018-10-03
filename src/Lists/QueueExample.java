/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Cole
 */
public class QueueExample {

    public QueueExample() {
        Queue<Integer> queue = new LinkedList<>();
        //fills queue with 100 to 0   
        System.out.println("Loads the queue with the following:");
        for (int i = 0; i < 25; i++) {
            queue.add(i + 1);
            System.out.print((i + 1) + " ");
        }

        System.out.println("\n\nRemoves each memeber one by one");

        //outputs changed queue
        for (int i = 0; i < 25; i++) {
            for (Object item : queue) {
                System.out.print(item + " ");
            }
            System.out.println();
            queue.remove();
        }
    }

}
