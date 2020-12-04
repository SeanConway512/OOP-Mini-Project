//Technician.java

public class Technician {
    private String Name;
    private int ID;


 public Technician(String Name,int ID){
    SetName(Name);
    SetID(ID);
}
    public String getName() {
    return Name;
}
    public void SetID(int id) {
    this.ID = ID;
    }
    public int getID(){
    return ID;
    }
    public void SetName(String name) {
    this.Name = Name;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "ID: " + getID();


    }
}