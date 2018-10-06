/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.util.Random;

/**
 *
 * @author Cole
 */
public class BinaryTreeExample {

    Node root;

    public BinaryTreeExample() {

    }

    public BinaryTreeExample(int value) {
        root = new Node(value);
    }

    public Node getBinaryTree() {
        return root;
    }

    public void addNode(Node newNode, Node root) {
        if (newNode.value > root.value) {
            if (root.right != null) {
                addNode(newNode, root.right);
            }
            else {
                root.right = newNode;
            }
        }
        else {
            if (root.left != null) {
                addNode(newNode, root.left);
            }
            else {
                root.left = newNode;
            }
        }
    }

    public void printBinaryTree(Node root) {
        if (root == null) {
            return;
        }
        printBinaryTree(root.left);
        System.out.print(root.value + " ");
        printBinaryTree(root.right);
    }

    public void showFluency() {
        System.out.println("Fills a binary tree with random numbers and then prints them from smallest to greatest.");
        System.out.println();
        
        Random random = new Random();
        
        int showNum = random.nextInt(51);

        BinaryTreeExample binaryTree = new BinaryTreeExample(showNum);
        
        System.out.print("Filled with: ");
        
        System.out.print(showNum + " ");

        for (int i = 0; i < 20; i++) {
            showNum = random.nextInt(51);
            System.out.print(showNum + " ");
            binaryTree.addNode(new Node(showNum), binaryTree.getBinaryTree());
        }

        System.out.println();
        
        binaryTree.printBinaryTree(binaryTree.getBinaryTree());
    }

}
