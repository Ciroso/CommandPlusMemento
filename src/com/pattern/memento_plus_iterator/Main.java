package com.pattern.memento_plus_iterator;

public class Main {

    public static void main(String[] args) {
        ConcreteEditor ce = new ConcreteEditor();
        Application application = new Application();
        application.executeCommand(new ReplaceText(ce,"Hello, World!"));
        application.executeCommand(new SetSize(ce,42));
        application.executeCommand(new ReplaceText(ce,"Hey there!"));
        application.undo();
        application.undo();
        application.undo();


    }
}
