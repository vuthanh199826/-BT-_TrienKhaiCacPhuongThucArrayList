import java.util.Arrays;

public class MyList<E> {
private int size = 0;
private static final int DEFAUTCAP = 10;
private Object elements[];

    public MyList() {
        elements = new Object[DEFAUTCAP];
    }

    public MyList(int cap) {
        elements = new Object[cap];
    }
    public void add(int index , E element){
       if(index<0 || index>size){
           throw new IndexOutOfBoundsException("Error");
       }else if(size == elements.length){
           elements = Arrays.copyOf(elements,size+1);
           size++;
       }else {
           for (int i = index; i <size ; i++) {
               elements[i+1] = elements[i];
           }
           elements[index] = element;
           size++;
       }
    }
    public E remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        E obj = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return obj;
    }
    public int size(){
        return this.size;
    }

    public boolean contains(E o){
        for (int i = 0; i < size; i++) {
            if(elements[i]== o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(elements[i] == o){
                return i;
            }
        }
        return -1;
    }

    public void ensureCap(int minCap){
        if(minCap > elements.length){
            elements = Arrays.copyOf(elements,minCap);
        }
    }
    public E get(int i){
        return (E) elements[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size=0;
    }


}
