package commands;

import receivers.TvReceiver;

public class TurnOffCommand implements Command {

    private final TvReceiver tv;

    public TurnOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
