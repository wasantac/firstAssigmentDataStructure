/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author walte
 */
public class MinStack<E> {

    private LinkedList<E> stack;
    private LinkedList<E> min;

    Comparator<E> f;

    public MinStack(Comparator<E> f) {
        stack = new LinkedList<>();
        min = new LinkedList<>();
        this.f = f;
    }

    public boolean push(E element) {
        if (element == null) {
            return false;
        }
        stack.add(element);
        if (min.isEmpty()) {
            min.addLast(element);
        } else {
            if (f.compare(element, min.getLast()) > 0) {
                min.addLast(min.getLast());
            }
            else{
                min.addLast(element);
            }
        }
        System.out.println(min.toString());
        return true;
    }

    public boolean pop() {
        if (stack.isEmpty()) {
            return false;
        }
        stack.removeLast();
        min.removeLast();
        return true;
    }

    public int size() {
        return stack.size();
    }

    public E getMin() {
        return min.getLast();
    }

    public LinkedList<E> getStack() {
        return stack;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
    

}
