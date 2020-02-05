import java.util.Random;

public class Subscriber extends Thread{

  private MessageQueue mq;
  Random r;
  
  public Subscriber(MessageQueue mq){
    this.mq = mq;
    r = new Random();
  }
  
  public void run(){
    int i = 0;
    while(i<20){
      String s = mq.getMessage();
      System.out.print(getCurrentTime() + " Subscriber - ");
      if(s.equals(""){
        System.out.println("tried to read but no message...");
      }else{
        System.out.println("read \"" + s + "\"");
        i++;
      }
      Thread.sleep(r.nextFloat());
  }
}
  
  
