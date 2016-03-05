/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Harsh
 */
public class Analytics {

    public User usr;
    
    public Analytics(User U){
        usr = U;
    }
    
    public int analyze(String[] tags){
        int priority = 0;
        String[][] utags = usr.getTags();
        int size = tags.length;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < utags.length; j++){
                if(tags[i] == utags[j][0]){
                    priority += Integer.getInteger(utags[j][1]);
                }
            }
        }
        return (priority%11);
    }
    
    public String[][] EmailPriorities(){
        String[][] ET = usr.EmailAndTags; //Users Email Descriptions and Tags (unparsed)
        String[][] result = new String[ET.length][2];
        for(int i = 0; i < ET.length; i++){
            String[] emailtags = ET[i][0].split(" "); //Parsed Tags
            result[i][0] = ET[i][0];
            result[i][1] = ""+analyze(emailtags);
        }
        return result;
    }
    
}
