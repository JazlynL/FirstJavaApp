package com.careerdevs.ThirtyDaysOfCode;

import org.w3c.dom.Node;

public class Day24NodeSorting {

    public static Node removeDuplicates(Node head) {
        //Write your code here


     // we will intialize a new node to the head of the node, node is only intialized to the top value.
          Node  newNode = head;

          // so if the currnt node or the next node is not null continue the iteration throygh the node
        // we set the conditional that if it its not equal to the current node //
        // if  the next one is also not equal to null, we can continue the loop
        while( newNode !=null && newNode.next != null){
            // the data is equal to the next piece of data, which is what we want to avoid , duplicates
            if(newNode.data == newNode.next.data){
                // so we'll set the next one to the next.next piece of data
                newNode.next = newNode.next.next;
            }else{
                // OTHERWISE if there is no duplicates, you will set the  current node to the next  node.
                newNode = newNode.next;
            }


        }
        // return the head
        return head;


// A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

// A removeDuplicates function is declared in your editor, which takes a pointer to the  node of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.

// Note: The  pointer may be null, indicating that the list is empty. Be sure to reset your  pointer when performing deletions to avoid breaking the list.



    }
}
