/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj= new MyBinarySearchTree();
        obj.insert(11);
        obj.insert(13);
        obj.insert(8);
        obj.insert(9);
        obj.insert(15);
        obj.insert(7);
        obj.insert(20);
        MyQueue obj1 = new MyQueue();
        obj1.preOrderSucc(obj.root);
        System.out.print("Pre-Order Successor of all the nodes are: ");
        obj1.dispPreOrderSucc();
    }
}
