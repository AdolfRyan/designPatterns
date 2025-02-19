package command;

public class Stereo {
  String location = "";

  public Stereo(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println("Stereo is on");
  }

  public void off() {
    System.out.println("Stereo is off");
  }

  public void setCd() {}

  public void setDvd() {}

  public void setRadio() {}

  public void setVolume(int num) {
    System.out.println("Stereo volume set to " + num);
  }
}