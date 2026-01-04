import command.ExitCommand;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Archiver {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the full path of the zip archive.");
        Scanner scanner = new Scanner(System.in);
        String stringToZip = scanner.nextLine();
        Path pathToZip = Paths.get(stringToZip);
        ZipFileManager zfm = new ZipFileManager(pathToZip);

        System.out.println("Enter the full path of the file to be zipped.");
        String stringToZip2 = scanner.nextLine();
        Path pathToUnzip = Paths.get(stringToZip2);
        zfm.createZip(pathToUnzip);

        new ExitCommand().execute();
    }
}