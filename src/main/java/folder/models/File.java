package folder.models;

public class File {
    private String name;
    private String extension;
    private double size;
    private Folder Folder;
    private int id;

    public File(String name, String extension, double size, folder.models.Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        Folder = folder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public folder.models.Folder getFolder() {
        return Folder;
    }

    public void setFolder(folder.models.Folder folder) {
        Folder = folder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
