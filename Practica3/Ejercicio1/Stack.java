package Practica3.Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {

    private java.util.ArrayList items;

    public Stack(){this.items=new ArrayList();}

    public void push (Object item){items.add(item);}

    public Object pop () {
        if (isEmpty()){return null;}
        return items.removeLast();
    }

    public boolean isEmpty (){return items.isEmpty();}

    public StackIterator iterator(){
        return new StackIterator();
    };

    public class StackIterator implements Iterator {
        private int cursor = items.size()-1;

        @Override
        public boolean hasNext(){
            return cursor >=0;
        }

        @Override
        public Object next(){
            Object item = items.get(cursor);
            cursor--;
            return item;
        }
    }
}
