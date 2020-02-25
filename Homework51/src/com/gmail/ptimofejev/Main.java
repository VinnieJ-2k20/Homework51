package com.gmail.ptimofejev;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		MyFileFilter mff1 = new MyFileFilter("txt");
		
		File sourceFolder = new File("source");
		File destinationFolder = new File("destination");
		
		File[] toCopy = sourceFolder.listFiles(mff1);
		
		for (File target : toCopy) {
			File destination = new File(destinationFolder.getName() + "/" + target.getName());
			try {
				FileService.fileCopy(target, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
