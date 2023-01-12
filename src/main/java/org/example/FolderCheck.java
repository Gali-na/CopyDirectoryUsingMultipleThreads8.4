package org.example;

import java.io.File;

public class FolderCheck {
    public static Boolean folderCheck(File file) {
        if (file == null) {
            return false;
        }
        if (!file.isDirectory()) {
            return false;
        }
        return true;
    }
}
