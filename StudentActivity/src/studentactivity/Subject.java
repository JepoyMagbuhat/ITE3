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
public class Subject {
    private String SubjCode,  Name, Description;

    public Subject(String SubjCode, String Name, String Description) {
        this.SubjCode = SubjCode;
        this.Name = Name;
        this.Description = Description;
    }



    public String getSubjCode() {
        return SubjCode;
    }
    public void setSubjCode(String SubjCode) {
        this.SubjCode = SubjCode;
    }

    public String getName() {
        return Name;
    }
    public void setNAme(String Name) {
        this.Name = Name;
    }
    
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Name;
    }
    
    @Override
    public String toString() {
        return "Subject{" + "SubjCode=" + SubjCode + ", Name=" + Name + ", Description=" + Description + '}';
    }
  

    
 
}
