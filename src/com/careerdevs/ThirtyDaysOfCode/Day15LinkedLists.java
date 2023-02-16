package com.careerdevs.ThirtyDaysOfCode;

import org.w3c.dom.Node;

public class Day15LinkedLists {


        public static Node insert(Node head, int data) {
            //Complete this method

            // this is where we hold the data
            int data ;

            // this is where we store the pointer to go to the next node
            Node next;

            // we will also  build a constructor to assign a node value.

          /*  public node(int d , Node nxt){
                data = d ;
                next = nxt;
            }
            */

            // then we will build out setters and getters as if we are creating a normal class.


            // we are calling the node constructor created and passing in the data
            Node newNode = new Node(data);

            // if the head parameter is equal to null, return the newNode we declared above..
            if (head == null) {
                return newNode;
            }
            // otherwise we should start at the head and iterate throughh the list.
            Node start = head;
            // iterate through node while node is not equal to null
            while (start.next != null) {
                // we will intialize the head node based off the conditional to the next.
                start = start.next;
            }
            // we set it to next so it can access the next val
            start.next = newNode;


            return head;
        }

    }
