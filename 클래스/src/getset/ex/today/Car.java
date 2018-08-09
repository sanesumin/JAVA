package getset.ex.today;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { 
		//double km = speed*1.6;
		return speed;
	}
	
	public void setSpeed(int speed) {//명명규칙:set+필드이름
		if(speed <0) {
			this.speed	= 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { //필드 타입이 true,false일 경우 is로 시작
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
