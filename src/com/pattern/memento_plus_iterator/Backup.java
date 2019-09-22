package com.pattern.memento_plus_iterator;

public class Backup implements Memento {
    private ConcreteEditor concreteEditor;
    private String text;
    private int size;

    Backup(String t, int s, ConcreteEditor ce){
        text = t;
        size = s;
        concreteEditor = ce;
    }

    @Override
    public void restore() {
        concreteEditor.reload(text,size);
    }
}
