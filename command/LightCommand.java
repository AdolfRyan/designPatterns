package command;

public class LightCommand extends Command {
  Light light;

  public LightCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }

}
