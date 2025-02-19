package command;

public class GarageDoorCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.lightOn();
  }
  
}
