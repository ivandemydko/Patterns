package patterns.behavioral.iterator.collection;

import patterns.behavioral.iterator.iterator.MyCollectionIterator;
import patterns.behavioral.iterator.iterator.MyIterator;

public class MyCollection {
    private String[] strings;

  public   MyCollection(int size) {
        strings = new String[size];
    }

   public MyCollection() {
        strings = new String[5];
    }

   public void insert(int index, String item) {
        strings[index] = item;
    }

    public String[] getStrings() {
        return strings;
    }

   public MyIterator iterator() {
        return new MyCollectionIterator(this);
    }
}
