package com.epam.jonline.mod05.a01;

public class View {
	
	public static void printDirectory(Directory directory) {
        System.out.println(directory.getName());
        for (Directory dir : directory.getDirectoryList()) {
            System.out.println(dir.toString());
        }
        for (File fil : directory.getFileList()) {
            System.out.println(fil.toString());
        }

        System.out.println("-----------------------");
    }

}
