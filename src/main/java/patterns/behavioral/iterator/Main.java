package patterns.behavioral.iterator;

import patterns.behavioral.iterator.collection.MyCollection;
import patterns.behavioral.iterator.iterator.MyIterator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.insert(0,"one");
        collection.insert(1,"two");
        collection.insert(2,"three");
        collection.insert(3,"four");

        System.out.println(Arrays.toString(collection.getStrings()));

        MyIterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
