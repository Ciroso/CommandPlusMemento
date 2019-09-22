package com.pattern.memento_plus_iterator;

class Application {
    private CommandHistory commandHistory;
    private Command actualCommand;

    Application() {
        commandHistory = new CommandHistory();
    }

    void executeCommand(Command newCommand) {
        actualCommand = newCommand;
        if (actualCommand != null) {
            actualCommand.execute();
            saveCommand();
        }
    }

    void undo() {
        actualCommand = commandHistory.pop();
        actualCommand.restoreBackup();
    }

    private void saveCommand() {
        commandHistory.push(actualCommand);
    }
}
