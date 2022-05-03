package it.isa.pattern;

/**
 * MyIterator
 */
interface MyIterator {
    void rewind();
    int nextElement();
    boolean hasNextElement();
}

/**
 * MyCollection
 */
interface MyCollection {
    public MyIterator getIter();    
}

/**
 * MyListArray
 */
class MyListArray implements MyCollection{
    public int[] lista;

    public MyListArray(int n) {
        lista = new int[n];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = i * 10;
        }
    }

    @Override
    public MyIterator getIter() {
        // TODO Auto-generated method stub
        return new MyListIterator(this);
    }
}

/**
 * MyListIterator implements MyIterator
 */
class MyListIterator implements MyIterator {
    private int index= -1;
    private int[] lista;

    public MyListIterator(MyListArray la){
        lista = la.lista;
    }

    @Override
    public void rewind() {
        // TODO Auto-generated method stub
        index = -1;
    }

    @Override
    public int nextElement() {
        // TODO Auto-generated method stub
        return lista[++index];
    }

    @Override
    public boolean hasNextElement() {
        // TODO Auto-generated method stub
        return index < lista.length-1;
    }

    
}

public class IteratorPattern {
    public static void esegui(){
        System.out.println("IteratorPattern");
        MyCollection la = new MyListArray(10);
        MyIterator li = la.getIter();

        while(li.hasNextElement()){
            System.out.println("Element: " + li.nextElement());
        }
    }
}