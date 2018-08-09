package interfaceex.doit.today;

public interface RemoteControl {
	//���
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	
	//�߻� �޼ҵ�
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	
	//����(static) �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	
	
	//����Ʈ(default)�޼ҵ�:���� ������� �ۼ�����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
}
