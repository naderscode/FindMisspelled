/**Program5.java
Written by Nader K
Date 4/15/06
FindMispelledWords
*/

import java.io.*;
import java.util.*;


public class Program5
{
	public static void main(String [] args) 
	{
      try
          {
             BufferedReader brDict = new BufferedReader(new FileReader("words.txt"));
             BufferedReader brStory = new BufferedReader(new FileReader("story.txt"));
                    
             TreeSet<String> dict = new TreeSet<String>();
                
            System.out.println("Misspelled words: "); 
                
                String dline = brDict.readLine();
                while(dline != null)
                {
                        StringTokenizer sts = new StringTokenizer(dline);
                        
                        while(sts.hasMoreTokens())
                        {
                            String word = sts.nextToken().toLowerCase().trim();
                                            
                            if(!dict.contains(word))
                               dict.add(word);
                        }//inner loop
                        
                         dline = brDict.readLine();
                             
                }//outer loop
                
                /** print the TreeSet elements */
            //	System.out.println(dict +"\n");
        
                String sline = brStory.readLine();
                while(sline != null)
                {
                        StringTokenizer s = new StringTokenizer(sline);
                        
                        while(s.hasMoreTokens())
                        {
                            String wordToCheck = s.nextToken().toLowerCase().trim();
                                            
                            if(!dict.contains(wordToCheck))
                            {
                                System.out.println(wordToCheck);
                            }
                         }//inner loop
                        
                         sline = brStory.readLine();
                             
                }//outer loop
    
          
          }//end try
          catch (IOException e)
          {
             System.out.println("Error: " + e);
          }
            
   }//end main
	

}//end class
