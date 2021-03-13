package MyArrayList;

public class MyArrayList<E> {
    private E[] values;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    public E get(int index) {
        return values[index];
    }

    public int size() {
        return values.length;
    }

    public void clear() {
        int size = values.length;
        values = (E[]) new Object[0];
    }

    public void add(Object object) {
        E[] temp = values;
        values = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, this.values, 0, temp.length);
        values[this.values.length - 1] = (E) object;
    }

    public void remove(int index) {
        E tempVar = values[index];
        E[] temp = values;
        values = (E[]) new Object[temp.length - 1];
        int j = 0;

        for(int i = 0; i < temp.length; ++i) {
            if (temp[i] != tempVar) {
                values[j] = temp[i];
                j++;
            }
        }

    }
}

