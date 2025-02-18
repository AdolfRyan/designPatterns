package command;

public class GarageDoorCommand extends Command {
  GarageDoor garageDoor;

  public GarageDoorCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  public void execute() {
    garageDoor.lightOn();
  }
  
}
