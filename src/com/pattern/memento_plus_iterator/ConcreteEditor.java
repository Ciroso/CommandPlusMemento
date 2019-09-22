package com.pattern.memento_plus_iterator;

public class ConcreteEditor implements Editor {
    private String text;
    private int size;

    ConcreteEditor(){
        text = "Default";
        size = 8;
        show();
    }

    private void show(){
        System.out.println("text: " + text);
        System.out.println("size: " + size);
        System.out.println();
    }

    void setText(String newText) {
        text = newText;
        show();
    }

    void setSize(int newSize) {
        size = newSize;
        show();
    }

    void reload(String t, int s){
        text = t;
        size = s;
        System.out.println("Restored");
        show();
    }

    @Override
    public Memento save() {
        return new Backup(text,size,this);
    }
}
