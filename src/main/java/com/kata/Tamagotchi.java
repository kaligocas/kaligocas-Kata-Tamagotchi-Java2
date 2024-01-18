package com.kata;

public class Tamagotchi {
    
    int mood = 4;
    int hunger = 4;
    int energy = 5;

    int hungriness = 5;
    int fullness = 5;
    int happiness = 5;
    int tiredness = 5;


    public Tamagotchi(){

    }
    public int getMood() {
        return mood;
    }
    public void setMood(int mood) {
        this.mood = mood;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public int getHungriness() {
        return hungriness;
    }
    public void setHungriness(int hungriness) {
        this.hungriness = hungriness;
    }
    public int getFullness() {
        return fullness;
    }
    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public void play(){
        happiness = happiness + 2;
        tiredness = tiredness + 2;
    }

    public void putToSleep(){
        tiredness = tiredness - 2;
    }

    public void makeItPoop(){
        fullness = fullness - 2;
    }

    public void timePasess(){
        tiredness = tiredness + 2;
        hungriness = hungriness + 2;
        happiness = happiness - 2;
    }

    public String sleep()
    {
         if (energy < 3) {
            return "(-_-)";
         }else if (energy ==0){
            return "(-_-) zZZ";
         }else {
            return ":-|";
         }
    }

    public int getHappiness() {
        return happiness;
    }
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public int getTiredness() {
        return tiredness;
    }
    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }


    

}
