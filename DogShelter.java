/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


/**
 *
 * @author Su (Student ID: 101296632)
 */
public class DogShelter {

    static DogShelter[] shelter;
    public int dogId;
    public String name;
    public double age;
    public String breed;
    public char sex;
    public boolean foundHome = false;
    
    public DogShelter(int dogId, String name, double age, String breed, char sex){
            this.dogId = dogId;
            this.name = name;
            this.age = age;
            this.breed = breed;
            this.sex = sex;
   }
    
    public DogShelter(){
        dogId = 10100;
        name = "dd";
        age = 2.0;
        breed = "Husky";
        sex = 'm';
        foundHome = false;
    }

    public int getDogId() {
        return dogId;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public char getSex() {
        return sex;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        if(age < 0){
            System.out.println("Invalid Age");
            System.exit(0);
        }else{
           this.age = age;
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setFoundHome(boolean foundHome) {
        this.foundHome = foundHome;
    }

    
    public boolean isFoundHome() {
        return foundHome;
    }
    
    @Override
    public String toString(){
        
        return "Dog ID: " + dogId + 
                "\t Name: " + name +
                "\t Age: " + age + 
                "\t Breed: " + breed + 
                "\t Sex: " + sex +
                "\t Found Home: " + foundHome;
       
    }

}