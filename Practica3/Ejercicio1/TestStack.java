package Practica3.Ejercicio1;

public class TestStack {
    public static void main (String[] args){
        Stack stack = new Stack();
        stack.push("elemento1");
        stack.push("elemento2");
        stack.push("elemento3");

        Stack.StackIterator iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i=0; i<3; i++){
            System.out.println(stack.pop());
        }
    }
}
