package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    private List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void feedAll(){
        for(Dog d:dogs){
            d.feed();
        }
    }

    public Dog findByName(String dogName){
        for(Dog d:dogs){
            if(dogName.equals(d.getName())){
                return d;
            }
        }
        throw new IllegalArgumentException("No such dog!") ;
    }

    public void playWith(String dogName, int hours){
        Dog dog=findByName(dogName);
        dog.play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness){
        List<String> result =new ArrayList<>();
        for(Dog d:dogs){
            if(d.getHappiness()>minHappiness){
                result.add(d.getName());
            }
        }
        return result;
    }
}
