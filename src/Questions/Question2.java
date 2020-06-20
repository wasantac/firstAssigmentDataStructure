/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import doubleNode.DoblyLinkedList;
import SimpleNode.SimplyLinkedList;

/**
 *
 * @author walte
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question 2A
        SimplyLinkedList<Integer> sl = new SimplyLinkedList<>();
        sl.addLast(1);
        sl.addLast(2);
        sl.addLast(3);
        sl.addLast(4);
        sl.addLast(5);
        sl.addLast(6);
        System.out.println("swap sinlgylinkedlist");
        System.out.println(sl);
        sl.swap(3);
        System.out.println(sl);
        System.out.println("");
        
        
        
        
        
        //Question 2B
        System.out.println("swap doblylinkedlist");
        DoblyLinkedList<Integer> db = new DoblyLinkedList<>();       
        db.addLast(1);
        db.addLast(2);
        db.addLast(3);
        db.addLast(4);
        db.addLast(5);  
        System.out.println(db);
        db.swap(4);
        System.out.println(db);
    }
    
}
