package Practica3.Ejercicio3;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Set;

public class StringConverterSet extends java.util.AbstractSet{

    private final Set<?> setOriginal;

    public StringConverterSet (Set<?> aSetOrinigal){this.setOriginal=aSetOrinigal;}

    @Override
    public int size() {
        return setOriginal.size();
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorStringAdapter();
    }

    public class IteratorStringAdapter implements Iterator<String> {
        private final Iterator<?> iteratorBase = setOriginal.iterator();

        @Override
        public boolean hasNext () {return iteratorBase.hasNext();}

        @Override
        public String next (){
            Object elemento = iteratorBase.next();
            return (elemento!=null) ? elemento.toString() : "null";
        }

        @Override
        public void remove (){
            iteratorBase.remove();
        }

    }
}
