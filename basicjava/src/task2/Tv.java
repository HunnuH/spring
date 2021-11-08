package task2;
public class Tv {
   private String color ;
   private boolean power; 
   private int channel;
   
   public Tv() {
	   color = "black";
	   power = false;
	   channel = 0;
   }
   
   void power() { power = !power; }
   void channelUp() { ++channel;}
   void channelDown() { --channel;}
   
public String getColor() {
	return color;
   }
public void setColor(String color) {
	this.color = color;
   }
public boolean isPower() {
	return power;
   }
public void setPower(boolean power) {
	this.power = power;
   }
public int getChannel() {
	return channel;
   }
public void setChannel(int channel) {
	this.channel = channel;
   }
public void print() {
   	System.out.println("color:" +this.color+ " power:"+ this.power+ " channel:"+this.channel);
   }
}
