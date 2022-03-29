package com.epam.jonline.mod05.a01;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String name;
	private List<Directory> directoryList = new ArrayList<>();
	private List<File> fileList = new ArrayList<>();

	public Directory() {
	}

	public Directory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Directory> getDirectoryList() {
		return directoryList;
	}

	public void setDirectoryList(List<Directory> directoryList) {
		this.directoryList = directoryList;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	public void addDirectory(Directory directory) {
		directoryList.add(directory);
	}

	public void addFile(File file) {
		fileList.add(file);
	}

	public void removeDirectory(String name) {
		for (Directory directory : directoryList) {
			if (directory.getName().equals(name)) {
				directoryList.remove(directory);
				break;
			}

		}
	}

	public void removeFile(String name) {
		for (File file : fileList) {
			if (file.getName().equals(name)) {
				fileList.remove(file);
				break;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((name == null) ? 0 : name.hashCode());
		result = result * prime + ((directoryList == null) ? 0 : directoryList.hashCode());
		result = result * prime + ((fileList == null) ? 0 : fileList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (directoryList == null) {
			if (other.directoryList != null)
				return false;
		} else if (!directoryList.equals(other.directoryList))
			return false;
		if (fileList == null) {
			if (other.fileList != null)
				return false;
		} else if (!fileList.equals(other.fileList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Name directory: " + name;
	}
}
