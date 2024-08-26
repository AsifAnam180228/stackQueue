package com.asifanam;

import java.util.ArrayList;
import java.util.Stack;

public class StacksB {
   static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();

       public static boolean isEmpty(){
           return list.isEmpty();
       }

       public static void push(int data){
           list.add(data);
       }
       public static int pop(){
           if(isEmpty()){
               return -1;
           }
           else {
               int top = list.get(list.size()-1);
//               System.out.println("Popped: "+top);
               return list.remove(list.size()-1);
           }
       }
         public static int peek(){
              if(isEmpty()){
                return -1;
              }
              else {
                int top = list.get(list.size()-1);
                return top;
              }
         }
   }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
