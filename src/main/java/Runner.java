import folder.db.DBFolder;
import folder.db.DBHelper;
import folder.db.DBOwner;
import folder.models.File;
import folder.models.Folder;
import folder.models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner owner1 = new Owner("Sarah", "SarahB28");
            DBHelper.save(owner1);

        Folder folder1 = new Folder("Documents", owner1);
            DBHelper.save(folder1);

        Folder folder2 = new Folder("Stuff", owner1);
            DBHelper.save(folder2);

        File file1 = new File("words", ".txt", 1.2, folder1);
        DBHelper.save(file1);

        File file2 = new File("numbers", ".rb", 1.3, folder1);
        DBHelper.save(file2);

        File file3 = new File("miscellaneous", ".java", 3.2, folder2);
        DBHelper.save(file3);

        DBHelper.delete(file3);
            List<File> files = DBHelper.getAll(File.class);
            List<Folder> folders = DBHelper.getAll(Folder.class);

            file2.setName("numberwang");
            DBHelper.save(file2);

            List<File> filesInFolder = DBFolder.getFilesInFolder(folder1);
            List<Folder> ownersFolders = DBOwner.getOwnersFolders(owner1);



    }
}
