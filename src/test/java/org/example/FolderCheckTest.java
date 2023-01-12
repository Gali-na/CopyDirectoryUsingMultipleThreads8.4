package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FolderCheckTest {

    @Test
    void folderCheck_FileIsNull_GetFalse() {
        File file = null;
        assertEquals(false, FolderCheck.folderCheck(file));
    }

    @Test
    void folderCheck_FileIsNotDirectory_GetFalse() {
        File file = new File("txt.txt");
        assertEquals(false, FolderCheck.folderCheck(file));
    }

    @Test
    void folderCheck_FileIsDirectoryIsNotNull_GetFrue() {
        File file = new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text");
        assertEquals(true, FolderCheck.folderCheck(file));
    }

}