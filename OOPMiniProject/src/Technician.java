//Technician.java

public class Technician {
    private String Name,FOE;
    private int ID;


 public Technician(String Name,int ID,String FOE){
    SetName(Name);
    SetID(ID);
    SetFOE(FOE);
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
    public String getFOE(){return FOE;}
    public void SetFOE(String FOE){this.FOE = FOE;}
    @Override
    public String toString() {
        return "Name: " + getName() + "ID: " + getID() + "FOE: "+ getFOE();


    }
}