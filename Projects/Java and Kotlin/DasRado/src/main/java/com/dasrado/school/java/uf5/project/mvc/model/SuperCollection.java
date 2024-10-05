package com.dasrado.school.java.uf5.project.mvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SuperCollection<T> implements Collection<T>, Serializable {
    private Collection<T> collection;

    private Type type;

    public SuperCollection(Type type){
        this.type = type;

        switch (type){
            case array_list:
                collection = new ArrayList<>();
                break;
            case treeset:
                collection = new ArrayList<>();
                break;

        }
    }


    @Override
    public int size() {
        return collection.size();
    }

    @Override
    public boolean isEmpty() {
        return collection.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return collection.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return collection.iterator();
    }

    @Override
    public Object[] toArray() {
        return collection.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return collection.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return collection.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return collection.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return collection.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return collection.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return collection.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return collection.retainAll(c);
    }

    @Override
    public void clear() {
        collection.clear();
    }
}
