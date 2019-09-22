package com.pattern.memento_plus_iterator;

public class SetSize extends Command {
    private int size;

    SetSize(ConcreteEditor ce, int s){
        concreteEditor = ce;
        size = s;
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("size");
        concreteEditor.setSize(size);
    }
}
