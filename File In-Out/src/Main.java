import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		
		FileInOutDemo fiod = new FileInOutDemo();
		fiod.initialiseFile();
		
		try {
			fiod.processFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		fiod.closeFile();
	}

}
