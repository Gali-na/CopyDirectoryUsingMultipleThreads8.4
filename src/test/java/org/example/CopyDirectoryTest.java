package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CopyDirectoryTest {

    @Test
    void copyFile_SetFilesAreNull_GetMessageAboutError() {
        String rezult = CopyDirectory.copyFile(null, null);
        String expected = "the folder was not copied, the address is incorrect";
        assertEquals(expected, rezult);
    }

    @Test
    void copyFile_SetNullInstedAdressFirstOfFiles_GetMessageAboutError() {
        File fileForCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        String rezult = CopyDirectory.copyFile(null, fileForCopy);
        String expected = "the folder was not copied, the address is incorrect";
        assertEquals(expected, rezult);
    }
    @Test
    void copyFile_SetNullInstedAdressSecondOfFiles_GetMessageAboutError() {
        File fileForCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        String rezult = CopyDirectory.copyFile( fileForCopy,null);
        String expected = "the folder was not copied, the address is incorrect";
        assertEquals(expected, rezult);
    }

    @Test
    void copyFile_OneOfFileHasWrongAdrres_GetMessageAboutError(){
        File fileForCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        File fileWhereCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\New");
        String rezult=CopyDirectory.copyFile(fileForCopy,fileWhereCopy);
        String expected = "folder not copied error occurred";
    }
    @Test
    void copyFile_AllAdressExsist_СopySuccessMessage(){
        File fileForCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        File fileWhereCopy = new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text");
        String rezult= CopyDirectory.copyFile(fileForCopy,fileWhereCopy);
        String expected = "folder copied successfully";
    }
}