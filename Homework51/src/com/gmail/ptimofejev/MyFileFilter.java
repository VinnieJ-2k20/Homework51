package com.gmail.ptimofejev;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
	private String name;

	public MyFileFilter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return checkExt(ext);
	}
	
	public boolean checkExt (String ext) {
		if (name.equals(ext)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "MyFileFilter [name=" + name + "]";
	}

}
