package com.pattern.memento_plus_iterator;

public abstract class Command {
    ConcreteEditor concreteEditor;
    private Memento backup;

    private void makeBackup(){
        backup = concreteEditor.save();
    }

    void restoreBackup(){
        backup.restore();
    }

    public void execute(){
        makeBackup();
        System.out.print("Modified ");
    }
}
