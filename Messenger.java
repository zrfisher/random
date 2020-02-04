import java.util.Random;

public class Messenger extends Thread {
private MessageQueue mq;
Random r;

public Messenger(MessageQueue mq){
  this.mq = mq;
  Random r = new Random();
}

public void run(){
  for(int i = 0; i<20; i++){
    String s = "Message" + i;
    mq.addMessage(s);
    System.out.prinln(getCurrentTime() + " Messenger - insert \"" + s + "\"");
    Thread.sleep(r.nextFloat());
  }


}
