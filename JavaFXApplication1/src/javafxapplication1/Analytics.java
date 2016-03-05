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
    String[] tags;
    
    public Analytics(User U, String[] tgs){
        usr = U;
        tags = tgs;
    }
    
    public int analyze(){
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
    
}
