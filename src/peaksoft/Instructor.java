package peaksoft;

public class Instructor {
    private String name;
    private String groupName;

    public Instructor() {
    }

    public Instructor(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}


