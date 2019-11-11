package practiceTest;

import java.io.File;

public class fileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/Users/adhingra";
		
		File folder = new File(path);
		
		File files[] = folder.listFiles();
		
		for(File file : files) {
			System.out.println(file.getName());
			if(file.isDirectory()) {
				System.out.println(file.getName());
			}
		}

	}

}
