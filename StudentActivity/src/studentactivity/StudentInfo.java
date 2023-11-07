/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentactivity;

/**
 *
 * @author sbc-student
 */
public class StudentInfo{
    private int ID;
    String Name, Address;

    public StudentInfo(int ID, String Name, String Address) {
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "StudentInfo{" + "ID=" + ID + ", Name=" + Name + ", Address=" + Address + '}';
    }

   
}

    

  
    


   
    

