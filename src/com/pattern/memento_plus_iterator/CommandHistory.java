package com.pattern.memento_plus_iterator;

import java.util.ArrayList;

class CommandHistory {
    private ArrayList<Command> history = new ArrayList<>();

    void push(Command command){
        history.add(0,command);
    }

    Command pop(){
        return history.remove(0);
    }
}
