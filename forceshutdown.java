
import java.awt.AWTException;
import java.awt.Robot;

public class nvop {
  public static void main(String[] args) throws AWTException, InterruptedException {
    Robot r = new Robot();
    r.keyPress(524);
    r.keyPress(88);
    Thread.sleep(15L);
    r.keyRelease(524);
    r.keyRelease(88);
    r.keyPress(38);
    Thread.sleep(15L);
    r.keyRelease(38);
    Thread.sleep(15L);
    r.keyPress(38);
    Thread.sleep(15L);
    r.keyRelease(38);
    Thread.sleep(15L);
    r.keyPress(39);
    Thread.sleep(15L);
    r.keyRelease(39);
    Thread.sleep(15L);
    r.keyPress(40);
    Thread.sleep(15L);
    r.keyRelease(40);
    Thread.sleep(15L);
    r.keyPress(40);
    Thread.sleep(15L);
    r.keyRelease(40);
    Thread.sleep(15L);
    r.keyPress(10);
    Thread.sleep(15L);
    r.keyRelease(10);
    Thread.sleep(15L);
  }
}