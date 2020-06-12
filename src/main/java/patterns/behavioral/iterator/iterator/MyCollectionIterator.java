package patterns.behavioral.iterator.iterator;

import patterns.behavioral.iterator.collection.MyCollection;

public class MyCollectionIterator implements MyIterator {
    private MyCollection myCollection;
    int currentPosition;

    public MyCollectionIterator(MyCollection myCollection) {
        this.myCollection = myCollection;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        if (myCollection.getStrings().length - 1 > currentPosition) {
            String next = myCollection.getStrings()[currentPosition];
            return next != null;
        }
        return false;
    }

    @Override
    public String next() {
        return myCollection.getStrings()[currentPosition++];
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
