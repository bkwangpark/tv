package tv;

public class TV {
	private int channel=7;
	private int volume=20;
	private boolean power=false;
	
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void volumeUp(){
		volume++;
	}
	public void volumeDown(){
		volume--;
	}
	public void powerOn(){
		power=true;
	}
	public void powerOff(){
		power=false;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
}
