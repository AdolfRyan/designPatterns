package command;

public class RemoteControlTest {
  public static void main(String[] args) {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightCommand lightOn = new LightCommand(light);
    GarageDoor garageDoor = new GarageDoor();
    GarageDoorCommand garageDoorOpen = new GarageDoorCommand(garageDoor);

    remote.setCommand(lightOn);
    remote.buttonWasPressed();

    remote.setCommand(garageDoorOpen);
    remote.buttonWasPressed();
  }
}
