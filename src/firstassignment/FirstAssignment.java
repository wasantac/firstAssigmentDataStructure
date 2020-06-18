/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import doubleNode.DoblyLinkedList;

/**
 *
 * @author walte
 */
public class FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        DoblyLinkedList<String> db = new DoblyLinkedList<>();
        db.addLast("1st");
        db.addLast("2nd");
        db.addLast("3rd");
        db.addLast("4th");
        SimpleLinkedList<Integer> sl = new SimpleLinkedList<>();
        sl.addLast(1);
        sl.addLast(2);
        sl.addLast(3);
        sl.addLast(4);
        sl.addLast(5);
        sl.addLast(6);
        sl.swap(2);
        System.out.println("swap simplylinkedlist");
        System.out.println(sl);
        System.out.println("");
        DoblyLinkedList<Integer> db2 = new DoblyLinkedList<>();
        db2.addLast(1);
        db2.addLast(2);
        db2.addLast(3);
        db2.addLast(4);
        db2.addLast(5);  
        db2.swap(5);
        System.out.println("swap doblylinkedlist");
        System.out.println(db2);
        System.out.println("");
        System.out.println("Reverse");
        System.out.println(db);
        System.out.println(db.reverse());
        System.out.println(db);
        System.out.println("");
        stack.push("1st item");
        stack.push("2nd item");
        stack.push("3rd Item");
        System.out.println("Stack");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("");
        System.out.println("RandomQueue");
        RandomQueue<String> rq = new RandomQueue<>();
        rq.add("1");
        rq.add("2");
        rq.add("3");
        rq.add("4");
        System.out.println(rq);
        System.out.println(rq.remove());
        System.out.println("");
        System.out.println("Bag");
        Bag<String> bag = new Bag();
        bag.add("USA");
        bag.add("CANADA");
        bag.add("BRASIL");
        bag.add("USA");
        System.out.println(bag);
        System.out.println(bag.findAll("USA"));
        System.out.println(bag.remove("USA"));
        System.out.println(bag);
        System.out.println(bag.findAll("USA"));
        System.out.println("");
        System.out.println("MinStack");
        MinStack<Integer> min = new MinStack<>(((Integer i1,Integer i2) -> i1 - i2));
        min.push(10);
        min.push(3);
        min.push(2);
        min.push(5);
        min.push(1);
        min.push(4);
        System.out.println(min);
        System.out.println(min.getMin());
        min.pop();
        min.pop();
        System.out.println(min);
        System.out.println(min.getMin());
        
        
    }
    
}
