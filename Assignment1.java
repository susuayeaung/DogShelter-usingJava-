/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author Su (Student ID: 101296632)
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int dogId;

        System.out.println("\tWelcome to the Dog Shelter!!!");
        
        DogShelter shelterList = new DogShelter(10100, "dd", 2.0, "Husky", 'm');
        DogShelterManager dm = new DogShelterManager(5);
        boolean userInput = true;
            
        while(userInput == true){
            System.out.println("\nPlease enter\t1 for add dog\n\t\t2 for view all the dogs in the shelter\n\t\t3 for view all the availabe dogs in the shelter\n\t\t4 for any specific dog in the shelter\n\t\t5 for updating dog home status\n\t\t0 for exit\nThank you.");
            String input = keyboard.nextLine();
            switch(input){
                case "0":
                    userInput = false;
                    break;
                case "1":
                    System.out.println("Please enter the Dog ID: ");
                    dogId = keyboard.nextInt();
                    keyboard.nextLine();
                   
                    dm.addDog(shelterList, dogId);
                    
                    System.out.println("Is there anything you would like to do? Please enter Yes to proceed or No to exit: ");
                    String ans = keyboard.nextLine();
                    if(ans == "No"){
                        userInput = false;
                    }
                    break;                    
                case "2":
                    dm.showAllDogs(shelterList);
                    
                    System.out.println("Is there anything you would like to do? Please enter Yes to proceed or No to exit: ");
                    ans = keyboard.nextLine();
                    if(ans == "No"){
                        userInput = false;
                    }
                    break;
                case "3":
                    dm.showAvailDogs(shelterList);
                    
                    System.out.println("Is there anything you would like to do? Please enter Yes to proceed or No to exit: ");
                    ans = keyboard.nextLine();
                    if(ans == "No"){
                        userInput = false;
                    }
                    break;
                case "4":
                    System.out.println("Please enter the Dog ID you would like to check: ");
                    int dId = keyboard.nextInt();
                    
                    dm.showDog(shelterList, dId);
                    
                    System.out.println("Is there anything you would like to do? Please enter Yes to proceed or No to exit: ");
                    ans = keyboard.nextLine();
                    if(ans == "No"){
                        userInput = false;
                    }
                    break;
                case "5":
                    System.out.println("Please enter the Dog ID you would like to update home: ");
                    dId = keyboard.nextInt();
                    
                    dm.updateHome(shelterList, dId);
                    
                    System.out.println("Is there anything you would like to do? Please enter Yes to proceed or No to exit: ");
                    ans = keyboard.nextLine();
                    if(ans == "No"){
                        userInput = false;
                    }
                    break;
               
            } 
        }  
        System.out.println("\nThank you for visiting us.");
    }
}
