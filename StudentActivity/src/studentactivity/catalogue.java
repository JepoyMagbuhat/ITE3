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
import java.util.Map;
import java.util.HashMap;


public class catalogue {
    private static final Map<String, Subject> proMap = new HashMap<>();
    
    static {
        proMap.put("Subject1", new Subject(Itp, "Infra", "uhtiuehf"));
        proMap.put("Subject2", new Subject(Ite, "ObjectOriented", "oidsghejg")); 
    }  
    public static Subject getSubject(String Subject){
    return proMap.get(Subject);
    }
    public void searchSubject(String Subject){

    }


}