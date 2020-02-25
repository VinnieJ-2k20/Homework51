package com.gmail.ptimofejev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {
	public static void fileCopy(File in, File out) throws IOException {
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
			byte[] buffer = new byte[10_000_000];
			int readByte = 0;
			for(;(readByte = is.read(buffer)) > 0;) {
				os.write(buffer, 0, readByte);
			}
		} catch (IOException e) {
			throw e;
		}
	}
}
