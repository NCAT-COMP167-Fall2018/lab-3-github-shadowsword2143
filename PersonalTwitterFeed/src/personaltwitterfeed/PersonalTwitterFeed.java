/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaltwitterfeed;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CCannon
 */
public class PersonalTwitterFeed {

    private static int MAX_NUMBER_TWEETS = 200;
    
    /**
     * @param args the command line arguments
     */
  
    public static String Date(){
          String time = " dd MMMMM yyyy HH:mm:ss";
      SimpleDateFormat simpleDateFormat = 
              new SimpleDateFormat(time);
      String stamp = simpleDateFormat.format(new Date());
       return stamp; 

    }
    public static void main(String[] args) {
      
        String[] tweets = new String[MAX_NUMBER_TWEETS];
         Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to your personal Twitter!");
        System.out.println("What's your name, tweeter?");
        
        String tweeterName = keyboard.nextLine();
        
        System.out.println("Nice to meet you " + tweeterName + "!");
        System.out.println("Enter your tweets and I will add them to your timeline!");
        newTweet(tweets, tweeterName);
      
    }
     public static void newTweet(String[] tweets,String tweeterName){
          Scanner keyboard = new Scanner(System.in);
           tweets = new String[MAX_NUMBER_TWEETS];
            int numTweets = 0;
        
        while(numTweets < (MAX_NUMBER_TWEETS - 1)) {

            tweets[numTweets] = keyboard.nextLine();
            numTweets++;
            
            System.out.println(tweeterName + "'s Personal Twitter Feed:");
            for(int i = 0; i < numTweets; i++) {
                System.out.println("- " + tweets[i] + Date());
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            if(numTweets < (MAX_NUMBER_TWEETS - 1))
                System.out.println("Enter your next tweet:");
        }
        
        System.out.println("Your twitter feed is full");
 

    }


}
 