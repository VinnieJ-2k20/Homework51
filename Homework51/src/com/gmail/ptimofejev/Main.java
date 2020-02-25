package com.gmail.ptimofejev;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		MyFileFilter mff1 = new MyFileFilter("docx");
		
		File sourceFolder = new File("source");
		File destinationFolder = new File("destination");
		System.out.println(destinationFolder.mkdir());
		
		File[] toCopy = sourceFolder.listFiles(mff1);
		int files = 0;
		
		for (File target : toCopy) {
			File destination = new File(destinationFolder.getName() + "/" + target.getName());
			
			try {
				FileService.fileCopy(target, destination);
				files++;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(files + " files successfully copied to destination folder.");
	}
}
