import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileManager {

    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        try (InputStream is = Files.newInputStream(source);
             ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zipFile));
        ) {
            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
            zos.putNextEntry(zipEntry);
            while (is.available() > 0) {
                zos.write(is.read());
            }
            zos.closeEntry();
        }
    }
}
