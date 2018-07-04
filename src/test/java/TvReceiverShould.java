import commands.TurnOffCommand;
import commands.TurnOnCommand;
import invokers.RemoteControl;
import invokers.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import receivers.TvReceiver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TvReceiverShould {

    private TvReceiver myTv;

    @Before
    public void setup() {
        myTv = new TvReceiver();
    }

    @Test
    public void beTurnedOnTvWithRemoteControl() {
        RemoteControl control = new RemoteControl();
        control.setCommand(new TurnOnCommand(myTv));

        control.pressPowerButton();

        assertThat(myTv.turnedOn(), is(true));
    }

    @Test
    public void beTurnedOffTvWithRemoteControl() {
        RemoteControl control = new RemoteControl();
        control.setCommand(new TurnOffCommand(myTv));

        control.pressPowerButton();

        assertThat(myTv.turnedOn(), is(false));
    }

    @Test
    public void beTurnedOnTvWithSmartPhone() {
        SmartPhone phone = new SmartPhone();
        phone.setCommand(new TurnOnCommand(myTv));

        phone.tapPowerIcon();

        assertThat(myTv.turnedOn(), is(true));
    }

    @Test
    public void beTurnedOffTvWithSmartPhone() {
        SmartPhone phone = new SmartPhone();
        phone.setCommand(new TurnOffCommand(myTv));

        phone.tapPowerIcon();

        assertThat(myTv.turnedOn(), is(false));
    }
}
