package invokers;

import commands.Command;

public class RemoteControl implements Invoker {

    private Command command;

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressPowerButton() {
        this.command.execute();
    }
}
