package getset.ex.today;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getSpeed() { 
		//double km = speed*1.6;
		return speed;
	}
	
	public void setSpeed(int speed) {//����Ģ:set+�ʵ��̸�
		if(speed <0) {
			this.speed	= 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { //�ʵ� Ÿ���� true,false�� ��� is�� ����
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
