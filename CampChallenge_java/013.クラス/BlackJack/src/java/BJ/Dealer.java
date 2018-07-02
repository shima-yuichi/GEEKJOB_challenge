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
class Dealer extends Human {
    
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
    
    protected ArrayList<Integer> cards = new ArrayList<Integer>();
    Dealer (){
        for(int j = 0; j < 4;j++){    
            for(int i = 1; i < 14;i++){
            cards.add(i);
            } 
        }
    }
    
    public ArrayList<Integer> deal(){
        ArrayList<Integer> drwcard = new ArrayList<Integer>();
        Random  rnd = new Random();
        int rd = rnd.nextInt(cards.size());
        
        drwcard.add( cards.get(rd));
        cards.remove(rd);
        
        rd = rnd.nextInt(cards.size());
        
        drwcard.add( cards.get(rd));
        cards.remove(rd);
        
        return drwcard;
    }
    
    public ArrayList<Integer> hit(){
        ArrayList<Integer> hitcard = new ArrayList<Integer>();
        Random  rnd = new Random();
        int rd2 = rnd.nextInt(cards.size());
        
        hitcard.add( cards.get(rd2));
        cards.remove(rd2);
        
        return hitcard;
    }
    
}
