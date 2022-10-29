package com.careerdevs.ThirtyDaysOfCode;

public class Day23BSTLevelTraversalOrder {

    static void levelOrder(Node root){
        //Write your code here


        //---TASK--
        //A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom.
        // You are given a pointer, , pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.


        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<Node>();

        // .offer in the Queue Class,.. The Offer MEthod in the Queue class
        //takes in a parameter ...    offer(E e)
        // what offer does in the queue class. Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        q.offer(root);





        // we want to use a while conditional to  see while the root is not empty,
        // we already inserted the root at the head of the tree ^^^above.
        // we want to run this while loop until the queue is empty
        while(!q.isEmpty()){
            // we want to use poll because it will work in a first in -first out basis.
            // so we want to retreiev and remove  the first element
            // opposite of peek which will just retrieve the first element
            // whatever value we pull from the q ,
            Node temp = q.poll();
n
            // this how we are able to print the data
            System.out.print(temp.data + " ");

            // if this left side of the binary tree is not empty.

            if(temp.left != null){
                //  then we will offer the left side of the q.

                q.offer(temp.left);

            }if(temp.right!= null){
                q.offer(temp.right);
            }

        }




    }

}
