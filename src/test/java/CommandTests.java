import commands.TurnOffCommand;
import commands.TurnOnCommand;
import invokers.RemoteControl;
import invokers.SmartPhone;
import org.junit.Test;
import receivers.TvReceiver;

import static junit.framework.TestCase.assertEquals;

public class CommandTests {

    @Test
    public void canTurnOnTvWithRemoteControl() {
        RemoteControl control = new RemoteControl();
        TvReceiver myTv = new TvReceiver();

        control.setCommand(new TurnOnCommand(myTv));
        control.pressPowerButton();

        assertEquals(true, myTv.turnedOn());
    }

    @Test
    public void canTurnOffTvWithRemoteControl() {
        RemoteControl control = new RemoteControl();
        TvReceiver myTv = new TvReceiver();

        control.setCommand(new TurnOffCommand(myTv));
        control.pressPowerButton();

        assertEquals(false, myTv.turnedOn());
    }

    @Test
    public void canTurnOnTvWithSmartPhone() {
        SmartPhone phone = new SmartPhone();
        TvReceiver myTv = new TvReceiver();

        phone.setCommand(new TurnOnCommand(myTv));
        phone.tapPowerIcon();

        assertEquals(true, myTv.turnedOn());
    }

    @Test
    public void canTurnOffTvWithSmartPhone() {
        SmartPhone phone = new SmartPhone();
        TvReceiver myTv = new TvReceiver();

        phone.setCommand(new TurnOffCommand(myTv));
        phone.tapPowerIcon();

        assertEquals(false, myTv.turnedOn());
    }
}
