package oop.poly;
public class KakaoSender extends Sender {
	int length;
	public KakaoSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void send() {
		System.out.println("카카오톡으로 전송하기");
	}
}

