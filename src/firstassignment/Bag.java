/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author walte
 */
public class Bag<E> implements Uset<E> {
    private ArrayList<E> values;
    private ArrayList<Integer> count;

    public Bag() {
        this.values = new ArrayList<>();
        this.count = new ArrayList<>();
    }
    
    
    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean add(E element) {
        if(element == null) return false;
        if(values.isEmpty()){
            values.add(element);
        }
        else if(values.contains(element)){
            int index = values.indexOf(element);
            count.set(index, count.get(index)+1);
        }
        else{
            values.add(element);
            count.add(1);
        }
        return true;
    }

    @Override
    public E remove(E element) {
        if(element == null || !values.contains(element)) return null;
        int index = values.indexOf(element);
        if(count.get(index) > 1){
            count.set(index, count.get(index)-1);
            return element;
        }
        else{
            count.remove(index);
            values.remove(index);
            return element;
        }
        
    }

    @Override
    public E find(E element) {
        if(!values.contains(element) || element == null) return null;
        return element;
    }

    @Override
    public void clear() {
        values.clear();
        count.clear();
    }

    @Override
    public Iterator<E> iterator() {
        return values.iterator();
    }

    @Override
    public String toString() {
        return values.toString();
    }
    
    public ArrayList<E> findAll(E element){
        ArrayList<E> arr = new ArrayList<>();
        if(!values.contains(element)) return null;
        int index = values.indexOf(element);
        for(int i = 0;i < count.get(index);i++){
            arr.add(element);
        }
        return arr;
    }
}
