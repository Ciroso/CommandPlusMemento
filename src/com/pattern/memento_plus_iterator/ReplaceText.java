package com.pattern.memento_plus_iterator;

public class ReplaceText extends Command {
    private String replace;

    ReplaceText(ConcreteEditor ce, String s) {
        concreteEditor = ce;
        replace = s;
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("text");
        concreteEditor.setText(replace);
    }
}
