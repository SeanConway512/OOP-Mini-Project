//Lecturer.java

public class Lecturer {
    private String Name;
    private int ID;

    public Lecturer(String Name, int ID) {
     setName(Name);
     setID(ID);
    }

    public int getID() {
        return ID;
    }
    public void setID(int id) {
    }
    public String getName(){
        return Name;
    }
    public void setName(String name) {
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID +
                '}';
    }
}