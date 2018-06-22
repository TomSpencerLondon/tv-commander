package commands;

import receivers.TvReceiver;

public class TurnOnCommand implements Command {

    private final TvReceiver tv;

    public TurnOnCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }
}
