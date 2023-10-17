public class Student {
    private int id;
    private String name;
    private boolean statatus;

    public Student(int id, String name, boolean statatus) {
        this.id = id;
        this.name = name;
        this.statatus = statatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatatus() {
        return statatus;
    }

    public void setStatatus(boolean statatus) {
        this.statatus = statatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", statatus=" + statatus +
                '}';
    }
}
