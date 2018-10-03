/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Lists.QueueExample;
import Map.HashMapExample;
import Set.HashSetExample;
import Tree.BinaryTreeExample;

/**
 *
 * @author Cole
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("QUEUE========================================================");
        QueueExample queue = new QueueExample();
        
        System.out.println();
        
        System.out.println("HASHMAP========================================================");
        HashMapExample hashMap = new HashMapExample();
        
        System.out.println();
        
        System.out.println("HASHSET========================================================");
        HashSetExample hashSet = new HashSetExample();
        
        System.out.println();
        
        System.out.println("BINARYTREE========================================================");
        BinaryTreeExample binaryTree = new BinaryTreeExample();
        binaryTree.showFluency();
     

    }

}
