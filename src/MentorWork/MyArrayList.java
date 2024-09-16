package MentorWork;

import java.util.Arrays;

public class MyArrayList {
    static int size = 1;
    Object[] array;

    public MyArrayList() {
        this.array = new Object[10];
    }

    public void addList(Object obj) {
        if (size < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = obj;
                    size++;
                    return;
                }
            }
        } else {
            //array = Arrays.copyOf(array, (array.length * 2)+1);
            Object[] arrayNew = new Object[(array.length * 2) + 1];
            for (int j = 0; j < array.length; j++) {
                arrayNew[j] = array[j];
            }
            arrayNew[array.length] = obj;
            this.array = arrayNew;
        }
    }

    public void addList(int Index, Object obj) {
        if (Index < array.length) {
            if (array[Index] == null) {
                array[Index] = obj;
                size++;
            } else {
                size++;
                Object[] arrayNew = new Object[array.length];
                for (int j = Index + 1; j < array.length; j++) {
                    arrayNew[j] = array[j - 1];
                }
                // System.arraycopy(array, 0, arrayNew, 0, Index + 1);
                for (int i = 0; i < Index; i++) {
                    arrayNew[i] = array[i];
                }
                arrayNew[Index] = obj;
                this.array = arrayNew;
            }
        } else {
            //this.array = Arrays.copyOf(array, Index+1);
            Object[] arrayNew = new Object[Index + 1];
            for (int j = 0; j < array.length; j++) {
                arrayNew[j] = array[j];
            }
            arrayNew[Index - 1] = obj;
            this.array = arrayNew;
        }
    }

    public void delList(int Index) {
        for (int j = Index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

class Start {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.addList(1);
        list.addList(2);
        list.addList(3, 34);
        list.addList(3, 56);
        list.addList(3, 78);
        list.addList(11, 90);
        list.addList(1);
        list.addList(2);
        list.addList(1);
        list.addList(2);
        list.addList(11);
        list.addList(21);
        list.addList(22);
        list.addList(11);
        list.addList(21);
        list.addList(13, 522);
        System.out.println(list);
        list.delList(3);
        list.delList(4);
        System.out.println(list);
    }
}
