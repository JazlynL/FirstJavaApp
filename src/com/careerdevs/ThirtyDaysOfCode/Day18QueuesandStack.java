package com.careerdevs.ThirtyDaysOfCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18QueuesandStack {
    public class Solution {
        // Write your code here.

        // creating two instances of a variable , one is a stack variable and the other is
        // a queue variable

        Queue<Character> queue = new LinkedList<>();
        Stack <Character> newStack = new Stack<>();

        // we want to  an empty method a void pushCharacter(char ch ) that push a character into the stack.

        public  void pushCharacter(char ch){
            newStack.push(ch);
        }
        //A void enqueueCharacter(char ch) method that enqueues a character in the  instance variable.
        public void enqueueCharacter(char ch){
            queue.add(ch);
        }


        //A char popCharacter() method that pops and returns the character at the top of the  instance variable.

        public char popCharacter(){
            return newStack.peek();
        }

        //A char dequeueCharacter() method that dequeues and returns the first character in the  instance variable.

        public char dequeueCharacter(){
            queue.remove(0);
            return queue.peek();
        }
}
