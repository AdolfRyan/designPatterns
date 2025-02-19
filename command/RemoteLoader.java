package command;

public class RemoteLoader {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    // --------------------------------------------------------
    // Light livingRoomLight = new Light("Living Room");
    // Light kitchenLight = new Light("Kitchen");
    // GarageDoor garageDoor = new GarageDoor("");
    // Stereo stereo = new Stereo("Living Room");

    // LightCommand livingRoomLightOn = new LightCommand(livingRoomLight);
    // LightCommand livingRoomLightOff = new LightCommand(livingRoomLight);
    // LightCommand kitchenLightOn = new LightCommand(kitchenLight);
    // LightCommand kitchenLightOff = new LightCommand(kitchenLight);
  
    // remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    // remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
  
    // System.out.println(remoteControl);
  
    // remoteControl.onButtonWasPushed(0);
    // remoteControl.offButtonWasPushed(0);
    // remoteControl.onButtonWasPushed(1);
    // remoteControl.offButtonWasPushed(1);

    // --------------------------------------------------------
    // CeilingFan ceilingFan = new CeilingFan("Living Room");
    // CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    // CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
    // CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    // remoteControl.setCommand(0, ceilingFanHigh, ceilingFanOff);
    // remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);

    // remoteControl.onButtonWasPushed(0);
    // remoteControl.offButtonWasPushed(0);

    // System.out.println(remoteControl);

    // remoteControl.onButtonWasPushed(1);

    // System.out.println(remoteControl);
    // remoteControl.undoButtonWasPushed();

    Light light = new Light("Living Room");
    CeilingFan ceilingFan = new CeilingFan("Living Room");

    LightCommand lightOn = new LightCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);

    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

    Command[] partyOn = { lightOn, ceilingFanHigh };
    Command[] partyOff = { lightOff, ceilingFanOff };

    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);

    remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(0);

  }

}
