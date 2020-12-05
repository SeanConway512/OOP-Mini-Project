//Lecturer.java

public class Lecturer {
    private String Name,Department;
    private int ID;


    public Lecturer(String Name, int ID,String Department) {
     setName(Name);
     setID(ID);
     setDepartment(Department);
    }

    public void setDepartment(String department) {this.Department =Department;}
    public String getDepartment(){ return Department;}
    public int getID() {return ID;}
    public void setID(int id) {this.ID = ID;}
    public String getName(){
        return Name;
    }
    public void setName(String name) {this.Name =Name;}

    @Override
    public String toString() {
        return "Lecturer{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID + '\'' +
                ", Department=" +
                '}';
    }
}