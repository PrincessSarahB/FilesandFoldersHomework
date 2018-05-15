import folder.db.DBHelper;
import folder.models.File;
import folder.models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {



        Folder folder1 = new Folder("Documents");
            DBHelper.save(folder1);

        Folder folder2 = new Folder("Stuff");
            DBHelper.save(folder2);

        File file1 = new File("words", ".txt", 1.2, folder1);
        DBHelper.save(file1);

        File file2 = new File("numbers", ".rb", 1.3, folder1);
        DBHelper.save(file2);

        File file3 = new File("miscellaneous", ".java", 3.2, folder2);
        DBHelper.save(file3);


            List<File> files = DBHelper.getAll(File.class);
            List<Folder> folders = DBHelper.getAll(Folder.class);

            file2.setName("numberwang");
            DBHelper.save(file2);

    }
}
