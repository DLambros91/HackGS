/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Harsh
 */
public class CSVReader {
    String pathToFile = "C:\\Users\\Harsh\\Documents\\GSProject\\HackGS\\JavaFXApplication1\\Data.csv";
    BufferedReader br = null;
    String line = "";
    String csvSplitBy = ",";
    
    public CSVReader(){
        //NULL Constructor
    }
    
    public String[][] read(){
      try{  
        int numEntries = 0;
        br = new BufferedReader(new FileReader(pathToFile));
        while( (line = br.readLine()) != null){
            numEntries++;
        }
        String[][] Data = new String[numEntries][5];
        br.close();
        br = new BufferedReader(new FileReader(pathToFile));
        int i = 0;
        while( (line = br.readLine()) != null){
            Data[i] = line.split(csvSplitBy);
            System.out.println(Data[i][0] + " " + Data[i][1] + " " + Data[i][2] + " " + Data[i][3] + " " + Data[i][4] + " "  );
            i++;
        }
        br.close();
        return Data;
      }
      catch(FileNotFoundException e){
          e.printStackTrace();
          return null;
      }
      catch(IOException i){
          i.printStackTrace();
          return null;
      }
      
    }
}
