package Singleton.real;

import java.time.Instant;

public class TheBridge {

  private boolean isOpen = false;

  private TheBridge() {}

  public static TheBridge getInstance() {
    return Singleton.INSTANCE;
  }

  public synchronized void open() {
    if (!isOpen) {
      System.out.println(
          "Open the bridge: "
              + Instant.now().getEpochSecond()
              + " "
              + Thread.currentThread().getName());
      sleep();
      isOpen = true;
    } else {
      System.out.println(
          "It is opened "
              + Instant.now().getEpochSecond()
              + " "
              + Thread.currentThread().getName());
    }
  }

  private void sleep() {
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public synchronized void close() {
    if (isOpen) {
      System.out.println(
          "Close the bridge "
              + Instant.now().getEpochSecond()
              + " "
              + Thread.currentThread().getName());
      sleep();
      isOpen = false;
    } else {
      System.out.println(
          "It is closed "
              + Instant.now().getEpochSecond()
              + " "
              + Thread.currentThread().getName());
    }
  }

  private static class Singleton {
    private static final TheBridge INSTANCE = new TheBridge();
  }
}
