# TV Commander :tv:
This repo demonstrates the Command pattern in the context of turning a TV on and off.

## How it works
We have 3 key roles in this pattern:
* Invoker - invokes one or more commands.
* Command - performs some action within receiver.
* Receiver - performs some action, initiated by the command.

Let's explain the source code using the above terminology. One scenario is if we want to turn on the TV using a remote
control:
* Invoker - remote control.
* Command - turn on TV.
* Receiver - TV.

Within this repository we have the aforementioned modelled as classes:
* [Remote Control](./src/main/java/invokers/RemoteControl.java)
* [TurnOnCommand](./src/main/java/commands/TurnOnCommand.java)
* [TV](./src/main/java/receivers/TvReceiver.java)

Now let's take a look at some code which demonstrates the above working together:
```java
// Create a remote control
RemoteControl control = new RemoteControl();

// Create a TV
TvReceiver myTv = new TvReceiver();

// Set the command on the control, so when it is pressed it will know which command to execute
control.setCommand(new TurnOnCommand(myTv));

// Interact with the control, triggering a command, which in-turn turns the TV on
control.pressPowerButton();
```
One of the nice features about the above is we can switch out the invokers very easily, see
[the tests](./src/test/java/TvReceiverShould.java) for examples of this where we use a Smart Phone instead.

You might be wondering, what if we wish to perform the inverse (i.e. switching off the TV). The good news is that it is
very straightforward, all we need to do is change the parameter of `setCommand` to the below:
```java
control.setCommand(new TurnOffCommand(myTv));
```
Now when we press the power button of the Remote Control it will turn off the TV instead.