import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Type in the full path to zip the file.");
        Scanner scanner = new Scanner(System.in);
        String stringToZip = scanner.nextLine();
        Path pathToZip = Paths.get(stringToZip);
        ZipFileManager zfm = new ZipFileManager(pathToZip);

        System.out.println("Type in the full path to unzip the file.");
        String stringToUnzip = scanner.nextLine();
        Path pathToUnzip = Paths.get(stringToUnzip);
        zfm.createZip(pathToUnzip);
    }
}