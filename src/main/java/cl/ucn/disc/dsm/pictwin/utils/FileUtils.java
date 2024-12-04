package cl.ucn.disc.dsm.pictwin.utils;

import cl.ucn.disc.dsm.pictwin.Main;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

//the file utilities
@UtilityClass
public class FileUtils {

    //Read all the bytes from a file
    public byte[] readAllBytes(File file){
        try{
            return Files.readAllBytes(file.toPath());
        }catch (IOException e){
            throw new RuntimeException("Can't read the file",e);
        }
    }

    //Get the File from the resources
    public static File getResourceFile(@NonNull String name){
        return new File(
                Objects.requireNonNull(Main.class.getClassLoader().getResource(name)).getFile());
    }
}
