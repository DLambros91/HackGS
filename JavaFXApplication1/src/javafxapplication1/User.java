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
    public String[][] EmailAndTags;
   
    public User(String n, String[][] EandT){
        Name = n;
        tagpriorities = new HashMap(100);
        EmailAndTags = EandT;
        this.addTag("tag1", 1);
        this.addTag("tag2", 2);
        this.addTag("tag3", 3);
        this.addTag("tag4", 4);
        this.addTag("tag5", 5);
        this.addTag("tag6", 6);
        this.addTag("tag7", 7);
        this.addTag("tag8", 8);
        this.addTag("tag9", 9);
        this.addTag("tag10", 10);
    }
    
    public void addTag(String key, int val){
        this.tagpriorities.put(key, val);
    }
    
    //Returns sorted list of tag priorities
    public String[][] getTags(){
        String[][] usertags = new String[tagpriorities.size()][2];
        int i = 0;
        Set<String> keys = tagpriorities.keySet();
        for(String key : keys){
               usertags[i][0] = key;
               usertags[i][1] = ""+tagpriorities.get(key);
               i++;
        }
        /*System.out.println("The number of tags for email: " + usertags[]);
        int j = 0;
        for(j = 0; j < i; j++){
            for(int k = 0; k < i; k++){
                if((Integer.getInteger(usertags[i][1])) < Integer.getInteger(usertags[j][1])){
                    System.out.println(j + "   " + k  + "\n");
                    String t1 = usertags[i][0];
                    String t2 = usertags[i][1];
                    usertags[i][0] = usertags[j][0];
                    usertags[i][1] = usertags[j][1];
                    usertags[j][0] = t1;
                    usertags[j][1] = t2;
                       
                }
            }
        }
        */
        //for(int l = 0; l < i; l++)
        
        return usertags;
    }
}
