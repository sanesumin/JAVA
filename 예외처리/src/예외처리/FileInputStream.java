package 예외처리;

public class FileInputStream implements AutoCloseable{
	
	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
		
	}
}
