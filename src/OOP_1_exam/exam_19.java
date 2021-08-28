package OOP_1_exam;

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		this.isPowerOn =! false;
		
	}
	void volumeUp() {
		if(this.volume < this.MAX_VOLUME) {
			this.volume = volume++;
		}
		
		
	}
	void volumeDown() {
		if(this.volume > this.MAX_VOLUME) {
		this.volume = volume--;
		}
		
	}
	void channelUp() {
		this.channel= ++channel;
		if(channel==MAX_CHANNEL+1) {
			channel = MIN_CHANNEL;
		}
		
	}
	void channelDown() {
		this.channel = --channel;
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		
	}

}
class exam_19 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		
	}
}
