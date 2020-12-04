//Employee.java

public class Employee {
    private String Name;
    private int ID;
    public Address address;

    public Employee(String Name, int id, Address address) {
        setName(Name);
        setId(ID);
        setAddress(address);
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name) {
        this.Name = Name;
    }
    public void setId(int id) {
    this.ID = ID;
    }
    public int getID() {
        return ID;
    }
}
