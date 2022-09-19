package com.careerdevs.ThirtyDaysOfCode;
/*
Heap : root has special relations w/
children but children have no relationship w/
eachother

mini - heap:
-smaller data higher in the tree
- smallest element as a root.
-Children must be smaller than parent.

max heap
- largest element as a root

 a height of a tree is described as number
 of edges in longest path to a leaf node.

 --
 height of tree == height of the  root node.

 psuedo code notes


 findHeight(root){
 if(root is null)
 return -1;
 a height of a binary tree is broken in two parts

 leftHeight and RightHeight

 overall max of Binary tree will be
 max(leftHeight,RightHeight)+1;

 Time complexity is running on Big o notation O(n);






*/

import org.w3c.dom.Node;

public class Day22Binarytrees {
    public static int getHeight(Node root){
        //Write your code here

        // if root is equal to null we want  have it return -1 , because 0 will
        //continue.. it
        if(root == null){
            return -1;
        }
        // if theses are both null return 0;
        if(root.left == null && root.right == null){
            return 0;
        }
        // Using Math.Max method to get the height of each side + 1;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;


        //Task
// The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, , pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
        // alternative way !!!!!
        public static int getHeight(Node root){
            //Write your code here

            //continue.. it
            if(root == null){
                return -1;
            }
            int lHeight =  getHeight(root.left) +1 ;
            int rHeight = getHeight(root.right) +1;

            if(lHeight > rHeight){
                return lHeight;
            }else {
                return rHeight;
            }


    }
}
