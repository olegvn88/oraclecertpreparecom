package studyOCA.oracle_tasks.task0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App13 {
    public void copy(Path srcFile, Path destFile) {
        try {
            byte[] readBytes = Files.readAllBytes(srcFile);
            Files.write(destFile, readBytes);
        } catch (IOException e ) {
            System.err.println(e.toString());
        }
    }
}
