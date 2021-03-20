/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Su (Student ID: 101296632)
 */
public class DogShelterManager {
    int numDogs;    // to know how many dogs are added in the shelter
    int maxDogs;    // to give the size
    DogShelter[] shelterList;
    
    public DogShelterManager(int max){
        maxDogs = max;
        numDogs = 0;
        shelterList = new DogShelter[maxDogs];
    }

    public void addDog(DogShelter shelter, int dogId){
        Scanner keyboard = new Scanner(System.in);
        
        if(shelterList[numDogs] == null){   // to avoid nullPointerException
            shelter.setDogId(dogId);
            
            System.out.println("Please enter the Dog Name: ");
            String name = keyboard.nextLine();
            shelter.setName(name);
            
            System.out.println("Please enter the Dog Age: ");
            double age = keyboard.nextDouble();
            keyboard.nextLine();
            if(age < 0 && age > 25){
                System.out.println("You have entered invalid age.");
            }
            else{
                shelter.setAge(age);
            } 
            
            System.out.println("Please enter the Dog Breed: ");
            String breed = keyboard.nextLine();
            shelter.setBreed(breed);
            
            System.out.println("Please enter the Dog Gender: ");
            char sex = keyboard.next().charAt(0);
            shelter.setSex(sex);
            
            shelterList[numDogs] = shelter;
            shelterList[numDogs].getDogId();
            shelterList[numDogs].getName();
            shelterList[numDogs].getAge();
            shelterList[numDogs].getBreed();
            shelterList[numDogs].getSex();
        }
        else if(shelterList[numDogs].getDogId() == dogId){
            System.out.println("The Dog ID is already used in the shelter.");
        }else{
            shelter.setDogId(dogId);
            
            System.out.println("Please enter the Dog Name: ");
            String name = keyboard.nextLine();
            shelter.setName(name);
            
            System.out.println("Please enter the Dog Age: ");
            double age = keyboard.nextDouble();
            keyboard.nextLine();
            if(age < 0 && age > 25){
                System.out.println("You have entered invalid age.");
            }
            else{
                shelter.setAge(age);
            } 
            
            System.out.println("Please enter the Dog Breed: ");
            String breed = keyboard.nextLine();
            shelter.setBreed(breed);
            
            System.out.println("Please enter the Dog Gender: ");
            char sex = keyboard.next().charAt(0);
            shelter.setSex(sex);
            
            shelterList[numDogs] = shelter;
            shelterList[numDogs].getDogId();
            shelterList[numDogs].getName();
            shelterList[numDogs].getAge();
            shelterList[numDogs].getBreed();
            shelterList[numDogs].getSex();
        }
        String result = "";      // to display the information that user entered
        result = result + shelterList[numDogs];
        numDogs++; 
        System.out.println("\nnumDogs = " + numDogs);
        System.out.println(result + "\n");
    }
    
    public String showAllDogs(DogShelter shelter){
        System.out.println("numDogs = " + numDogs);
        shelterList = DogShelter.shelter;
        System.out.println(Arrays.toString(shelterList));
        String info = "List of all the dogs in the shelter are: \n";
        if(numDogs < 0){
            System.out.println("There is no dog in the shelter.");
        }else{
            int i = 0;
            do{
                info = info + shelterList[i].toString();
            }while(i < numDogs);
        }
        return info;
    }
    
    public String showAvailDogs(DogShelter shelter){
        String info = "List of all the available dogs in the shelter are: \n";
        for(int i = 0; i <= numDogs; i++){
            if(shelter.foundHome == false){
                info = info + shelter.toString();    
        }else{
                System.out.println("There is no dog in the shelter.");
            }
        }
        return info;
    }
    
    public String showDog(DogShelter shelter, int dId){
        String info;
        info = "The dog information with the Dog ID: " + dId + " is";
        for(int i = 0; i < numDogs; i++){
            if(shelterList[i].getDogId() == dId){
                info = info + shelter.toString();
            }else{
                info = info + " not found.";
            }
        }
        return info;
    }
    
    public boolean updateHome(DogShelter shelter, int dId){
        boolean checkHome = false;
        shelterList[numDogs] = shelter;
        for(int i = 0; i < numDogs; i++){
            if(shelterList[i].getDogId() == dId){
                shelterList[i].setFoundHome(true);
                checkHome = shelterList[i].isFoundHome();
                
                System.out.println("Result information is: \n\n");
                            System.out.println("Dog ID: " + shelterList[i].dogId);
                            System.out.println("Name: " + shelterList[i].name);
                            System.out.println("Age: " + shelterList[i].age);
                            System.out.println("Breed: " + shelterList[i].breed);
                            System.out.println("Sex: " + shelterList[i].sex);
                            System.out.println("Found Home: " + shelterList[i].foundHome);
            }
            else{
                checkHome = false;
                System.out.println("The dog with the Dog ID " + dId + "is not found.");
            }
        }
        return checkHome;
    }
    
}