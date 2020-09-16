/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise8;
import java.util.*;
import static labexercise8.second.getSecondMostFreq;


/**
 *
 * @author ARUMUGASAMY
 */
public class secondsreq {
    public static void main(String[] args) {
      String str = "successes"; 
      char res = getSecondMostFreq(str); 
      if (res != '\0') 
         System.out.println("Second most frequent char"+ 
                                       " is " + res); 
      else
         System.out.println("No second most frequent"+ 
                                       "character"); 
    } 
}
class second
{
   static char getSecondMostFreq(String str) 
    {   
        int[] count = new int[256];
        int i; 
        for (i=0; i< str.length(); i++) 
            (count[str.charAt(i)])++; 
        int first = 0, second = 0; 
        for (i = 0; i < 256; i++) 
        { 

            if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            }          
            else if (count[i] > count[second] && 
                     count[i] != count[first]) 
                second = i; 
        } 
       
        return (char)second; 
    }  
}        
        
    

    