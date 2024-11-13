
package group.lab_07_ex_01;


public class Staff {
      private String name;
    private int id;
    
  
    public Staff(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    
    public void displayInfo() {
        System.out.println("Staff ID: " + id + ", Name: " + name);
    }
}
