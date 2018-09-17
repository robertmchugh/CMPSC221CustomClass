//Robert McHugh

import java.util.Scanner;
import java.util.Random;


public class Main {
  public static void main(String[] args) 
  {
    chatbot Leonidas = new chatbot();
    Scanner scnr1 = new Scanner (System.in);
    String userInput;
    
    System.out.println("Say Hello to Leonidas v1.1! If you'd like to end your conversation, say Goodbye.");
    System.out.println("If you'd like to know my settings, say Settings. (Since its the first version, it consumes a lot of battery.)");
    System.out.print("You: ");
    userInput = scnr1.nextLine();

      if (userInput.equals("Settings"))
       {
        System.out.println(Leonidas.settings1());
        System.out.println(Leonidas.settings2());
      }
      while (userInput.equals("Goodbye"))
      {
        System.out.print("Already? Goodbye!");
        break;
      }
      while (!userInput.equals("Goodbye")) {
          Leonidas.sayHello();
          break;
      }
    
    userInput = scnr1.nextLine();
    if (userInput.equals("Goodbye")) {
      System.out.print("Goodbye! It was nice talking to you.");
    }
    while (!userInput.equals("Goodbye")) {
    Leonidas.firstResponse(userInput);
    break;
    }
    
    userInput = scnr1.nextLine();
      if (userInput.equals("Goodbye")) {
       System.out.print("Goodbye! It was nice talking to you.");
      }
      else {
        Leonidas.secondResponse(userInput);
      }
      
    userInput = scnr1.nextLine();
      if (userInput.equals("Goodbye")) {
       System.out.print("Goodbye! It was nice talking to you.");
      }
      else {
        Leonidas.thirdResponse(userInput);
      }
    

  }
}

class chatbot 
{
  
  Random rand = new Random();
  private String name = "Leonidas";
  private String myAccent = "English";
  private int myVolume = 5;
  private double myVersion = 1.1;

  public String settings1()
  {
    System.out.print("Name: " + name);
    System.out.println(" V" + myVersion);
    System.out.print("My Accent: ");
    return myAccent;
  }

  public int settings2()
  {
    System.out.print("Volume: ");
    return myVolume;
  }
  
    
  

  public void sayHello()
  {
    System.out.print("Leonidas: ");
    System.out.println("Hi there!");
    System.out.print("Leonidas: ");
    System.out.println("Tell me something about yourself.");
    System.out.print("You: ");
  }

  public void firstResponse(String input)
  {
    boolean loop = true;
    while (loop) {
    if (input.equals("Goodbye")) {
      System.out.print("Goodbye! It was nice talking to you.");
      break;
    }
    else {
    System.out.print("Leonidas: ");
    System.out.println("That is extremely interesting!");
    System.out.print("Leonidas: ");
    System.out.println("Is there anything else you'd like to tell me?");
    System.out.print("You: ");
    break;
      }
    }
  }

  public void secondResponse(String input)
  {
    int randNum = rand.nextInt(3);
    
  	if (input.equals("Goodbye")) {
  	System.out.println("Goodbye! It was nice talking to you.");
  	}
  	else{
    switch (randNum) {
      case 1:
        System.out.print("Leonidas: ");
        System.out.println("That is very cool.");
        System.out.print("Leonidas: ");
        System.out.println("Where are you from?");
        System.out.print("You: ");
        break;
      case 2:
        System.out.print("Leonidas: ");
        System.out.println("Wow I would've never guessed!");
        System.out.print("Leonidas: ");
        System.out.println("Do you own any pets?");
        System.out.print("You: ");
        break;
        case 3:
        System.out.print("Leonidas: ");
        System.out.println("That's pretty nice!");
        System.out.print("Leonidas: ");
        System.out.print("What is your favorite subject in school?");
        System.out.print("You: ");
        break;
        }
    }
    
  }
  
  public void thirdResponse(String inputTwo) {
    boolean loop2 = true;
    while (loop2) {
    if (inputTwo.equals("Goodbye")) {
      System.out.print("Goodbye! It was nice talking to you.");
      break;
    }
    else {
      System.out.print("Leonidas: ");
      System.out.println("You are something else!");
      System.out.print("Leonidas: ");
      System.out.println("My battery is low, I must go. Stay in touch!");
      break;
      }
    }
  }
    
}
