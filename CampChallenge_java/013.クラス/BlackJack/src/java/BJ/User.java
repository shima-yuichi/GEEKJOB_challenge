/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author guest1Day
 */
public class User extends Human {
    
    public int open(){
        int total = 0;
        for(int o = 0;o<myCards.size();o++){
            if(11<=myCards.get(o)){
                total +=10;
            }
            else{
            total += myCards.get(o);
            }
        }
        return total;   
    }
    public boolean checkSum(){
        int total = 0;
        for(int o = 0;o<myCards.size();o++){
            if(11<=myCards.get(o)){
                total +=10;
            }
            else{
            total += myCards.get(o);
            }
        }
        if(total<=16){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public void setCard(ArrayList<Integer> set){
        for(int i = 0;i<set.size();i++){
            myCards.add(set.get(i));
        }
        
    }
}
