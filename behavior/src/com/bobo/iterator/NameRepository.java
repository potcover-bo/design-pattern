package com.bobo.iterator;

/**
 * Created by evildoerDb on 2018/7/19 10:27
 */
public class NameRepository implements Container {

    private String [] names = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements MyIterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
