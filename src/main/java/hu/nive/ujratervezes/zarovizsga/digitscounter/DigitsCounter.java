package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {

    int getCountOfDigits(String s){
        if (s == null || s.length()==0) return 0;
        List<Character> cl =new ArrayList<>();
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<s.length(); i++){
            Character c= s.charAt(i);
            if(Character.isDigit(c) && !cl.contains(c)){
                cl.add(c);
            }
        }
        return cl.size();
    }
}
