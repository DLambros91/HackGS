/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Harsh
 */
public class User {
    public String Name;
    public HashMap<String, Integer> tagpriorities;
   
    public User(String n){
        Name = n;
        tagpriorities = new HashMap(100);
    }
    
    public void addTag(String key, int val){
        this.tagpriorities.put(key, val);
    }
    
    public String[][] getTags(){
        String[][] usertags = new String[tagpriorities.size()][2];
        int i = 0;
        Set<String> keys = tagpriorities.keySet();
        for(String key : keys){
               usertags[i][0] = key;
               usertags[i][1] = ""+tagpriorities.get(key);
               i++;
        }
        int j = 0;
        for(j = 0; j <= i; i++){
            for(int k = 0; k <= i; k++){
                if((Integer.getInteger(usertags[i][1])) < Integer.getInteger(usertags[j][1])){
                    String t1 = usertags[i][0];
                    String t2 = usertags[i][1];
                    usertags[i][0] = usertags[j][0];
                    usertags[i][1] = usertags[j][1];
                    usertags[j][0] = t1;
                    usertags[j][1] = t2;
                       
                }
            }
        }
        return usertags;
    }
}
