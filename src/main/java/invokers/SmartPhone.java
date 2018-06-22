package invokers;

import commands.Command;

public class SmartPhone  implements Invoker{

    private Command command;

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    public void tapPowerIcon() {
        this.command.execute();
    }
}
