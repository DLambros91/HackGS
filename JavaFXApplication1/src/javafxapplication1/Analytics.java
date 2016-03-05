/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.StringTokenizer;

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
        String[][] utags = usr.getTags(); // This is users priorities
        int size = tags.length;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < utags.length; j++){
                System.out.println("Comparison " + tags[i] + " "+ utags[j][0] + " " + utags[j][1]);
                if(tags[i].equals(utags[j][0])){
                    System.out.println("SUCCESSSSSSSSS");
                    priority += Integer.parseInt(utags[j][1]);
                }
            }
        }
        return (priority%11);
    }
    
    public String[][] EmailPriorities(){
        String[][] ET = usr.EmailAndTags; //Users Email Descriptions and Tags (unparsed)
        String[][] result = new String[ET.length][2];
        
        for(int i = 0; i < ET.length; i++){
            System.out.println("ETi1 :" + ET[i][1]);
            StringTokenizer st = new StringTokenizer(ET[i][1]);
            int count = 0;
            String[] token_tags = new String[st.countTokens()];
            while (st.hasMoreTokens()) {
                token_tags[count] = st.nextToken();
                count++;
            }
            result[i][0] = ET[i][0];
            result[i][1] = ""+analyze(token_tags);
        }
        return result;
    }
    
}
