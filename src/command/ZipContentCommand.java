package command;

import utils.ConsoleHelper;
import utils.FileProperties;
import utils.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");
        ZipFileManager zipFileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Содержимое архива:");
        List<FileProperties> filesList = zipFileManager.getFilesList();
        for (FileProperties fp: filesList) {
            ConsoleHelper.writeMessage(fp.toString());
        }
        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
