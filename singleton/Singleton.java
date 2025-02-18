public class Singleton {
  private volatile static Singleton uniqueInstance;

  private Singleton() {
    if (uniqueInstance != null) {
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
      return uniqueInstance;
    }
  }
}
