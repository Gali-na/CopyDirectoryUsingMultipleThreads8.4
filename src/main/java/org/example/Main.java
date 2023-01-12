package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File fileForCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        File fileWhereCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text");
        CopyDirectory.copyFile(fileForCopy,fileWhereCopy);
    }

}

