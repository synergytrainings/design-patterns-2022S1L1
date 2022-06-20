package Singleton.real;

public class Main {
  public static void main(String[] args) {

    Thread openThread =
        new Thread(
            () -> TheBridge.getInstance().open());

    Thread closeThread =
        new Thread(
            () -> TheBridge.getInstance().close());

    openThread.start();
    closeThread.start();
  }
}
