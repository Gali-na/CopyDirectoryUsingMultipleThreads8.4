package org.example;

import java.io.*;

public class CopyDirectory {
    public static String copyFile(File fileForCopy, File fileWhereCopy) {
        String rezult = "the folder was not copied, the address is incorrect";
        if (FolderCheck.folderCheck(fileForCopy) && FolderCheck.folderCheck(fileWhereCopy)) {
            String absoluteNameFileWhereCopyFile = String.valueOf(fileWhereCopy.getAbsoluteFile());
            File[] files = fileForCopy.listFiles();
            for (File fileCurrent : files) {
                if (fileCurrent.isFile()) {
                    try (InputStream reder = new BufferedInputStream(new FileInputStream(new File(String.valueOf(fileCurrent.getAbsoluteFile()))));
                         OutputStream writer = new BufferedOutputStream(new FileOutputStream(new File(fileWhereCopy.getAbsoluteFile() + "\\" + fileCurrent.getName())))) {
                        byte[] arryByte = new byte[1024];
                        while (reder.read(arryByte) > -1) {
                            writer.write(arryByte);
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        return "folder not copied error occurred";
                    }
                }
                if (fileCurrent.isDirectory()) {
                    absoluteNameFileWhereCopyFile = absoluteNameFileWhereCopyFile + "\\" + fileCurrent.getName();
                    File file = new File(absoluteNameFileWhereCopyFile);
                    file.mkdir();
                    copyFile(fileCurrent.getAbsoluteFile(), file);
                }
            }
            rezult = "folder copied successfully";
        }
        return rezult;
    }
}
