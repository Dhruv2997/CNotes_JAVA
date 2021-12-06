public class NoteH {
    private String name;
    private String notes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return notes;
    }

    public void setNumber(String notes) {
        this.notes = notes;
    }

    public NoteH() {
    }

    public NoteH(String name, String notes) {
        this.notes = notes;
        this.name = name;
    }

    public void show(String userName) {
        System.out.println (userName + "viewing" + this.name);
    }
    public String toString() {
        return "Name:" + name + ", Notes:" + notes;
    }
}