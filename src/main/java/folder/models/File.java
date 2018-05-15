package folder.models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {
    private String name;
    private String extension;
    private double size;
    private Folder Folder;
    private int id;

    public File(String name, String extension, double size,Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        Folder = folder;
    }

    public File() {
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Column(name="size")
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    public Folder getFolder() {
        return Folder;
    }

    public void setFolder(Folder folder) {
        Folder = folder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
